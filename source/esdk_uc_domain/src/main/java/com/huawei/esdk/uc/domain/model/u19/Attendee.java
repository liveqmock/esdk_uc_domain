package com.huawei.esdk.uc.domain.model.u19;

import java.util.ArrayList;
import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.u19.IAttendeeCapability;
import com.huawei.esdk.uc.domain.model.bean.AttendeeInfo;
import com.huawei.esdk.uc.domain.model.bean.DelAtteInfo;
import com.huawei.esdk.uc.domain.util.u19.U19Utils;

public class Attendee
{
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    /**
     * 操作用户
     */
    private String userId;
    
    /**
     * 统一网关IP
     */
    private String gwIp;
    
    /**
     * 操作与会者类型: 0:踢出指定与会人，1:邀请指定与会人 
     */
    private String operate;
    
    /**
     * 会议厅号
     */
    private String confRoom;
    
    /**
     * 要删除与会人员的数量
     */
    private String deleteCount;
    
    private List<DelAtteInfo> delAtteInfos;
    
    public List<DelAtteInfo> getDelAtteInfos()
    {
        if (null == delAtteInfos)
        {
            delAtteInfos = new ArrayList<DelAtteInfo>();
        }
        
        return delAtteInfos;
    }
    
    public void setDelAtteInfos(List<DelAtteInfo> delAtteInfos)
    {
        this.delAtteInfos = delAtteInfos;
    }
    
    /**
     * 与会者号码，最大32位长度号码
     */
    private String attendeeNumber;
    
    /**
     * 与会者的权限
     * 0：可以听可以说
     * 1：只能听不能说
     * 2：只能说不能听
     * 3：主席
     * 4：不能听不能说
     */
    private String attribute;
    
    /**
     * 与会者是否注册用户
     */
    private String isRegister;
    
    /**
     * 原主席号码，最大32位长度号码
     */
    private String oldChairNumber;
    
    /**
     * 新主席号码，最大32位长度号码
     */
    private String newChairNumber;
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        Attendee.deviceManager = deviceManager;
    }
    
    /** 
    * 操作与会者
    * 
    * @param attendee 与会者信息
    * @return SDKErrorCode 操作结果
    * @throws SDKException eSDK异常
    * @see [类、类#方法、类#成员]
    */
    public SDKErrorCode operateAttendee(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(U19Utils.getU19DeviceId(), IAttendeeCapability.class);
        
        return attendeeCapability.operateAttendee(attendee);
    }
    
    /** 
     * 主席权限移交
     * <功能详细描述>
     * @param attendee 与会者信息
     * @return SDKErrorCode 操作结果
     * @throws SDKException eSDK异常
     * @see [类、类#方法、类#成员]
     */
    public SDKErrorCode transferChairman(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(U19Utils.getU19DeviceId(), IAttendeeCapability.class);
        
        return attendeeCapability.transferChairman(attendee);
    }
    
    /**
     * 添加与会者
     * <功能详细描述>
     * @param attendee
     * @return
     * @throws SDKException
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<AttendeeInfo> addAttendee(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(U19Utils.getU19DeviceId(), IAttendeeCapability.class);
        return attendeeCapability.addAttendee(attendee);
    }
    
    /**
     * 删除与会者
     * <功能详细描述>
     * @param attendee
     * @return
     * @throws SDKException
     * @see [类、类#方法、类#成员]
     */
    public SDKResult<AttendeeInfo> delAttendee(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(U19Utils.getU19DeviceId(), IAttendeeCapability.class);
        return attendeeCapability.delAttendee(attendee);
    }
    
    /**
     * 修改与会者权限
     * @param attendee 与会者信息
     * @return SDKErrorCode 操作结果
     * @throws SDKException eSDK异常
     * @see [类、类#方法、类#成员]
     */
    public SDKErrorCode modifyAttendeeAuthority(Attendee attendee)
        throws SDKException
    {
        IAttendeeCapability attendeeCapability =
            getDeviceManager().getDeviceServiceProxy(U19Utils.getU19DeviceId(), IAttendeeCapability.class);
        
        return attendeeCapability.modifyAttendeeAuthority(attendee);
    }
    
    public String getUserId()
    {
        return userId;
    }
    
    public void setUserId(String userId)
    {
        this.userId = userId;
    }
    
    public String getGwIp()
    {
        return gwIp;
    }
    
    public void setGwIp(String gwIp)
    {
        this.gwIp = gwIp;
    }
    
    public String getOperate()
    {
        return operate;
    }
    
    public void setOperate(String operate)
    {
        this.operate = operate;
    }
    
    public String getConfRoom()
    {
        return confRoom;
    }
    
    public void setConfRoom(String confRoom)
    {
        this.confRoom = confRoom;
    }
    
    public String getDeleteCount()
    {
        return deleteCount;
    }
    
    public void setDeleteCount(String deleteCount)
    {
        this.deleteCount = deleteCount;
    }
    
    public String getAttendeeNumber()
    {
        return attendeeNumber;
    }
    
    public void setAttendeeNumber(String attendeeNumber)
    {
        this.attendeeNumber = attendeeNumber;
    }
    
    public String getAttribute()
    {
        return attribute;
    }
    
    public void setAttribute(String attribute)
    {
        this.attribute = attribute;
    }
    
    public String getIsRegister()
    {
        return isRegister;
    }
    
    public void setIsRegister(String isRegister)
    {
        this.isRegister = isRegister;
    }
    
    public String getOldChairNumber()
    {
        return oldChairNumber;
    }
    
    public void setOldChairNumber(String oldChairNumber)
    {
        this.oldChairNumber = oldChairNumber;
    }
    
    public String getNewChairNumber()
    {
        return newChairNumber;
    }
    
    public void setNewChairNumber(String newChairNumber)
    {
        this.newChairNumber = newChairNumber;
    }
    
}
