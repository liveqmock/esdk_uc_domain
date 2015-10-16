package com.huawei.esdk.uc.domain.model.bean;

public class ChangeInfo
{
	// 操作类型1：新增 2：修改 3：删除
    private OperationType opType;

    public OperationType getOpType()
    {
        return opType;
    }

    public void setOpType(OperationType opType)
    {
        this.opType = opType;
    }
}
