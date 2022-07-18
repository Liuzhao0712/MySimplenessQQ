package set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @quthor Liuzhao
 * @date 2022/7/7
 */
@SuppressWarnings("all")
public class LinkedSet {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        Integer I = new Integer(5);
        Integer I1 = new Integer(5);
        set.add(10);
        set.add(I);
        set.add(I1);
        set.add("abcde");
        set.add("abcdefg");
        System.out.println(set);


    }
}
