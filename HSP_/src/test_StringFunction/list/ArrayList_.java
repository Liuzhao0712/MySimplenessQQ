package test_StringFunction.list;

import java.util.ArrayList;

/**
 * @quthor Liuzhao
 * @date 2022/7/4
 */
@SuppressWarnings({"all"})
public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(2);
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println(al);
    }
}
