package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

import com.huawei.esdk.uc.domain.model.PersonInfo;

public class EmployeeList
{
    /**
     * 搜索结果集中成员的总数
     */
    private int total;
    
    /**
     * 当前分页消息中成员的数量
     */
    private int sum;
    
    /**
     * 个人信息
     */
    private List<PersonInfo> employees;
    
    public int getTotal()
    {
        return total;
    }
    
    public void setTotal(int total)
    {
        this.total = total;
    }
    
    public int getSum()
    {
        return sum;
    }
    
    public void setSum(int sum)
    {
        this.sum = sum;
    }
    
    public List<PersonInfo> getEmployees()
    {
        return employees;
    }
    
    public void setEmployees(List<PersonInfo> employees)
    {
        this.employees = employees;
    }
}
