package QQ.QQServer;

import QQ.Message;
import QQ.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 *
 */
public class ServerConnectClientThread extends Thread{
    private final Socket socket ;
    private final String userID ;
    private final ObjectInputStream ois;
    private final ObjectOutputStream oos;

    public ServerConnectClientThread(Socket socket, String userID,ObjectOutputStream oos,ObjectInputStream ois) {
        this.socket = socket;
        this.userID = userID;
        this.oos = oos;
        this.ois = ois;
    }
    //得到该线程的输出流
    public ObjectInputStream getOis() {
        return ois;
    }
    //得到该线程的输入流
    public ObjectOutputStream getOos() {
        return oos;
    }

    @Override
    public void run() {
        boolean loop = true;
        while (loop){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("延时出错！");
            }

            System.out.println(userID+"服务器与客户端保持通信");
            try {
                Message message =(Message) ois.readObject();
                switch (message.getMessageType()){
                    case MESSAGE_GET_ONLINE_FRIEND:
                        System.out.println(message.getSender() +"需要在线用户列表");
                        String onlineUser = ManageClientThreads.getOnlineUser();
                        Message messageReturn = new Message();
                        messageReturn.setContent(onlineUser);
                        messageReturn.setMessageType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                        messageReturn.setGetter(message.getSender());
                        oos.writeObject(messageReturn);
                        break;
                    case MESSAGE_CLIENT_EXIT:
                        System.out.println(message.getSender()+ "用户需要退出服务");
                        ManageClientThreads.removeThread(userID);
                        loop = false;
                        break;
                    case MESSAGE_PRIVATE_CHAT:
                        System.out.println(message.getSender()+"和"+message.getGetter()+"需要私聊");
                        ManageClientThreads.privateChat(message);
                        System.out.println(message.getSender()+"和"+message.getGetter()+"私聊成功！");
                        break;
                    case MESSAGE_GROUP_CHAT:
                        System.out.println(message.getSender()+"需要要群发消息");
                        ManageClientThreads.groupChat(message);
                        System.out.println(message.getSender()+"群发成功！");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
