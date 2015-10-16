package com.huawei.esdk.uc.domain.model.bean;

public class OperationTypeMapping
{
    public static final int MAX = 3;
    
    public static final int MIN = 1;
    
    public static OperationType int2enum(Integer num)
    {
        if (null == num)
        {
            return null;
        }
        switch (num)
        {
            case 1:
                
                return OperationType.ACT_ADD;
            case 2:
                
                return OperationType.ACT_MOD;
            case 3:
                return OperationType.ACT_DEL;
                
            default:
                return null;
        }
        
    }
    
    public static Integer enum2int(OperationType type)
    {
        if (null == type)
        {
            return null;
        }
        switch (type)
        {
            case ACT_ADD:
                
                return 1;
            case ACT_MOD:
                return 2;
            case ACT_DEL:
                return 3;
                
            default:
                return null;
        }
        
    }
}
