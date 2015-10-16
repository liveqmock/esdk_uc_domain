package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class QueryDepartmentInfoList
{
    private int amount;
    
    private List<QueryDepartmentInfo> departmentInfoList;
    
    public int getAmount()
    {
        return amount;
    }
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    public List<QueryDepartmentInfo> getDepartmentInfoList()
    {
        return departmentInfoList;
    }
    
    public void setDepartmentInfoList(List<QueryDepartmentInfo> departmentInfoList)
    {
        this.departmentInfoList = departmentInfoList;
    }
}
