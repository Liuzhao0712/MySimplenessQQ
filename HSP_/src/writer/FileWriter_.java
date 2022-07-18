package writer;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class FileWriter_ {


    @Test
    public void fileWriter(){
        String filePath = "F:\\test_java_file\\data.txt";
        FileWriter fw = null;
        char[] chars = {'a','v','c'};
        try {
            fw = new FileWriter(filePath,true);
            fw.write(50);
            fw.write('a');
            fw.write(chars);
            fw.write("你好刘兆");
            fw.write("你好世界".toCharArray(),0,2);
            fw.write("你好工程技术学院",2,5);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
