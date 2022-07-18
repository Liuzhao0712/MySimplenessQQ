package QQ.qqclient.view;

import QQ.qqclient.service.UserClientService;

import java.util.Scanner;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 */

public class QQview {
    private UserClientService userClientService = new UserClientService();//用于登录服务器，注册用户
    public static void main(String[] args) {
        new QQview().mainMenu();
    }
    private boolean loop = true;//控制是否显示菜单
    private void mainMenu(){
        Scanner in = new Scanner(System.in);
        while (loop) {
            System.out.println("=========欢迎进入用户登录系统===========");
            System.out.println("\t\t\t 1 登录系统");
            System.out.println("\t\t\t 9 退出系统");
            System.out.print("请选择功能：");
            switch (in.nextInt()) {
                case 1:
                    System.out.print("请输入用户ID:");
                    String userId = in.next();
                    System.out.print("请输入用户密码:");
                    String password = in.next();
                    //TODO 尚未验账号
                    if (userClientService.checkUser(userId,password)){
                        System.out.println("============欢迎（用户："+userId+ "）===========");
                        while(loop){
                            System.out.println("========网络二级菜单=======");
                            System.out.println("\t\t 1 显示用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息 ");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            switch (in.nextInt()) {
                                case 1:
                                    userClientService.onlineFriendList();
                                    break;
                                case 2:
                                    in.nextLine();//清空输入流的缓存
                                    System.out.print("请输入群发内容:");
                                    String s = in.nextLine();
                                    userClientService.groupChat(s);//群发消息的方法
                                    break;
                                case 3:
                                    System.out.print("请输入聊天的用户ID:");
                                    in.nextLine();
                                    String s1 = in.nextLine();
                                    System.out.print("请输入内容:");
                                    String s2 = in.nextLine();
                                    userClientService.privateChat(s1, s2);
                                    System.out.println("发送成功");
                                    break;
                                case 4:
                                    in.nextLine();
                                    System.out.print("请输入接收文件的用户ID：");
                                    String s3 = in.nextLine();
                                    System.out.print("请输入文件夹路径：");
                                    String s4 = in.nextLine();
                                    userClientService.sendFileToOne(s4, s3);
                                    System.out.println("发送成功");
                                    break;
                                case 9:
                                    userClientService.logOut();
                                    loop = false;
                                    System.exit(0);
                                    break;
                            }
                        }
                    }else {
                        System.out.println("登录失败，请重试！");

                    }

                    break;
                case 9:
                    loop = false;
                    break;
            }
        }
    }
}
