package type_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * @quthor Liuzhao
 * @date 2022/7/8
 */
public class MyMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三",100,new MyDate(5,10,1)));
        employees.add(new Employee("李四",100,new MyDate(3,6,2)));
        employees.add(new Employee("王五",100,new MyDate(9,10,5)));
        employees.add(new Employee("张三",100,new MyDate(5,10,2)));
        employees.add(new Employee("张三",100,new MyDate(5,10,0)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!Objects.equals(o1.getName(), o2.getName())){
                    return o1.getName().compareTo(o2.getName());
                }else {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
        });

        for (Employee e: employees){
            System.out.println(e);
        }
    }
}

class Employee{
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month) {
        this.month = month;
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        return year-o.getYear();
    }
}