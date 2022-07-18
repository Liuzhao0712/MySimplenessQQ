package file_;

import file_.outPutStream.FileOutPutStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class FileCopy {
    public static void main(String[] args) {
        String readFilePath = "F:\\test_java_file\\data.txt";
        String writeFilePath = "F:\\test_java_file\\a\\b\\data.txt";
        System.out.println(write(writeFilePath,read(readFilePath)));
    }

    public static byte[] read(String readFilePath){
        FileInputStream fis = null;
        byte[] bytes = new byte[1000];
        try {
            fis = new FileInputStream(readFilePath);
            System.out.println("读取了"+fis.read(bytes)+"个字符");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bytes;
    }

    public static boolean write(String writeFilePath,byte[] bytes){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(writeFilePath);
            fos.write(bytes);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
