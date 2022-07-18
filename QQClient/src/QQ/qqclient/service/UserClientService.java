package QQ.qqclient.service;

import QQ.Message;
import QQ.MessageType;
import QQ.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 * 该类需要完成用户登录验证的功能
 */
public class UserClientService {

    private final User user = new User();//持有一个user对象
    Message message;
    private Socket socket;


    public boolean checkUser(String userID, String password){
        user.setUserID(userID);
        user.setPasswd(password);
        try {
            socket = new Socket(InetAddress.getLocalHost(),9999);//客户端连接服务器
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user);//将user对象进行包装发送发送过去
            //从服务器接收回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message message = (Message) ois.readObject();
            if (message.getMessageType() == MessageType.MESSAGE_LOGIN_SUCCEED){
                //准备创建一个线程
                ClientConnectServerThread ccst = new ClientConnectServerThread(socket,oos,ois);
                ccst.start();
                //TODO 将线程放到集合中进行管理
                MangeClientConnectServerThread.addClientConnectServerThread(userID,ccst);
                return true;
            }else {
                //如果登录失败，关闭Socket
                socket.close();
                oos.close();
                ois.close();
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    //向服务器端请求在线用户列表
    public void onlineFriendList(){
        message = new Message();
        message.setSender(user.getUserID());
        message.setMessageType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        try {
            ObjectOutputStream oos = MangeClientConnectServerThread.getClientConnectServerThread(user.getUserID()).getOos();//拿到线程里面的socket并得到输出流
            oos.writeObject(message);
            Thread.sleep(1000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    //退出用户服务
    public void logOut(){
        message = new Message();
        message.setSender(user.getUserID());
        message.setMessageType(MessageType.MESSAGE_CLIENT_EXIT);

            ObjectOutputStream oos =
                    MangeClientConnectServerThread.getClientConnectServerThread(user.getUserID()).getOos();
        try {
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("关闭线程IO错误");
        }
        System.out.println(user.getUserID()+"退出了线程");

    }
    //私聊的方法
    public void privateChat(String getterID,String content){
        message = new Message();
        message.setSender(user.getUserID());
        message.setGetter(getterID);
        message.setContent(content);
        message.setSenTime(new Date().toString());
        message.setMessageType(MessageType.MESSAGE_PRIVATE_CHAT);

            ObjectOutputStream oos =
                    MangeClientConnectServerThread.getClientConnectServerThread(user.getUserID()).getOos();
        try {
            oos.writeObject(message);
            Thread.sleep(1000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }

    /**
     *群发消息方法
     * @param content 群发内容
     */
    public void groupChat(String content){
        Message message = new Message();
        message.setSender(user.getUserID());
        message.setContent(content);
        message.setSenTime(new Date().toString());
        message.setMessageType(MessageType.MESSAGE_GROUP_CHAT);
            ObjectOutputStream oos =
                    MangeClientConnectServerThread.getClientConnectServerThread(user.getUserID()).getOos();
        try {
            oos.writeObject(message);
            Thread.sleep(1000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("群发成功！");

    }
}
