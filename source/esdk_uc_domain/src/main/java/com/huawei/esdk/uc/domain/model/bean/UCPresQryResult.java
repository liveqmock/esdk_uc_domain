package com.huawei.esdk.uc.domain.model.bean;

public enum UCPresQryResult {

    RES_OK("RES_OK"), // 200 支持查询
    RES_ACCEPT("RES_ACCEPT"), // 202 用户授权未决
    RES_FORBIDDEN("RES_FORBIDDEN"), // 403 用户授权拒绝
    RES_NOT_FOUND("RES_NOT_FOUND"), // 404 用户不存在
    RES_SERVER_ERR("RES_SERVER_ERR"); // 500 服务器内部异常

    private final String value;

    UCPresQryResult(String v)
    {
        value = v;
    }

    public String value()
    {
        return value;
    }

    public static UCPresQryResult fromValue(String v)
    {
        for (UCPresQryResult c : UCPresQryResult.values())
        {
            if (c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
