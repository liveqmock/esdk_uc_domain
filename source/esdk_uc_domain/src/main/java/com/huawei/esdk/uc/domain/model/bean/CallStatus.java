package com.huawei.esdk.uc.domain.model.bean;  

public enum CallStatus {

    //无用的值
    CTD_NOUSE("CTD_NOUSE"),
    //正在接通主叫
    CTD_CALLING_CALLER("CTD_CALLING_CALLER"),
    CTD_CALLING_CALLEE("CTD_CALLING_CALLEE"),
    CTD_CALL_ESTABLISHED("CTD_CALL_ESTABLISHED"),
    CTD_CALL_ENDED("CTD_CALL_ENDED"),
    CTD_CALLER_CANNOT_REACHED("CTD_CALLER_CANNOT_REACHED"),
    CTD_CALLEE_CANNOT_REACHED("CTD_CALLEE_CANNOT_REACHED"),
    CTD_CALLER_BUSY("CTD_CALLER_BUSY"),
    CTD_CALLEE_BUSY("CTD_CALLEE_BUSY"),
    CTD_CALLER_NO_ANSWER("CTD_CALLER_NO_ANSWER"),
    CTD_CALLEE_NO_ANSWER("CTD_CALLEE_NO_ANSWER"),
    CTD_VOIP_ASTRICT("CTD_VOIP_ASTRICT"),
    CTD_CTD_ASTRICT("CTD_CTD_ASTRICT"),
    CTD_CALLER_OFF_LINE("CTD_CALLER_OFF_LINE"),
    CTD_CALLEE_OFF_LINE("CTD_CALLEE_OFF_LINE");

    private final String value;

    CallStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallStatus fromValue(String v) {
        for (CallStatus c: CallStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
