package com.huawei.esdk.uc.domain.model.bean;

public class OffsetQryStaffCond
{
    private String corpId; // 企业Id

    private String deptId; // 部门Id

    private String searchCond; // 搜索条件

    public String getCorpId()
    {
        return corpId;
    }

    public void setCorpId(String corpId)
    {
        this.corpId = corpId;
    }

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getSearchCond()
    {
        return searchCond;
    }

    public void setSearchCond(String searchCond)
    {
        this.searchCond = searchCond;
    }

}
