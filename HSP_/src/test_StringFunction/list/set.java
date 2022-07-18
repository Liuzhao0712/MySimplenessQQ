package test_StringFunction.list;

import java.util.HashSet;
import java.util.Set;

/**
 * @quthor Liuzhao
 * @date 2022/7/5
 */
@SuppressWarnings("all")
public class set {
    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        set.add(null);
        set.add(null);
        set.add(1);
        System.out.println(set);

    }
}
