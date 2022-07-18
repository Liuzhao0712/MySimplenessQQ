package file_.outPutStream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class FileOutPutStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() throws IOException {
        FileOutputStream fos=null;
        String srt = "F:\\test_java_file\\data3.txt";
            fos = new FileOutputStream(srt,true);
            fos.write("hello world!".getBytes());

        }

    }

