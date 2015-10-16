package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.ISIPCapability;
import com.huawei.esdk.uc.domain.model.bean.GatewayList;
import com.huawei.esdk.uc.domain.model.bean.SIPAuth;
import com.huawei.esdk.uc.domain.model.bean.SIPCondition;
import com.huawei.esdk.uc.domain.model.bean.SIPList;

public class SIP
{
    /**
     * 统一网关IP
     */
    private String gwIp;
    
    /**
     * subpbx id
     */
    private String subPbx;
    
    /**
     * 本地网关ip
     */
    private String localGwIp;
    
    /**
     * 是否联动：0是否，1为是
     */
    private String joint;
    
    /**
     * SIP设备标识
     */
    private String sipUe;
    
    /**
     * 设备类型
     */
    private String ueType;
    
    /**
     * SIP号码
     */
    private String number;
    
    /**
     * 长号
     */
    private String longNum;
    
    private SIPAuth sipAuth;
    
    /**
     * 权限级别
     */
    private String rightLevel;
    
    /**
     * 是否自动添加字冠：0为否，1为是
     */
    private String addPrefix;
    
    /**
     * 是否删除sipUe标识  0：不删除，1：删除
     */
    private String deleteSipUe;
    
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        SIP.deviceManager = deviceManager;
    }
    
    public String getJoint()
    {
        return joint;
    }
    
    public void setJoint(String joint)
    {
        this.joint = joint;
    }
    
    public String getDeleteSipUe()
    {
        return deleteSipUe;
    }

    public void setDeleteSipUe(String deleteSipUe)
    {
        this.deleteSipUe = deleteSipUe;
    }

    public String getUeType()
    {
        return ueType;
    }
    
    public void setUeType(String ueType)
    {
        this.ueType = ueType;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    public void setNumber(String number)
    {
        this.number = number;
    }
    
    public String getLongNum()
    {
        return longNum;
    }
    
    public void setLongNum(String longNum)
    {
        this.longNum = longNum;
    }
    
    public SIPAuth getSipAuth()
    {
        return sipAuth;
    }
    
    public void setSipAuth(SIPAuth sipAuth)
    {
        this.sipAuth = sipAuth;
    }
    
    public String getRightLevel()
    {
        return rightLevel;
    }
    
    public void setRightLevel(String rightLevel)
    {
        this.rightLevel = rightLevel;
    }
    
    public String getAddPrefix()
    {
        return addPrefix;
    }
    
    public void setAddPrefix(String addPrefix)
    {
        this.addPrefix = addPrefix;
    }
    
    public String getGwIp()
    {
        return gwIp;
    }

    public void setGwIp(String gwIp)
    {
        this.gwIp = gwIp;
    }

    public String getSubPbx()
    {
        return subPbx;
    }

    public void setSubPbx(String subPbx)
    {
        this.subPbx = subPbx;
    }

    public String getLocalGwIp()
    {
        return localGwIp;
    }

    public void setLocalGwIp(String localGwIp)
    {
        this.localGwIp = localGwIp;
    }

    public String getSipUe()
    {
        return sipUe;
    }

    public void setSipUe(String sipUe)
    {
        this.sipUe = sipUe;
    }

    /**
     * 添加SIP号码
     * @param userId
     * @param sip
     * @return
     * @throws SDKException
     */
    public SDKErrorCode addSIP(String userId, SIP sip)
        throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKErrorCode result = sipCapability.addSipNum(userId, sip);
        return result;
    }
    
    /**
     * 修改SIP号码
     * @param userId
     * @param sip
     * @return
     * @throws SDKException
     */
    public SDKErrorCode modifySIP(String userId, SIP sip)
        throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKErrorCode result = sipCapability.modifySipNum(userId, sip);
        return result;
    }

    /**
     * 修改SIP号码密码
     * @param userId
     * @param sip
     * @return
     */
    public SDKErrorCode modifySipPassword(String userId, SIP sip)
        throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKErrorCode result = sipCapability.modifySipPassword(userId, sip);
        return result;
    }
    
    public SDKErrorCode deleteSip(String userId, SIP sip)
        throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKErrorCode result = sipCapability.deleteSip(userId, sip);
        return result;
    }
    
    public SDKResult<SIPList> batchDeleteSip(String userId, List<SIP> sips)
        throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKResult<SIPList> result = sipCapability.batchDeleteSip(userId, sips);
        return result;
    }
    
    public SDKResult<SIPList> querySip(String userId, SIPCondition sipCon)
        throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKResult<SIPList> result = sipCapability.querySip(userId, sipCon);
        return result;
    }

    public SDKResult<GatewayList> queryGateway(String userId)
        throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKResult<GatewayList> result = sipCapability.queryGateway(userId);
        return result;
    }

    public SDKErrorCode addSIPs(String userId, String numStep, String uestep, String amount, SIP sip) throws SDKException
    {
        ISIPCapability sipCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                ISIPCapability.class);
        SDKErrorCode result = sipCapability.addSipNums(userId, numStep, uestep, amount, sip);
        return result;
    }
    
}
