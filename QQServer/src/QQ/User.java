package QQ;

import java.io.Serializable;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 */
public class User implements Serializable {
    public static final long serialVersionUID = 1L;
    private String userID;
    private String Passwd;

    public User() {
    }

    public User(String userID, String passwd) {
        this.userID = userID;
        Passwd = passwd;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPasswd() {
        return Passwd;
    }


    public void setPasswd(String passwd) {
        Passwd = passwd;
    }
}
