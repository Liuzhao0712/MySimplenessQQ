package test_StringFunction.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @quthor Liuzhao
 * @date 2022/7/2
 */
@SuppressWarnings("all")
public class HomeWork {
    public static void main(String[] args) {
        List al= new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<10;i++){
            stringBuffer.append("好");
            al.add(stringBuffer.toString());
        }
        al.add(2,"韩顺平教育");
        al.get(5);
        al.remove(6);
        al.set(5,"我是你爹");
        System.out.println(al);
        Iterator iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
