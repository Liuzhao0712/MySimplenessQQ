package file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @quthor Liuzhao
 * @date 2022/7/12
 */
public class DIeFIle {
    public static void main(String[] args) {
        String filePath = "F:\\test_java_file\\a.txt";
        File file1 = new File(filePath);
        if (file1.exists()) {
            if (file1.delete()) {
                System.out.println("删除成功！");
            }
        }else {
            System.out.println("文件不存在!");
        }
    }
    @Test
    public void f2(){
        File file = new File("F:\\test_java_file\\a");
        if (file.exists()) {
            if (file.delete()){
                System.out.println("删除成功");
            }
        }else {
            System.out.println("目录不存在！");
        }

    }

    @Test
    public void f3(){
        File file = new File("F:\\test_java_file\\a\\b\\c\\d\\e\\f\\g\\h");
        if (file.mkdirs()) {
            System.out.println("创建成功！");
        }
    }
}
