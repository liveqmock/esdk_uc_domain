package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

import com.huawei.esdk.uc.domain.model.PersonInfo;

public class EnterpriseList
{
    
    /**
     * 某层级部门中部门和员工的总数
     */
    private int total;
    
    /**
     * 当前分页中部门的数量
     */
    private int deptSum;
    
    /**
     * 当前分页中员工的数量
     */
    private int employeeSum;
    
    /**
     * 上一级部门ID
     */
    private String parentdept;
    
    /**
     * 个人信息
     */
    private List<DepartmentInfo> departments;
    
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
    
    public int getDeptSum()
    {
        return deptSum;
    }
    
    public void setDeptSum(int deptSum)
    {
        this.deptSum = deptSum;
    }
    
    public int getEmployeeSum()
    {
        return employeeSum;
    }
    
    public void setEmployeeSum(int employeeSum)
    {
        this.employeeSum = employeeSum;
    }
    
    public String getParentdept()
    {
        return parentdept;
    }
    
    public void setParentdept(String parentdept)
    {
        this.parentdept = parentdept;
    }
    
    public List<PersonInfo> getEmployees()
    {
        return employees;
    }
    
    public void setEmployees(List<PersonInfo> employees)
    {
        this.employees = employees;
    }
    
    public List<DepartmentInfo> getDepartments()
    {
        return departments;
    }
    
    public void setDepartments(List<DepartmentInfo> departments)
    {
        this.departments = departments;
    }
    
}
