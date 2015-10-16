package com.huawei.esdk.uc.domain.model.bean;

import java.util.List;

import com.huawei.esdk.uc.domain.model.SIP;

public class SIPList
{
    private int amount;
    
    private List<SIP> sips;
    
    public int getAmount()
    {
        return amount;
    }
    
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    public List<SIP> getSips()
    {
        return sips;
    }
    
    public void setSips(List<SIP> sips)
    {
        this.sips = sips;
    }
    
}
