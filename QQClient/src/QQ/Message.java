package QQ;

import java.io.Serializable;

/**
 * @quthor Liuzhao
 * @date 2022/7/16
 */
public class Message implements Serializable {
    public static final long serialVersionUID = 1L;
    private String sender;//发送者
    private String getter;//接收者
    private String content;//消息内容
    private String senTime;//发送时间
    private MessageType messageType;//消息类型

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSenTime() {
        return senTime;
    }

    public void setSenTime(String senTime) {
        this.senTime = senTime;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
