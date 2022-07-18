package file_.InputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/12
 */
@SuppressWarnings("all")
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("F:\\test_java_file\\data5.txt");
            while ((readData = fileInputStream.read()) != -1) {
                    System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert fileInputStream != null;
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }

    @Test
    public void readFile02() {
        int readData = 0;
        byte[] buf = new byte[50];

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("F:\\test_java_file\\data.txt");
            while (fileInputStream.read(buf) != -1) {
                for (byte b : buf) {
                    System.out.print((char)b);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
