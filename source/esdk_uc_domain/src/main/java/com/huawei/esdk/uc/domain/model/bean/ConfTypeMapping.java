package com.huawei.esdk.uc.domain.model.bean;

public class ConfTypeMapping
{
    public static final int MAX = 4;

    public static final int MIN = 1;

    public static ConfType int2enum(Integer num)
    {
        if (null == num)
        {
            return null;
        }
        switch (num)
        {
            case 1:

                return ConfType.INSTANTCONF;
            case 2:
                return ConfType.SCHEDULEDCONF;

            case 3:
                return ConfType.RESERVEDIC;
            case 4:
                return ConfType.RESERVEDSC;
            default:
                return null;
        }

    }

    public static Integer enum2int(ConfType type)
    {
        if (null == type)
        {
            return null;
        }
        switch (type)
        {
            case INSTANTCONF:

                return 1;
            case SCHEDULEDCONF:
                return 2;

            case RESERVEDIC:
                return 3;
            case RESERVEDSC:
                return 4;
            default:
                return null;
        }

    }
}
