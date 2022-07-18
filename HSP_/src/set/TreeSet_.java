package set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Vector;

/**
 * @quthor Liuzhao
 * @date 2022/7/8
 */
@SuppressWarnings("all")
public class TreeSet_ {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<String>();
        strs.add("abcde");
        Vector vector = new Vector();
        Vector strings = new Vector<String>();
        vector.add(null);
        vector.add(null);
        System.out.println(vector);
//        TreeSet ts = new TreeSet();
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        ts.add("abc");
        ts.add("abcd");
        ts.add("aa");
        ts.add("abeg");
        ts.add("etgs");
        ts.add("sgd");

        System.out.println(ts);


    }
}




