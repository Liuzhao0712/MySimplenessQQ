package test_StringFunction.homeWork01;

/**
 * @quthor Liuzhao
 * @date 2022/7/1
 */
public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(reverse("abcdefg", 1, 5));

    }


    public static String reverse(String str , int start , int end ){
        StringBuffer sb =new StringBuffer();
        for (int i=0;i<start;i++){
            sb.append(str.charAt(i));
        }
        for (int i=end;i>=start;i--){
            sb.append(str.charAt(i));
        }
        for (int i=end+1;i<str.length();i++){
            sb.append(str.charAt(i));
        }

        return sb.toString();


    }
}



