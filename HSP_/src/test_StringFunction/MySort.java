package test_StringFunction;

import java.util.Arrays;

/**
 * @quthor Liuzhao
 * @date 2022/6/30
 */
public class MySort {
    public static void main(String[] args) {
        int[] ints = {1,2,3,42,1,-1};
        sort(ints, new comparable_() {
            @Override
            public boolean comparable(int a, int b) {
                return a - b < 0;
            }
        });
        System.out.println(Arrays.toString(ints));
    }

    public static void sort(int[] ints,comparable_ comparable_){
        for (int i=0;i<ints.length;i++){
            for (int j=i;j<ints.length;j++){
                if (comparable_.comparable(ints[i],ints[j])){
                    int temp=ints[i];
                    ints[i]=ints[j];
                    ints[j]=temp;
                }
            }

        }

    }

}

interface comparable_{
    boolean  comparable(int a,int b);
}
