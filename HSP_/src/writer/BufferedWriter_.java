package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "F:\\test_java_file\\data.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("你好刘兆",2,2);
        bufferedWriter.newLine();
        bufferedWriter.write("你好刘兆",1,2);
        bufferedWriter.write("你好刘兆",0,2);
        bufferedWriter.close();
    }
}
