package test_StringFunction.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @quthor Liuzhao
 * @date 2022/7/5
 */
@SuppressWarnings({"all"})
public class LInkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        for (int i=0; i<10;i++) {
            ll.add(i);
        }
        //ll.remove();
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);


        Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        for (Object ob: ll){
            System.out.println(ob);
        }

    }
}
