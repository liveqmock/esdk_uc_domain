package com.huawei.esdk.uc.domain.model;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.devices.v200r001c03.bmp.UCV2R1C03BMPNumberCapability;

public class UCNumber
{
    private String corpInterNumber;

    private String corpId;

    private String memberFuncFlagId;

    private String terminalType;

    private String publicNumber;

    private String sourceId;

    // 外呼权限
    private String outgoingRights;

    // IVR放音语言
    private String ivrLanguage;

    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
            .getBean("deviceManager");

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }

    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        UCNumber.deviceManager = deviceManager;
    }

    /**
     * 增加账号addNumber
     * 
     */
    public SDKResult<String> addNumber(UCNumber ucNumber) throws SDKException
    {
        UCV2R1C03BMPNumberCapability numberCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_bmp_device"),
                UCV2R1C03BMPNumberCapability.class);
        SDKResult<String> errorCode = numberCapability.
            addNumber(ucNumber);
        return errorCode;
    }
    
    /** 
    * 查询内部号码
    * @author gaolinfei
    * @param ucNumber
    * @return
     * @throws SDKException 
    *
    */
   public SDKResult<UCNumber> queryNumber(UCNumber ucNumber) throws SDKException
   {
       UCV2R1C03BMPNumberCapability accountCapability = getDeviceManager()
           .getDeviceServiceProxy(
                   ConfigManager.getInstance().getValue("esdk.uc_bmp_device"),
                   UCV2R1C03BMPNumberCapability.class);
       SDKResult<UCNumber> result = accountCapability.queryNumber(ucNumber);
       return result;
   }

    /**
     * delNumber
     * @throws SDKException
     */
    public SDKResult<String> delNumber(UCNumber ucNumber) throws SDKException
    {
        UCV2R1C03BMPNumberCapability numberCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_bmp_device"),
                UCV2R1C03BMPNumberCapability.class);
        SDKResult<String> result = numberCapability.
        delNumber(ucNumber);
        return result;
    }

    public SDKResult<String> modifyNumber(UCNumber ucNumber)throws SDKException
    {
        UCV2R1C03BMPNumberCapability numberCapability =
            getDeviceManager().getDeviceServiceProxy
            (ConfigManager.getInstance().getValue("esdk.uc_bmp_device"),
                UCV2R1C03BMPNumberCapability.class);
        SDKResult<String> result = numberCapability.modifyNumber(ucNumber);
        return result;
    }
    
    public String getCorpInterNumber()
    {
        return corpInterNumber;
    }

    public void setCorpInterNumber(String corpInterNumber)
    {
        this.corpInterNumber = corpInterNumber;
    }

    public String getCorpId()
    {
        return corpId;
    }

    public void setCorpId(String corpId)
    {
        this.corpId = corpId;
    }

    public String getMemberFuncFlagId()
    {
        return memberFuncFlagId;
    }

    public void setMemberFuncFlagId(String memberFuncFlagId)
    {
        this.memberFuncFlagId = memberFuncFlagId;
    }

    public String getTerminalType()
    {
        return terminalType;
    }

    public void setTerminalType(String terminalType)
    {
        this.terminalType = terminalType;
    }

    public String getPublicNumber()
    {
        return publicNumber;
    }

    public void setPublicNumber(String publicNumber)
    {
        this.publicNumber = publicNumber;
    }

    public String getSourceId()
    {
        return sourceId;
    }

    public void setSourceId(String sourceId)
    {
        this.sourceId = sourceId;
    }

    public String getOutgoingRights()
    {
        return outgoingRights;
    }

    public void setOutgoingRights(String outgoingRights)
    {
        this.outgoingRights = outgoingRights;
    }

    public String getLanguageName()
    {
        return ivrLanguage;
    }

    public void setLanguageName(String languageName)
    {
        this.ivrLanguage = languageName;
    }
}
