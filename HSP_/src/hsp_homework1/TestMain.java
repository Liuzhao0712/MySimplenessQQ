package hsp_homework1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @quthor Liuzhao
 * @date 2022/7/10
 */
public class TestMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("a",5000,new MyDate(3,19,17)));
        employees.add(new Employee("c",1000,new MyDate(10,15,17)));
        employees.add(new Employee("b",2000,new MyDate(13,15,17)));
        employees.add(new Employee("d",5000,new MyDate(3,19,17)));

        Iterator<Employee> iterator = employees.iterator();
//        while (iterator.hasNext()) {
//            Employee next = iterator.next();
//            System.out.println(next);
//        }
        for (Employee employee :employees) {
            System.out.println(employee);
        }

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!o1.getName().equals(o2.getName()))
                return o1.getName().compareTo(o2.getName());
                else return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        for (Employee employee :employees) {
            System.out.println(employee);
        }

    }
    @Test
    public void f1(){
        System.out.println("f1方法被调用");
    }
    @Test
    public void f2(){
        System.out.println("f2方法被调用");
    }
}
