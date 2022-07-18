package QQ.QQServer;

import QQ.Message;
import QQ.MessageType;

import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Set;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 * 该类用于管理和客户端通讯的线程
 */
public class ManageClientThreads {
    private static Message getMessage;
    private static Message returnMessage;
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    public static void addClienThread(String userID, ServerConnectClientThread scct) {
        hm.put(userID, scct);
    }

    public static ServerConnectClientThread getServerConnectClientThread(String userID) {
        return hm.get(userID);
    }


    //从集合中移除某个线程
    public static void removeThread(String userID) {
        hm.remove(userID);
    }


    //返回在线用户列表
    public static String getOnlineUser() {
        Set<String> strings = hm.keySet();
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : strings) {
            stringBuffer.append(s).append(" ");
        }
        return stringBuffer.toString();
    }

    public static void privateChat(Message message) {
        getMessage = message;
        returnMessage = new Message();
        returnMessage.setMessageType(MessageType.MESSAGE_PRIVATE_CHAT);
        returnMessage.setContent(message.getContent());
        returnMessage.setSender(message.getSender());
        returnMessage.setSenTime(message.getSenTime());
        returnMessage.setGetter(message.getGetter());
        ServerConnectClientThread getThread = hm.get(getMessage.getGetter());//得到消息的线程
        try {
            getThread.getOos().writeObject(returnMessage);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("privateChat方法IO流错误！");
        }
    }

    public static void groupChat(Message message){
        returnMessage = new Message();
        String sender = message.getSender();
        returnMessage.setMessageType(MessageType.MESSAGE_GROUP_CHAT);
        returnMessage.setContent(message.getContent());
        returnMessage.setSender(sender);
        returnMessage.setSenTime(message.getSenTime());

        Set<String> userIDs = hm.keySet();
        for (String userID :
                userIDs) {
            if (!userID.equals(sender)) {
                try {
                    hm.get(userID).getOos().writeObject(message);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("群聊IO异常！");
                }
            }

        }

    }

    public static void sendFile(Message message){
        returnMessage = message;
        ServerConnectClientThread scct = getServerConnectClientThread(message.getGetter());
        try {
            scct.getOos().writeObject(returnMessage);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("发送文件异常！");
        }

    }

    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }
}
