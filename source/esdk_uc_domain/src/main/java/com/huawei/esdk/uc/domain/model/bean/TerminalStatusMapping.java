package com.huawei.esdk.uc.domain.model.bean;

public class TerminalStatusMapping
{
    
    public final static int MAX = 4;
    
    public final static int MIN = 1;
    
    public static TerminalStatus int2enum(Integer num)
    {
        if (null == num)
        {
            return null;
        }
        switch (num)
        {
            case 1:
                
                return TerminalStatus.INVITING;
            case 2:
                return TerminalStatus.INVITED;
                
            case 3:
                return TerminalStatus.NOTINVITED;
            case 4:
                return TerminalStatus.HANGUP;
            default:
                return null;
        }
        
    }
    
    public static Integer enum2int(TerminalStatus type)
    {
        if (null == type)
        {
            return -1;
        }
        switch (type)
        {
            case INVITING:
                return 1;
            case INVITED:
                return 2;
            case NOTINVITED:
                return 3;
            case HANGUP:
                return 4;
            default:
                return -1;
        }
        
    }
}
