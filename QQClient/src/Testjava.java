import java.util.Scanner;

/**
 * @quthor Liuzhao
 * @date 2022/7/17
 */
public class Testjava {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true) {
            switch (in.nextInt()) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    //in.nextLine();//清空输入流的缓存
                    System.out.print("请输入群发内容:");
                    String s = in.nextLine();
                    System.out.println(s);
                    break;
                case 3:
                    System.out.print("请输入聊天的用户ID:");
                    in.nextLine();
                    String s1 = in.nextLine();
                    System.out.print("请输入内容:");
                    String s2 = in.nextLine();
                    System.out.println("发送成功");
                    break;
                case 4:
                    in.nextLine();
                    System.out.print("请输入接收文件的用户ID：");
                    String s3 = in.nextLine();
                    System.out.print("请输入文件夹路径：");
                    String s4 = in.nextLine();
                    System.out.println("发送成功");
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }
        /*int i = 3;
        switch (i){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);*/

    }

}
