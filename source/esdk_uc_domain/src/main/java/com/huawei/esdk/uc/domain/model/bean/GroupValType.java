package com.huawei.esdk.uc.domain.model.bean;  

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TGroupValType")
@XmlEnum
public enum GroupValType {

    //允许任何人加入
    ALL_ALLOW("ALL_ALLOW"),
    //需要身份验证才可加入
    NEED_PERMIT("NEED_PERMIT");

    private final String value;

    GroupValType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupValType fromValue(String v) {
        for (GroupValType c: GroupValType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
