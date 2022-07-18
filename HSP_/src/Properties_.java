import java.io.*;
import java.util.Properties;

/**
 * @quthor Liuzhao
 * @date 2022/7/14
 */
public class Properties_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("F:\\test_java_file\\test.properties");
        properties.load(fileReader);
        properties.list(System.out);
        System.out.println(properties.getProperty("user"));
        properties.setProperty("abc","def");
        properties.setProperty("user","88888");
        properties.list(System.out);
        properties.store(new FileWriter("F:\\test_java_file\\test.properties"),"abcdefg");

        fileReader.close();


    }
}
