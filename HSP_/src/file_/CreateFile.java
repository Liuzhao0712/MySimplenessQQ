package file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/12
 */
public class CreateFile {
    public static void main(String[] args) {

    }
    @Test
    public void create01() {
        String filePath = "F:\\test_java_file\\a.txt";
        File file = null;
        file = new File(filePath);
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void create02(){
        String filePath = "F:\\test_java_file\\";
        File objectPath = new File(filePath);
        File newFile = new File(objectPath, "test5.txt");
        try {
            System.out.println(newFile.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void create03(){
        File file = new File("F:\\test_java_file", "a5.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
