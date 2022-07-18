package udp;

import java.io.IOException;
import java.net.*;

/**
    @quthor Liuzhao
    @date   2022/7/15
*/public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] bytes = new byte[4];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        socket.receive(datagramPacket);
        System.out.println(new String(bytes,0,datagramPacket.getLength()));
        socket.close();
    }
}
