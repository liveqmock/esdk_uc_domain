package com.huawei.esdk.uc.domain.model.bean;

public enum UCPresType {

    ONLINE("ONLINE"), // 在线
    BUSY("BUSY"), // 忙
    CALLING("CALLING"), // 电话中
    LEAVING("LEAVING"), // 离开
    OFFLINE("OFFLINE"), // 离线
    DND("DND"); // 免打扰

    private final String value;

    UCPresType(String v)
    {
        value = v;
    }

    public String value()
    {
        return value;
    }

    public static UCPresType fromValue(String v)
    {
        for (UCPresType c : UCPresType.values())
        {
            if (c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
