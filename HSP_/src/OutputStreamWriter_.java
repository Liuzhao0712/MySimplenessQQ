import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @quthor Liuzhao
 * @date 2022/7/14
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("F:\\test_java_file\\data5.txt",true),"gbk");
        osw.write("你好刘兆");
        osw.close();
    }
}
