package com.huawei.esdk.uc.domain.model.callback;

import com.huawei.esdk.uc.domain.model.bean.GroupMember;

/**
 * 
 * notifyGroupInfo接口附加的信息
 * @author  gWX169839
 */
public class NotifyGroupInfoExtended
{
    private int msgType;
    private String ucAccount;
    private String groupId;
    private String creator;
    private GroupMember groupMember;
    
    public GroupMember getGroupMember()
    {
        return groupMember;
    }
    public void setGroupMember(GroupMember groupMember)
    {
        this.groupMember = groupMember;
    }
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
    public String getGroupId()
    {
        return groupId;
    }
    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }
    public String getCreator()
    {
        return creator;
    }
    public void setCreator(String creator)
    {
        this.creator = creator;
    }

}
