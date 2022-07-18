package Socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @quthor Liuzhao
 * @date 2022/7/15
 */
public class Socket_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("客户端监听中！");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        System.out.println(inputStream.getClass());
        int getChar = 0;
        /*while ((getChar = inputStream.read()) != -1) {
            System.out.print((char) getChar);
        }*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String getStr = null;
        /*while ((getStr=bufferedReader.readLine())!=null){
            System.out.println(getStr);
        }*/
        FileOutputStream fileOutputStream = new FileOutputStream("src\\2.jpeg");
        int getChar1 = 0;
        while ((getChar1 = inputStream.read()) != -1) {
            fileOutputStream.write(getChar1);
        }


        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello client!".getBytes());
        outputStream.write("shoudaole".getBytes());
        socket.shutdownOutput();
        bufferedReader.close();
        serverSocket.close();
        socket.close();
        inputStream.close();
        outputStream.close();
        fileOutputStream.close();
        System.out.println("服务端退出了");


    }
}
