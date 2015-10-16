package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

import com.huawei.esdk.uc.domain.model.Account;

public class BatchAccount
{
    private int successAmount;
    
    private int failedAmount;
    
    private List<Account> accountIds;
    
    private List<Account> failedAccounts;
    
    public int getSuccessAmount()
    {
        return successAmount;
    }
    
    public void setSuccessAmount(int successAmount)
    {
        this.successAmount = successAmount;
    }
    
    public int getFailedAmount()
    {
        return failedAmount;
    }
    
    public void setFailedAmount(int failedAmount)
    {
        this.failedAmount = failedAmount;
    }
    
    public List<Account> getAccountIds()
    {
        return accountIds;
    }
    
    public void setAccountIds(List<Account> accountIds)
    {
        this.accountIds = accountIds;
    }
    
    public List<Account> getFailedAccounts()
    {
        return failedAccounts;
    }
    
    public void setFailedAccounts(List<Account> failedAccounts)
    {
        this.failedAccounts = failedAccounts;
    }
    
}
