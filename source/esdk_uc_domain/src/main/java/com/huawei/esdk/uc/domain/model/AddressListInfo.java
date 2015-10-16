package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.userprofile.UserProfileCapability;
import com.huawei.esdk.uc.domain.model.bean.Address;

public class AddressListInfo
{
    /**
     * 搜索结果集中成员的总数
     */
    private int total;
    
    /**
     * 当前分页消息中成员的数量
     */
    private int sum;
    
    /**
     * 个人通讯录
     */
    private List<Address> addresses;
    
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        AddressListInfo.deviceManager = deviceManager;
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public void setTotal(int total)
    {
        this.total = total;
    }
    
    public int getSum()
    {
        return sum;
    }
    
    public void setSum(int sum)
    {
        this.sum = sum;
    }
    
    public List<Address> getAddresses()
    {
        return addresses;
    }
    
    public void setAddresses(List<Address> addresses)
    {
        this.addresses = addresses;
    }
    
    public SDKResult<AddressListInfo> queryAddrList(String account, String condition, int pagecount, int pagenum)
        throws SDKException
    {
        UserProfileCapability userProfileCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                UserProfileCapability.class);
        SDKResult<AddressListInfo> result = userProfileCapability.queryAddrList(account, condition, pagecount, pagenum);
        return result;
    }
    
    public SDKResult<AddressListInfo> queryAddrListRest(String account, String condition, int pagecount, int pagenum)
        throws SDKException
    {
        UserProfileCapability userProfileCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_appserver_device"),
                UserProfileCapability.class);
        SDKResult<AddressListInfo> result = userProfileCapability.queryAddrList(account, condition, pagecount, pagenum);
        return result;
    }
}
