package com.huawei.esdk.uc.domain.model.bean;

public class UCPresQryResultMapping
{
    public static final int MAX = 5;
    
    public static final int MIN = 1;
    
    public static UCPresQryResult int2enum(Integer num)
    {
        if (null == num)
        {
            return null;
        }
        switch (num)
        {
            case 1:
                return UCPresQryResult.RES_OK;
            case 2:
                return UCPresQryResult.RES_ACCEPT;
            case 3:
                return UCPresQryResult.RES_FORBIDDEN;
            case 4:
                return UCPresQryResult.RES_NOT_FOUND;
            case 5:
                return UCPresQryResult.RES_SERVER_ERR;
            default:
                return null;
        }
        
    }
    
    public static Integer enum2int(UCPresQryResult type)
    {
        if (null == type)
        {
            return null;
        }
        switch (type)
        {
            case RES_OK:
                return 1;
            case RES_ACCEPT:
                return 2;
            case RES_FORBIDDEN:
                return 3;
            case RES_NOT_FOUND:
                return 4;
            case RES_SERVER_ERR:
                return 5;
            default:
                return null;
        }
        
    }
}
