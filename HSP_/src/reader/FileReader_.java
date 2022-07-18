package reader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class FileReader_ {
    public static void main(String[] args) {

    }
    public void f1(int i){

    }

    @Test
    public void printFile(){
        int c = 0;
        String filePath = "F:\\test_java_file\\data.txt";
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\test_java_file\\data5.txt");
            while(( c = (fr.read())) != -1){
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Test
    public void printFile01(){
        char[] c = new char[10];
        int count = 0;
        String filePath = "F:\\test_java_file\\data.txt";
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\test_java_file\\data.txt");
            while((count = fr.read(c)) != -1){
                System.out.print(new String(c,0,count));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
