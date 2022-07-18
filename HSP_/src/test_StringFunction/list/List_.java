package test_StringFunction.list;
import java.util.*;

/**
 * @quthor Liuzhao
 * @date 2022/7/2
 */
@SuppressWarnings({"all"})
public class List_ {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("100");
        al.add(20);
        al.add("你好啊");
        System.out.println(al);

        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("+++++++++++=增强for循环+++++++++++++");
        for (Object ob:al){
            System.out.println(ob);
        }

        System.out.println(al.get(1));
        List list = new ArrayList();
        list.add("刘找");
        list.add("陈章里");
        list.add(1,"abcde");
        System.out.printf("r=====================");
        System.out.println(list);
        list.remove("abcde");
        System.out.println(list);
        System.out.printf("r=====================");


        ArrayList al1= new ArrayList();
        al1.add("");
        al1.add(null);

        LinkedList ll = new LinkedList();
        ll.add("");
        ll.add(null);
        al1.add(5,"abcde");

        int i= 100>>2;
        System.out.println(i);
    }
}

