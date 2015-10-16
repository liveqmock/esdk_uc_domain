package com.huawei.esdk.uc.domain.model.bean;

public enum OperationType {

    // 新增
    ACT_ADD("ACT_ADD"),
    // 修改
    ACT_MOD("ACT_MOD"),
    // 删除
    ACT_DEL("ACT_DEL");

    private final String value;

    OperationType(String v)
    {
        value = v;
    }

    public String value()
    {
        return value;
    }

    public static OperationType fromValue(String v)
    {
        for (OperationType c : OperationType.values())
        {
            if (c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
