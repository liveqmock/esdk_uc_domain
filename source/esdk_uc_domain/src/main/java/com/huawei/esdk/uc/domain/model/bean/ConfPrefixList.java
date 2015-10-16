package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class ConfPrefixList
{
    private String amount;
    
    private List<ConfPrefix> confPrefixs;
    
    public String getAmount()
    {
        return amount;
    }
    
    public void setAmount(String amount)
    {
        this.amount = amount;
    }
    
    public List<ConfPrefix> getConfPrefixs()
    {
        return confPrefixs;
    }
    
    public void setConfPrefixs(List<ConfPrefix> confPrefixs)
    {
        this.confPrefixs = confPrefixs;
    }
    
}
