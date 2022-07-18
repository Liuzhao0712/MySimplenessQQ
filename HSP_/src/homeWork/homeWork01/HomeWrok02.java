package homeWork.homeWork01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/14
 */
public class HomeWrok02 {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\mytemp\\hello.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = "";
        int count = 0;
        while ((line = br.readLine())!=null) {
            System.out.println((count++ ) + " "+line);
        }
        br.close();


    }
}
