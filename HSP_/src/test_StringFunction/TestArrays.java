package test_StringFunction;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @quthor Liuzhao
 * @date 2022/6/30
 */
public class TestArrays {
    public static void main(String[] args) {
        Integer[] integer = {1,2,4,6,3};
        System.out.println(Arrays.toString(integer));
        Arrays.sort(integer);
        System.out.println(Arrays.toString(integer));
        Arrays.sort(integer, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(integer));

    }
}
