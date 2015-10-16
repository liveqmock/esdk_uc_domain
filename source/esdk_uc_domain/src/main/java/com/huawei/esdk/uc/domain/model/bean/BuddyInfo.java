package com.huawei.esdk.uc.domain.model.bean;  public class BuddyInfo
{
    // 好友账号
    private String presentity;
    
    //订阅关系状态
    private Integer state;
    
    // 好友呈现信息
    private UCPresInfo ucPresInfo;

    public String getPresentity()
    {
        return presentity;
    }

    public void setPresentity(String presentity)
    {
        this.presentity = presentity;
    }

    public Integer getState()
    {
        return state;
    }

    public void setState(Integer state)
    {
        this.state = state;
    }

    public UCPresInfo getUcPresInfo()
    {
        return ucPresInfo;
    }

    public void setUcPresInfo(UCPresInfo ucPresInfo)
    {
        this.ucPresInfo = ucPresInfo;
    }
}
