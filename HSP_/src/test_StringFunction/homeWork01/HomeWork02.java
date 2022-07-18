package test_StringFunction.homeWork01;

/**
 * @quthor Liuzhao
 * @date 2022/7/1
 */
public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(new User("abcf", 123456, "28@q.63com"));

    }


}

class User {
    String name;
    int passWord;
    String mail;

    public User(String name, int passWord, String mail) {
        if (name.length() < 2 || name.length() > 4) {
            throw new RuntimeException("用户名长度不对");
        }
        this.name = name;
        if (String.valueOf(passWord).length() != 6) {
            throw new RuntimeException("密码长度不正确");
        }
        this.passWord = passWord;
        if (mail.indexOf("@") < 0 || mail.indexOf(".") < 0 || mail.indexOf("@") >= mail.indexOf(".")) {
            throw new RuntimeException("邮箱不正确!");
        }
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passWord=" + passWord +
                ", mail='" + mail + '\'' +
                '}';
    }
}
