package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "F:\\test_java_file\\data.txt";
        BufferedReader bufferedReader = null;
        int char_;
        String line;
        try {

            bufferedReader = new BufferedReader(new FileReader(filePath));
            while((line = bufferedReader.readLine())!=null) {
                System.out.println(line);

            }
            while((char_ = bufferedReader.read())!= -1) {
                System.out.print((char ) char_);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
