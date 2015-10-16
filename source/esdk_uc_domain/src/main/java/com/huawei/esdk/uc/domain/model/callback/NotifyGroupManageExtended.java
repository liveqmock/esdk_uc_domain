package com.huawei.esdk.uc.domain.model.callback;

import java.util.List;

/**
 * 
 * notifyGroupManage接口附加的信息
 * @author  gWX169839
 */
public class NotifyGroupManageExtended
{
    private int msgType;
    private String ucAccount;
    private String memAccount;
    private String creatorName;
    private List<String> result;
    private String msgId;
    public int getMsgType()
    {
        return msgType;
    }
    public void setMsgType(int msgType)
    {
        this.msgType = msgType;
    }
    public String getUcAccount()
    {
        return ucAccount;
    }
    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }
    public String getMemAccount()
    {
        return memAccount;
    }
    public void setMemAccount(String memAccount)
    {
        this.memAccount = memAccount;
    }
    public String getCreatorName()
    {
        return creatorName;
    }
    public void setCreatorName(String creatorName)
    {
        this.creatorName = creatorName;
    }
    public List<String> getResult()
    {
        return result;
    }
    public void setResult(List<String> result)
    {
        this.result = result;
    }
    public String getMsgId()
    {
        return msgId;
    }
    public void setMsgId(String msgId)
    {
        this.msgId = msgId;
    }
    
}
