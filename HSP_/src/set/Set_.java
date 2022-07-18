package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @quthor Liuzhao
 * @date 2022/7/7
 */
@SuppressWarnings("all")
public class Set_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Employee("刘兆",18));
        set.add(new Employee("孙浩文",19));
        set.add(new Employee("刘子迁",19));
        set.add(new Employee("刘兆",18));
        System.out.println(set);
    }
}


class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
