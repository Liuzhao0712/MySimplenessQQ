import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @quthor Liuzhao
 * @date 2022/7/14
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        int i =0;
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\test_java_file\\data5.txt"),"UTf-8" );
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);

        }
        isr.close();

    }
}
