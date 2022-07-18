package set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @quthor Liuzhao
 * @date 2022/7/7
 */
@SuppressWarnings("all")
public class Set1_ {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Employee1("张三",18,new MyDate(1,2,3)));
        hs.add(new Employee1("李四",19,new MyDate(2,2,3)));
        hs.add(new Employee1("张三",18,new MyDate(1,2,3)));
        System.out.println(hs);
    }

}

class Employee1{
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee1(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
class MyDate{
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
