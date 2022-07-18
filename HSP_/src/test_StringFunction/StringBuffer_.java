/**
 * @quthor Liuzhao
 * @date 2022/6/30
 */
@SuppressWarnings({"all"})
public class StringBuffer_ {

    public static void main(String[] args) {
        StringBuffer Sb1= new StringBuffer("abcde");
        System.out.println(Sb1);
        String str = "abcd";
        StringBuffer sb = new StringBuffer(str);
        sb.insert(1,"abcde");
        
    }
}

