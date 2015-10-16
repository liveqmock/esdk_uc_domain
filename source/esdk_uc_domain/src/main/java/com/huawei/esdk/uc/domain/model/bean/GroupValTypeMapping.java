package com.huawei.esdk.uc.domain.model.bean;

public class GroupValTypeMapping
{
    public static final int MAX = 1;

    public static final int MIN = 0;

    public static GroupValType int2enum(Integer num)
    {
        if (null == num)
        {
            return null;
        }
        switch (num)
        {
            // 允许任何人加入
            case 0:
                return GroupValType.ALL_ALLOW;
                // 需要身份验证才可加入
            case 1:
                return GroupValType.NEED_PERMIT;

            default:
                return null;
        }
    }

    public static Integer enum2int(GroupValType type)
    {
        if (null == type)
        {
            return null;
        }
        switch (type)
        {
            // 允许任何人加入
            case ALL_ALLOW:
                return 0;

                // 需要身份验证才可加入
            case NEED_PERMIT:
                return 1;
            default:
                return null;
        }
    }
    
}
