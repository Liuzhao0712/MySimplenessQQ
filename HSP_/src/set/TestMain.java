package set;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @quthor Liuzhao
 * @date 2022/7/7
 */

class A{
    int i;

    public A(int i) {
        this.i = i;
    }
}
public class TestMain {
    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(new Car("奥迪",1000));
        lhs.add(new Car("奥迪",1000));
        lhs.add(new Car("宝马",2000));
        lhs.add(new Car("宝马",1000));
        lhs.add(new Car("法拉利",2000));
        lhs.add(new Car("法拉利",2000));
        System.out.println(lhs);
        System.out.println(new A(100).hashCode());
        System.out.println(new A(200).hashCode());
    }
}

class Car{
    String name;
    int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
