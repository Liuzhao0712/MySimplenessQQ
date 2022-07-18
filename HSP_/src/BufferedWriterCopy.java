import java.io.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class BufferedWriterCopy {
    public static void main(String[] args) throws IOException {
        String srcFilePath = "F:\\test_java_file\\data.txt";
        String destFilePath = "F:\\test_java_file\\data2.txt";
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath,true));
        while ((count = bufferedReader.read()) != -1) {
            bufferedWriter.write((char)count);
        }
        bufferedReader.close();
        bufferedWriter.close();
        System.out.println("拷贝完毕");
    }
}
