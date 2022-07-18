package QQ;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 */
public enum MessageType {

    MESSAGE_LOGIN_SUCCEED,  //登录成功
    MESSAGE_LOGIN_FAIL,//登录失败
    MESSAGE_COMM_MES,//普通信息包
    MESSAGE_GET_ONLINE_FRIEND,//要求返回在线用户列表
    MESSAGE_RET_ONLINE_FRIEND,//返回在线用户列表
    MESSAGE_PRIVATE_CHAT,//私聊
    MESSAGE_GROUP_CHAT,//群聊
    MESSAGE_CLIENT_EXIT;//客户端请求退出

}
