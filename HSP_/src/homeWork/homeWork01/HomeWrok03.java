package homeWork.homeWork01;

import java.io.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/14
 */
public class HomeWrok03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\a.dat",true));
        oos.writeUnshared(new Dog("tom",5,"red"));
        oos.writeUnshared(new Dog("tom",5,"red"));
        oos.writeUnshared(new Dog("tom",5,"red"));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:\\a.dat"));
        Object o = null;

        for (int i = 0; i < 4; i++) {
            o = ois.readObject();
            System.out.println(o);

        }
        ois.close();

    }
}
class Dog implements Serializable{
    String name;
    int age;
    String Color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        Color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Color='" + Color + '\'' +
                '}';
    }
}
