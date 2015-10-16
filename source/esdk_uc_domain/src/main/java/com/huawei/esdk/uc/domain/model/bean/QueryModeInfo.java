package com.huawei.esdk.uc.domain.model.bean;

public class QueryModeInfo
{
    private int qryMode; // 查询方式：1：按页查询，2：按偏移量查询

    private int pageNum; // 分页时当前的页数

    private int pageSize; // 分页时每页显示的记录的条数

    private int offset; // 偏移量

    public int getQryMode()
    {
        return qryMode;
    }

    public void setQryMode(int qryMode)
    {
        this.qryMode = qryMode;
    }

    public int getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(int pageNum)
    {
        this.pageNum = pageNum;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getOffset()
    {
        return offset;
    }

    public void setOffset(int offset)
    {
        this.offset = offset;
    }

}
