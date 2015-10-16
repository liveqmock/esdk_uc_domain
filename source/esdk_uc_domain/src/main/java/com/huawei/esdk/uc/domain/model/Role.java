package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.bmu.IRoleCapability;
import com.huawei.esdk.uc.domain.model.bean.RoleInfo;

public class Role
{
    private String amount;
    
    private List<RoleInfo> roleInfos;
    
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        Role.deviceManager = deviceManager;
    }
    
    /**
     *  查询角色
     * @param userId
     * @param sip
     * @return
     * @throws SDKException
     */
    public SDKResult<Role> queryRole(String userId, 
        String pageCount, String pageNum, String lang)
        throws SDKException
    {
        IRoleCapability roleCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IRoleCapability.class);
        SDKResult<Role> result = roleCapability.queryRole(userId, pageCount, pageNum, lang);
        return result;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public List<RoleInfo> getRoleInfos()
    {
        return roleInfos;
    }
    
    public void setRoleInfos(List<RoleInfo> roleInfos)
    {
        this.roleInfos = roleInfos;
    }
    
}
