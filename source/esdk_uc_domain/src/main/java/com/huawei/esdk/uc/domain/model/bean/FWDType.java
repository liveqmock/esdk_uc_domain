package com.huawei.esdk.uc.domain.model.bean;  

public enum FWDType {

    //无条件前转
    UNCOND_FWD("UNCOND_FWD"),
    //遇忙前转号码
    BUSY_FWD("BUSY_FWD"),
    //无应答前转号码
    NO_ANSWER_FWD("NO_ANSWER_FWD"),
    //离线前转号码
    OFFLINE_FWD("OFFLINE_FWD");


    private final String value;

    FWDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FWDType fromValue(String v) {
        for (FWDType c: FWDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
