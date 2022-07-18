package Socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @quthor Liuzhao
 * @date 2022/7/15
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        System.out.println(outputStream.getClass());
//        outputStream.write("hello server!".getBytes());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\admin\\Pictures\\Saved Pictures\\桌面背景\\1.jpeg");
        int getChar1 = 0;
        while ((getChar1 = fileInputStream.read()) != -1) {
            outputStream.write(getChar1);
        }
        bufferedWriter.flush();//刷新缓冲区将数据推送过去
        InputStream inputStream = socket.getInputStream();
        socket.shutdownOutput();
        int getChar = 0;
        while ((getChar = inputStream.read()) != -1) {
            System.out.print((char) getChar);
        }
        bufferedWriter.close();
        socket.close();
        outputStream.close();
        inputStream.close();
        fileInputStream.close();
        System.out.println("客户端退出了");
    }
}
