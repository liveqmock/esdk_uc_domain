package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

public class GlobalSRTPList
{
    private String amount;
    
    private List<GlobalSRTP> globalSRTPs;
    
    public String getAmount()
    {
        return amount;
    }
    
    public void setAmount(String amount)
    {
        this.amount = amount;
    }
    
    public List<GlobalSRTP> getGlobalSRTPs()
    {
        return globalSRTPs;
    }
    
    public void setGlobalSRTPs(List<GlobalSRTP> globalSRTPs)
    {
        this.globalSRTPs = globalSRTPs;
    }
    
}
