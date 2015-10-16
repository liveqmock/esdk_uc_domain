package com.huawei.esdk.uc.domain.model.bean;

public class UCPresTypeMapping
{
    public static final int MAX = 5;
    
    public static final int MIN = 0;
    
    public static UCPresType int2enum(Integer num)
    {
        if (null == num)
        {
            return null;
        }
        switch (num)
        {
            case 0:
                return UCPresType.ONLINE;
            case 1:
                return UCPresType.BUSY;
            case 2:
                return UCPresType.CALLING;
            case 3:
                return UCPresType.LEAVING;
            case 4:
                return UCPresType.OFFLINE;
            case 5:
                return UCPresType.DND;
            default:
                return null;
        }
        
    }
    
    public static Integer enum2int(UCPresType type)
    {
        if (null == type)
        {
            return null;
        }
        switch (type)
        {
            case ONLINE:
                return 0;
            case BUSY:
                return 1;
            case CALLING:
                return 2;
            case LEAVING:
                return 3;
            case OFFLINE:
                return 4;
            case DND:
                return 5;
            default:
                return null;
        }
        
    }
}
