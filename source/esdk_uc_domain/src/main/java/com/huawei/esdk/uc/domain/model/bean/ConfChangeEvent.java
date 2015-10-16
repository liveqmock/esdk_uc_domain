package com.huawei.esdk.uc.domain.model.bean;  public class ConfChangeEvent
{
    //用户或会场变更事件类型
    private Integer eventId;
    
    //用户号码
    private String memberNumber;
    
    //用户姓名
    private String memberName;
    
    //用户账号
    private String account;
    
    //用户终端类型
    private String terminalType;
    
    //角色
    private  int role;

    public Integer getEventId()
    {
        return eventId;
    }

    public void setEventId(Integer eventId)
    {
        this.eventId = eventId;
    }

    public String getMemberNumber()
    {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber)
    {
        this.memberNumber = memberNumber;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getTerminalType()
    {
        return terminalType;
    }

    public void setTerminalType(String terminalType)
    {
        this.terminalType = terminalType;
    }
    
    public int getRole()
    {
        return role;
    }

    public void setRole(int role)
    {
        this.role = role;
    }
}
