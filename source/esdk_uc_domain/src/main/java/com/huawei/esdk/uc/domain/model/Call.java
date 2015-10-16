package com.huawei.esdk.uc.domain.model;

import java.util.Date;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.ICTDCapability;
import com.huawei.esdk.uc.domain.model.bean.CallStatus;

/**
 * 呼叫模型
 * 
 */
public class Call
{
    // 呼叫标识
    private String callId;

    // 主叫用户
    private String calling;

    // 被叫用户
    private String callee;

    // 呼叫发起人
    private String initiator;

    // 呼叫状态
    private CallStatus callStatus;

    // 呼叫开始时间
    private Date startTime;

    // 呼叫持续时间
    private int duration;

    // 呼叫类型
    private String callType;

    public Call(String callId)
    {
        this.callId = callId;
    }

    public Call()
    {

    }

    private static IDeviceManager deviceManager = (IDeviceManager) ApplicationContextUtil
            .getBean("deviceManager");
    
    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }

    // 发起呼叫
    public SDKResult<String> dialCall(Call call) throws SDKException
    {

        SDKResult<String> result = null;
            ICTDCapability ctd = getDeviceManager().getDeviceServiceProxy(
            		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                    ICTDCapability.class);
            result = ctd.dialCall(call);
            return result;
    }
    
    // 发起呼叫
    public SDKResult<String> dialCallRest(Call call) throws SDKException
    {
        
        SDKResult<String> result = null;
        ICTDCapability ctd = getDeviceManager().getDeviceServiceProxy(
            ConfigManager.getInstance().getValue("esdk.uc_appserver_device"),
            ICTDCapability.class);
        result = ctd.dialCall(call);
        return result;
    }

    // 终止呼叫
    public SDKErrorCode releaseCall() throws SDKException
    {
        SDKErrorCode result = null;

        ICTDCapability ctd = deviceManager.getDeviceServiceProxy(
        		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                ICTDCapability.class);
        result = ctd.releaseCall(callId);
        return result;
    }

    // 查询呼叫状态
    public SDKResult<Call> getStatus() throws SDKException
    {
        ICTDCapability ctd  = deviceManager.getDeviceServiceProxy(
        		ConfigManager.getInstance().getValue("esdk.uc_obg_device"),
                ICTDCapability.class);
        return ctd.getStatus(callId);
 
    }

    public String getCallId()
    {
        return callId;
    }

    public void setCallId(String callId)
    {
        this.callId = callId;
    }

    public String getCalling()
    {
        return calling;
    }

    public void setCalling(String calling)
    {
        this.calling = calling;
    }

    public String getCallee()
    {
        return callee;
    }

    public void setCallee(String callee)
    {
        this.callee = callee;
    }

    public Date getStartTime()
    {
        if(startTime == null)
            return null;
        return (Date)startTime.clone();
    }

    public void setStartTime(Date startTime)
    {
        this.startTime = (Date)startTime.clone();
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public String getCallType()
    {
        return callType;
    }

    public void setCallType(String callType)
    {
        this.callType = callType;
    }

    public CallStatus getCallStatus()
    {
        return callStatus;
    }

    public void setCallStatus(CallStatus callStatus)
    {
        this.callStatus = callStatus;
    }

    public String getInitiator()
    {
        return initiator;
    }

    public void setInitiator(String initiator)
    {
        this.initiator = initiator;
    }
}
