package file_.InputStream;

import java.io.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "F:\\test_java_file\\data10.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        Dog dog =(Dog) ois.readObject();
        System.out.println(dog);
        ois.close();
        System.out.println(dog);

    }
}
class Dog{

}