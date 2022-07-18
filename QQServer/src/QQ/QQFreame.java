package QQ;

import QQ.QQServer.NewsServer;
import QQ.QQServer.Server;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 *
 * 启动客户端的
 */
public class QQFreame {
    public static void main(String[] args) {
        Thread newsServer = new Thread(new NewsServer());
        newsServer.start();

        Server server = new Server();
    }
}
