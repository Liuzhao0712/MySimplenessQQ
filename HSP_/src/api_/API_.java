package api_;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @quthor Liuzhao
 * @date 2022/7/14
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

//        new InetAddress()
        //1.获取本地的主机名和主机地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //2.获取主机名对应的IneAddress对象
        InetAddress byName = InetAddress.getByName("DESKTOP-JSBAA77");
        System.out.println(byName);
        //3.根据域名返回InetAddress对象，
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);
        //4.通过InetAddress 对象获取指定的地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);
        //5.通过IP地址获取对应的域名
        String hostName = host2.getHostName();
        System.out.println(hostName);

    }
}
