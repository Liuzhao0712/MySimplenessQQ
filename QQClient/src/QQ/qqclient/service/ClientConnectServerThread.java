package QQ.qqclient.service;

import QQ.Message;
import QQ.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 */
public class ClientConnectServerThread extends Thread{
    private final Socket socket;
    private final ObjectOutputStream oos;
    private final ObjectInputStream ois;
    public ClientConnectServerThread(Socket socket,ObjectOutputStream oos,ObjectInputStream ois) {
        this.socket = socket;
        this.ois = ois;
        this.oos = oos;

    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("延时异常！");
            }
            try {
                System.out.println("等待服务器的数据");
                Message message =(Message) ois.readObject();
                switch (message.getMessageType()){
                    case MESSAGE_RET_ONLINE_FRIEND:
                        String[] strings= message.getContent().split(" ");
                        System.out.println("======当前的在线用户列表======");
                        for (String s:
                             strings) {
                            System.out.println(s);
                        }
                        break;
                    case MESSAGE_PRIVATE_CHAT:
                        System.out.println("用户" + message.getSender() + "跟你发消息");
                        System.out.println("消息内容为：" + message.getContent());
                        System.out.println("消息时间为：" + message.getSenTime());
                        break;
                    case MESSAGE_GROUP_CHAT:
                        System.out.println("用户" + message.getSender() + "进行了消息群发");
                        System.out.println("消息内容为：" + message.getContent());
                        System.out.println("群发时间为：" + message.getSenTime());
                        break;
                    case MESSAGE_FILE_MES:
                        Scanner in = new Scanner(System.in);
                        System.out.println("用户" + message.getSender() + "给你发送了一个文件！");
                        System.out.println(message.getSenTime());
                        UserClientService.receiveFile(message);


                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO异常1");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("类型转换异常");
            }

        }
    }

    public ObjectOutputStream getOos() {
        return oos;
    }

    public ObjectInputStream getOis() {
        return ois;
    }

    public Socket getSocket() {
        return socket;
    }

}
