package com.huawei.esdk.uc.domain.model.bean;

public class GroupMember
{
    private Integer status; // 状态类型

    private String displayName; // 显示名字

    private String ucAccount; // UC账号

    private String userUri; // 成员URI
    
    private boolean ownerFlag;//群组管理员标志位：true:群组管理员，false:群组成员
    
    private Integer  operationResult;//对应C03版本中 批量添加或删除 中res字段 

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public String getUcAccount()
    {
        return ucAccount;
    }

    public void setUcAccount(String ucAccount)
    {
        this.ucAccount = ucAccount;
    }

    public String getUserUri()
    {
        return userUri;
    }

    public void setUserUri(String userUri)
    {
        this.userUri = userUri;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    /** * @param ownerFlag the ownerFlag to set */
    public void setOwnerFlag(boolean ownerFlag)
    {
        this.ownerFlag = ownerFlag;
    }

    /** * @return the ownerFlag */
    public boolean isOwnerFlag()
    {
        return ownerFlag;
    }

    public Integer getOperationResult()
    {
        return operationResult;
    }

    public void setOperationResult(Integer operationResult)
    {
        this.operationResult = operationResult;
    }

}
