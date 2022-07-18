package file_.outPutStream;

import java.io.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String filePath = "F:\\test_java_file\\data10.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeUTF("刘兆");
        objectOutputStream.writeUnshared(new Dog("小黄",20));
        objectOutputStream.close();

    }
}


class Dog implements Serializable {
    String name;
    int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }
}