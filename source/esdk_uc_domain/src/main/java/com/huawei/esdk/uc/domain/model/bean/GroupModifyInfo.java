package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class GroupModifyInfo
{
    private String groupName; // 群组名称

    private String groupDec; // 群组描述

    private String groupPost; // 群组公告

    private List<GroupValType> groupValTypeList; // 群组验证方式
    
    private int maxShareFileSize; //群共享文件大小

    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getGroupDec()
    {
        return groupDec;
    }

    public void setGroupDec(String groupDec)
    {
        this.groupDec = groupDec;
    }

    public String getGroupPost()
    {
        return groupPost;
    }

    public void setGroupPost(String groupPost)
    {
        this.groupPost = groupPost;
    }

    public List<GroupValType> getGroupValTypeList()
    {
        return groupValTypeList;
    }

    public void setGroupValTypeList(List<GroupValType> groupValTypeList)
    {
        this.groupValTypeList = groupValTypeList;
    }

    public int getMaxShareFileSize()
    {
        return maxShareFileSize;
    }

    public void setMaxShareFileSize(int maxShareFileSize)
    {
        this.maxShareFileSize = maxShareFileSize;
    }

}
