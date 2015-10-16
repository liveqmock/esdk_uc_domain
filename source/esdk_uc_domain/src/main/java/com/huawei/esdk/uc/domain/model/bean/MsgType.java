package com.huawei.esdk.uc.domain.model.bean;  

public enum MsgType {

    //即时消息
    IM("IM"),
    //短信
    SMS("SMS"),
    //彩信
    MMS("MMS");

    private final String value;

    MsgType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MsgType fromValue(String v) {
        for (MsgType c: MsgType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        return null;
    }

}
