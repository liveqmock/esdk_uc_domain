package com.huawei.esdk.uc.domain.model.bean;

public enum TerminalStatus {
    
    // 正在邀请
    INVITING("1"),
    
    // 邀请成功
    INVITED("2"),
    
    //邀请失败
    NOTINVITED("3"),
    
    //挂断
    HANGUP("4"),
    
    //忙
    BUSY("5");

    private final String value;

    TerminalStatus(String v)
    {
        value = v;
    }

    public String value()
    {
        return value;
    }

    public static TerminalStatus fromValue(String v)
    {
        for (TerminalStatus c : TerminalStatus.values())
        {
            if (c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
