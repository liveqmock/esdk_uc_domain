package com.huawei.esdk.uc.domain.model.bean;

import java.util.LinkedList;
import java.util.List;

public class PagedList<T>
{
    private List<T> records;

    // 满足查询条件的总数量
    private int totalPageCount;

    // 当前第几页
    private int curPageNo;

    // 本页显示的个数
    private int totalRecordCount;

    public List<T> getRecords()
    {
        if (null == records)
        {
            records = new LinkedList<T>();
        }
        return records;
    }

    public void setRecords(List<T> records)
    {
        this.records = records;
    }

    public int getTotalPageCount()
    {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount)
    {
        this.totalPageCount = totalPageCount;
    }

    public int getCurPageNo()
    {
        return curPageNo;
    }

    public void setCurPageNo(int curPageNo)
    {
        this.curPageNo = curPageNo;
    }

    public int getTotalRecordCount()
    {
        return totalRecordCount;
    }

    public void setTotalRecordCount(int totalRecordCount)
    {
        this.totalRecordCount = totalRecordCount;
    }

    public void addRecord(T t)
    {
        if (records == null)
        {
            records = new LinkedList<T>();
        }
        records.add(t);
    }

}
