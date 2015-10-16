package com.huawei.esdk.uc.domain.model.bean;

public class DeptInfoBase
{
    private String corpId; // 企业ID

    private String deptDesc; // 部门描述

    private String deptfirst;// 部门优先级，用于同一等级部门的排序

    private String deptId; // 部门ID

    private String deptLevel; // 部门级别

    private String deptName; // 部门名称

    private String id; // 文档ID (待确认)

    private String parentId; // 父部门ID

    private String routeNumber;// 路由号码

    public String getCorpId()
    {
        return corpId;
    }

    public void setCorpId(String corpId)
    {
        this.corpId = corpId;
    }

    public String getDeptDesc()
    {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc)
    {
        this.deptDesc = deptDesc;
    }

    public String getDeptfirst()
    {
        return deptfirst;
    }

    public void setDeptfirst(String deptfirst)
    {
        this.deptfirst = deptfirst;
    }

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptLevel()
    {
        return deptLevel;
    }

    public void setDeptLevel(String deptLevel)
    {
        this.deptLevel = deptLevel;
    }

    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getParentId()
    {
        return parentId;
    }

    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    public String getRouteNumber()
    {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber)
    {
        this.routeNumber = routeNumber;
    }
}
