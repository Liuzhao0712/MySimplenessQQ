package QQ.qqclient.service;

import java.util.HashMap;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 * 该类管理客户端连接到服务器的线程
 */
public class MangeClientConnectServerThread {

    private static HashMap<String ,ClientConnectServerThread> hm = new HashMap<>();//放入线程的集合
    //加入线程的方法
    public static void addClientConnectServerThread(String userID , ClientConnectServerThread clientConnectServerThread){
        hm.put(userID,clientConnectServerThread);
    }
    //通过userID 得到对应的线程
    public static ClientConnectServerThread getClientConnectServerThread(String userID){
        return hm.get(userID);
    }



}
