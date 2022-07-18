package test_StringFunction;

import java.util.Locale;

public class TestFunction {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "Hello";
//        1.equals 区分大小写
        System.out.println(str1.equals(str2));//false

        String userName = "johN";
        System.out.println("johN".equalsIgnoreCase(userName));//true
//        2.equalsIgnoreCase 不区分大小写

//        3.length 返回字符串的
        System.out.println("abcdefg".length());//7

//        4.indeOf 返回字符或者字符串对应的位置
        System.out.println("abcdef".indexOf("a"));//0

//        5.lastIndexOf 倒着返回字符串
        System.out.println("abcdef".indexOf("d"));//3

//        6.substring 截取字符
        System.out.println("abcdef".substring(2));//cdef
        //左闭右开
        System.out.println("abcdef".substring(1, 3));//bc

//        7.trim 去掉前后空格
        System.out.println(" abcde   ".trim());//abcde

//        8.charAt 获取索引字符
        System.out.println("abcde".charAt(1));//b

//        9.toUpperCase 转换为小写字母
        System.out.println("abCdefG".toUpperCase());//ABCDEFG

//        10.toLowerCase 转换为大写字母
        System.out.println("abCdefG".toLowerCase());//abcdefg

//        11.concat 连接字符串
        System.out.println("abcdef".concat("cdefg"));//abcdefcdefg

//        12.replace 替换字符串中的字符
        System.out.println("abcdeef".replace("e", "b"));

//        13.split 切割字符串
        String[] Strings = "张，李，王".split("，");
        for (String s : Strings) {
            System.out.print(s + "\t");
        }//张 李 王 \需要转义

//        14.compareTo 比较两个字符串的大小
        System.out.println("abc".compareTo("ab"));//先比较字符的距离需要看源码

//        15.toCharArray 转换成字符数组
        char[] chars = "张，李，王".toCharArray();
        System.out.println(chars.length);
        for (char s : chars) {
            System.out.println(s + "\t");
        }
//        16.format 格式字符串
        int age =18;
        String name = "lz";
        String formatInfo="姓名是：%s,年龄是：%d";
        String info = String.format(formatInfo,name,age,"abc");
        System.out.println(info);

    }
}
