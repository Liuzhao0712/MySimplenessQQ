//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package QQ.QQServer;

import QQ.Message;
import QQ.MessageType;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NewsServer implements Runnable {
    public NewsServer() {
    }

    public void run() {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("请输入需要推送的新闻内容,输入exit结束该服务！");
            String content = in.nextLine();
            if (content.equals("exit")) {
                return;
            }

            newsSend(content);
        }
    }

    public static void newsSend(String content) {
        Message message = new Message();
        message.setMessageType(MessageType.MESSAGE_GROUP_CHAT);
        message.setSender("服务器");
        message.setSenTime((new Date()).toString());
        message.setContent(content);
        Set<String> keys = ManageClientThreads.getHm().keySet();
        Iterator var3 = keys.iterator();

        while(var3.hasNext()) {
            String userID = (String)var3.next();

            try {
                ManageClientThreads.getServerConnectClientThread(userID).getOos().writeObject(message);
            } catch (IOException var6) {
                var6.printStackTrace();
                System.out.println("服务器群发消息错误！");
            }
        }

    }
}
