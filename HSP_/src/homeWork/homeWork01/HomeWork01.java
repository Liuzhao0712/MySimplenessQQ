package homeWork.homeWork01;

import java.io.File;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/14
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\mytemp";

        File file = new File(filePath);
        if (!file.isDirectory()) {
            if (file.mkdir()) {
                System.out.println("创建成功！");
            }
        }
        String filePath1 = "e:\\mytemp\\hello.txt";

        File file1 = new File(filePath1);
        if (file1.exists()) {
            System.out.println("该文件已经存在！");
        }else{
            file1.createNewFile();
            System.out.println("创建成功！123");
        }
    }

}
