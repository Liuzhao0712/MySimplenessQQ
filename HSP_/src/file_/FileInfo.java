package file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @quthor Liuzhao
 * @date 2022/7/12
 */
public class FileInfo {
    public static void main(String[] args) {
        File file = new File("F:\\test_java_file\\a.txt");

        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getParentFile());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
