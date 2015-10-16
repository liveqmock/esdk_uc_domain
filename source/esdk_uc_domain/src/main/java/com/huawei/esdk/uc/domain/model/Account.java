package com.huawei.esdk.uc.domain.model;

import java.util.List;

import com.huawei.esdk.platform.common.SDKErrorCode;
import com.huawei.esdk.platform.common.SDKResult;
import com.huawei.esdk.platform.common.config.ConfigManager;
import com.huawei.esdk.platform.common.exception.SDKException;
import com.huawei.esdk.platform.common.utils.ApplicationContextUtil;
import com.huawei.esdk.platform.nemgr.itf.IDeviceManager;
import com.huawei.esdk.uc.device.obg.IAccountCapability;
import com.huawei.esdk.uc.domain.model.bean.BatchAccount;

public class Account
{
    private String accountId;
    
    private String accountType;
    
    private String loginName;
    
    private String password;
    
    private String name;
    
    private String sex;
    
    private String homePhone;
    
    private String cellPhone;
    
    private String officePhone;
    
    private String shortPhone;
    
    private String otherPhone;
    
    private String fax;
    
    private String email;
    
    private String addr;
    
    private String title;
    
    private String departmentId;
    
    private String userLevel;
    
    private String roleId;
    
    private String failedReason;
    
    private String oldPassword;
    
    private String newPassword;
    
    private String bindNum;
    
    private static IDeviceManager deviceManager = (IDeviceManager)ApplicationContextUtil.getBean("deviceManager");
    
    public String getAccountId()
    {
        return accountId;
    }
    
    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }
    
    public String getAccountType()
    {
        return accountType;
    }
    
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }
    
    public String getLoginName()
    {
        return loginName;
    }
    
    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getSex()
    {
        return sex;
    }
    
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    
    public String getFax()
    {
        return fax;
    }
    
    public void setFax(String fax)
    {
        this.fax = fax;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getAddr()
    {
        return addr;
    }
    
    public void setAddr(String addr)
    {
        this.addr = addr;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getDepartmentId()
    {
        return departmentId;
    }
    
    public void setDepartmentId(String departmentId)
    {
        this.departmentId = departmentId;
    }
    
    public String getUserLevel()
    {
        return userLevel;
    }
    
    public void setUserLevel(String userLevel)
    {
        this.userLevel = userLevel;
    }
    
    public String getRoleId()
    {
        return roleId;
    }
    
    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }
    
    public String getFailedReason()
    {
        return failedReason;
    }
    
    public void setFailedReason(String failedReason)
    {
        this.failedReason = failedReason;
    }
    
    public String getOldPassword()
    {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword)
    {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword()
    {
        return newPassword;
    }

    public void setNewPassword(String newPassword)
    {
        this.newPassword = newPassword;
    }

    public String getBindNum()
    {
        return bindNum;
    }

    public void setBindNum(String bindNum)
    {
        this.bindNum = bindNum;
    }

    public String getHomePhone()
    {
        return homePhone;
    }

    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }

    public String getCellPhone()
    {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone)
    {
        this.cellPhone = cellPhone;
    }

    public String getOfficePhone()
    {
        return officePhone;
    }

    public void setOfficePhone(String officePhone)
    {
        this.officePhone = officePhone;
    }

    public String getShortPhone()
    {
        return shortPhone;
    }

    public void setShortPhone(String shortPhone)
    {
        this.shortPhone = shortPhone;
    }

    public String getOtherPhone()
    {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone)
    {
        this.otherPhone = otherPhone;
    }

    public static IDeviceManager getDeviceManager()
    {
        return deviceManager;
    }
    
    public static void setDeviceManager(IDeviceManager deviceManager)
    {
        Account.deviceManager = deviceManager;
    }
    
    /**
     * 添加账号
     * @param userId
     * @param sip
     * @return
     * @throws SDKException
     */
    public SDKResult<String> addAccount(String userId, Account account)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKResult<String> result = accountCapability.addAccount(userId, account);
        return result;
    }

    /**
     * 批量添加账号
     * @param userId
     * @param accounts
     * @return
     * @throws SDKException
     */
    public SDKResult<BatchAccount> batchAddAccount(String userId, List<Account> accounts)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKResult<BatchAccount> result = accountCapability.batchAddAccount(userId, accounts);
        return result;
    }

    /**
     * 修改账号
     * @param userId
     * @param account
     * @return
     * @throws SDKException
     */
    public SDKErrorCode modifyAccount(String userId, Account account)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKErrorCode result = accountCapability.modifyAccount(userId, account);
        return result;
    }

    /**
     * 删除账号
     * @param userId
     * @param accountId
     * @return
     */
    public SDKErrorCode deleteAccount(String userId, String accountId)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKErrorCode result = accountCapability.deleteAccount(userId, accountId);
        return result;
    }

    /**
     * 批量删除账号
     * @param userId
     * @param accountIds
     * @return
     * @throws SDKException
     */
    public SDKResult<BatchAccount> batchDelAccount(String userId, List<String> accountIds)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKResult<BatchAccount> result = accountCapability.batchDelAccount(userId, accountIds);
        return result;
    }

    /**
     * 查询账号
     * @param userId
     * @param exactSearch
     * @param condition
     * @param pageCount
     * @param pageNum
     * @return
     * @throws SDKException
     */
    public SDKResult<BatchAccount> getAccount(String userId, String exactSearch, String condition, int pageCount, int pageNum)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKResult<BatchAccount> result = accountCapability.getAccount(userId, exactSearch, condition, pageCount, pageNum);
        return result;
    }

    /**
     * 修改密码
     * @param userId
     * @param account
     * @return
     */
    public SDKErrorCode modifyAcountPassword(String userId, Account account)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKErrorCode result =
            accountCapability.modifyAcountPassword(userId, account);
        return result;
    }

    /**
     * 绑定号码
     * @param userId
     * @param account
     * @return
     * @throws SDKException
     */
    public SDKErrorCode bindNum(String userId, Account account)
        throws SDKException
    {
        IAccountCapability accountCapability =
            getDeviceManager().getDeviceServiceProxy(ConfigManager.getInstance().getValue("esdk.uc_bmu_device"),
                IAccountCapability.class);
        SDKErrorCode result =
            accountCapability.bindNum(userId, account);
        return result;
    }
}
