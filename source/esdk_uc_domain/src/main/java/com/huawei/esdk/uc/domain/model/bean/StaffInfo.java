package com.huawei.esdk.uc.domain.model.bean;

public class StaffInfo extends StaffInfoBase
{
    private String ucURL; // 成员URL，软终端路由号码

    private String foreignName; // 成员英文名

    private String spinyin; // 首拼音

    private String vip;

    private String level; // 级别


    public String getUcURL()
    {
        return ucURL;
    }

    public void setUcURL(String ucURL)
    {
        this.ucURL = ucURL;
    }

    public String getForeignName()
    {
        return foreignName;
    }

    public void setForeignName(String foreignName)
    {
        this.foreignName = foreignName;
    }

    public String getSpinyin()
    {
        return spinyin;
    }

    public void setSpinyin(String spinyin)
    {
        this.spinyin = spinyin;
    }

    public String getVip()
    {
        return vip;
    }

    public void setVip(String vip)
    {
        this.vip = vip;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

}
