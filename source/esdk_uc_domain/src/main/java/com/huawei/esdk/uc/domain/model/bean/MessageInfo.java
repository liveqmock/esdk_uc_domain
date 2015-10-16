package com.huawei.esdk.uc.domain.model.bean;

/** * @author w00208247 * * */
public class MessageInfo
{
    private String sender;
    private String receiver;
    private String msgId;
    private String groupId;
    private String msgtTime;
    private String msgType;
    private String encodeType;
    private String subject;
    private String content;
    
    public String getSender()
    {
        return sender;
    }
    public void setSender(String sender)
    {
        this.sender = sender;
    }
    public String getMsgtTime()
    {
        return msgtTime;
    }
    public void setMsgtTime(String msgtTime)
    {
        this.msgtTime = msgtTime;
    }
    public String getMsgType()
    {
        return msgType;
    }
    public void setMsgType(String msgType)
    {
        this.msgType = msgType;
    }
    public String getEncodeType()
    {
        return encodeType;
    }
    public void setEncodeType(String encodeType)
    {
        this.encodeType = encodeType;
    }
    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public String getReceiver()
    {
        return receiver;
    }
    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }
    public String getMsgId()
    {
        return msgId;
    }
    public void setMsgId(String msgId)
    {
        this.msgId = msgId;
    }
    public String getGroupId()
    {
        return groupId;
    }
    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }
}
