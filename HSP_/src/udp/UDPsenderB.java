package udp;

import java.io.IOException;
import java.net.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/15
 */
public class UDPsenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        String strdata = "hello Receiver";
        DatagramPacket datagramPacket =
                new DatagramPacket(strdata.getBytes(), strdata.length(), InetAddress.getByName("192.168.1.17"),9999);
        socket.send(datagramPacket);
        socket.close();
    }
}
