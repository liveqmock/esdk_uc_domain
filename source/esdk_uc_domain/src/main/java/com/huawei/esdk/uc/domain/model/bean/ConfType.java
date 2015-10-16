package com.huawei.esdk.uc.domain.model.bean;

public enum ConfType {

    // 即时会议
    INSTANTCONF("InstantConference"),
    
    // 预约会议
    SCHEDULEDCONF("ScheduledConference"),
    
    // 需要预留多媒体资源的即时会议
    RESERVEDIC("ReservedIC"),
    
    // 需要预留多媒体资源的预约会议
    RESERVEDSC("ReservedSC");

    private final String value;

    ConfType(String v)
    {
        value = v;
    }

    public String value()
    {
        return value;
    }

    public static ConfType fromValue(String v)
    {
        for (ConfType c : ConfType.values())
        {
            if (c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
