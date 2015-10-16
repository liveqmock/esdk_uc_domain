package com.huawei.esdk.uc.domain.model.bean;  

public enum ScreenNumType {

    //全号
    FULL_NUM(""),
    //前缀号码
    PREFIX_NUM(""),
    //前缀号码范围
    PREFIX_RANGE_NUM(""),
    //全号范围
    FULL_RANGE_NUM("");

    private final String value;

    ScreenNumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScreenNumType fromValue(String v) {
        for (ScreenNumType c: ScreenNumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
