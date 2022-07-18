package QQ.QQServer;

import QQ.Message;
import QQ.MessageType;
import QQ.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 */
public class Server {
    private ServerSocket serverSocket = null;
    private static HashMap<String ,User > validUsers = new HashMap<>();

    {//初始化validUser
        validUsers.put("100",new User("100","123456"));
        validUsers.put("200",new User("200","123456"));
        validUsers.put("300",new User("300","123456"));
        validUsers.put("紫霞仙子",new User("紫霞仙子","123456"));
        validUsers.put("至尊宝",new User("至尊宝","123456"));
        validUsers.put("小舒",new User("小舒","123456"));


    }

    private boolean checkUser(String userID,String password){
        User user = validUsers.get(userID);
        if (user ==null){//判断userID存在
            return false;
        }else return user.getPasswd().equals(password) ;//判断密码是否正确
    }

    public Server(){
        System.out.println("服务器在9999端口监听");

        try {
            serverSocket = new ServerSocket(9999);
            while (true){
                Socket socket = serverSocket.accept();//服务器会进行循环监听
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());//拿到一个输入流对象
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User user =(User) ois.readObject();
                //TODO 完成查询数据库操作
                Message message = new Message();
                if (checkUser(user.getUserID(),user.getPasswd() )){

                    message.setMessageType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    oos.writeObject(message);
                    //创建一个线程与客户端进行时刻通信
                    ServerConnectClientThread scct =
                            new ServerConnectClientThread(socket, user.getUserID(),oos,ois);
                    scct.start();
                    //将该线程对象放入到一个集合中
                    ManageClientThreads.addClienThread(user.getUserID(),scct);
                }else {
                    message.setMessageType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    //
                    socket.close();
                    oos.close();
                    ois.close();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
