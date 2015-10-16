function LanguageControllerZH()
{
	this.language = {
		tree : {
			"typicalApplication" : "典型功能",
		
			"CTD" : "CTD呼叫管理",
			"createCTD" : "createCTD",
			
			"addressBook" : "通讯录同步",									
			"addAccount" : "addAccount",			
			"queryAccount" : "queryAccount",
		},

		titles : {
			"om" : "eSDK UC2.2 BS Demo",
			"language" : "语言",
			"description" : "描述",
			"execution" : "执行",
			"sourceCode" : "源码",
			
			"createCTDFunction" : "接口功能",
			"createCTDFunctionDesc" : "此接口用于发起CTD呼叫",
			"createCTDAccess" : "访问路径",
			"createCTDAccessDesc" : "http://{ip}:{port}/esdk/rest/uc/appserver/ctd",
			"createCTDRequestType" : "请求类型",
			"createCTDRequestTypeDesc" : "POST",
			"createCTDParamFormat" : "参数格式",
			"createCTDParamFormatDesc" : "application/json;charset=UTF-8",
			
			"inputParameterDesc" : "输入参数描述:",
			"outputParameterDesc" : "返回参数描述:",
			"resultCodeDesc" : "返回消息码，0代表成功，其他请参见错误码",
			"resultContextDesc" : "返回消息体，记录成功或失败的具体信息",
			
			"resultDesc" : "添加成功后返回帐号ID",
			
			"accountParam" : "UC帐号:",
			"callerParam" : "主叫号码:",
			"calleeParam" : "被叫号码:",
			"createCTD" : "发起CTD呼叫",
			"input" : "输入:",
			"output" : "输出:",
			"resultCode" : "返回码:",
			"resultContext" : "返回消息:",
									
			"inputParameter" : "参数",
			"inputType" : "数据类型",			
			"inputRestriction" : "约束",
			"inputDescription" : "描述",									
			"accountParamDesc" : "手机客户端登录的UC帐号",
			"callerParamDesc" : "主叫号码",
			"calleeParamDesc" : "被叫号码",
			
			"accountNull" : "UC帐号不能为空",
			"callerNull" : "主叫号码不能为空",
			"calleeNull" : "被叫号码不能为空",
			
			"addAccountFunctionDesc" : "此接口用于添加帐号",
			"addAccountAccessDesc" : "http://{ip}:{port}/esdk/rest/uc/bmu/account",
			"addAccountRequestTypeDesc" : "POST",
			
			"userIdParam" : "操作用户ID:",
			"accountTypeParam" : "帐号类型：",
			"loginNameParam" : "登录名：",
			"passwordParam" : "登录密码：",
			"nameParam" : "用户姓名：",
			"sexParam" : "用户性别：",
			"homePhoneParam" : "家庭电话：",
			"cellPhoneParam" : "手机号码：",
			"officePhoneParam" : "办公电话：",
			"shortPhoneParam" : "短号：",
			"otherPhoneParam" : "其他电话：",
			"faxParam" : "传真号码：",
			"emailParam" : "电子邮箱：",
			"addrParam" : "联系地址：",
			"titleParam" : "职务：",
			"departmentIdParam" : "部门ID：",
			"userLevelParam" : "用户帐号级别ID：",
			"roleIdParam" : "用户帐号角色ID：",
			
			"addAccount" : "添加帐号",
			"result" : "返回值：",
			
			"userIdParamDesc" : "操作用户ID，例如：“12345”",
			"accountTypeParamDesc" : "帐号类型：0：普通帐号2：UC帐号",
			"loginNameParamDesc" : "登录名，例如：“uc001”",
			"passwordParamDesc" : "登录密码 此密码需要采用AES128（使用协商工作密钥）算法加密，并使用BASE64编码。",
			"nameParamDesc" : "用户姓名，例如：“uc_test”",
			"sexParamDesc" : "用户性别：男性：Male女性：Female",
			"homePhoneParamDesc" : " 家庭电话，例如：“87654321”",
			"cellPhoneParamDesc" : "手机号码，例如：“13812345678”",
			"officePhoneParamDesc" : "办公电话，例如：“81234567”",
			"shortPhoneParamDesc" : "短号，例如：“54321”",
			"otherPhoneParamDesc" : "其他电话，例如：“812356789”",
			"faxParamDesc" : "传真号码，例如：“81234568”",
			"emailParamDesc" : "电子邮箱，例如：“a@b.com”",
			"addrParamDesc" : "联系地址，例如：“china.shenzhen”",
			"titleParamDesc" : "职务，例如：“manager”",
			"departmentIdParamDesc" : "UC帐号归属部门ID，可以通过查询部门获取部门ID。例如：“1000”",
			"userLevelParamDesc" : "UC帐号级别ID，可以通过查询用户级别获取级别ID。例如：“1”",
			"roleIdParamDesc" : "UC帐号角色ID，可以通过查询角色获得角色ID。例如：“1”",
			
			"userIdNull" : "操作用户ID不能为空",
			"accountTypeNull" : "帐号类型不能为空",
			"loginNameNull" : "登录名不能为空",
			"passwordNull" : "登录密码不能为空",
			"nameNull" : "用户姓名不能为空",
			"departmentIdNull" : "部门ID不能为空",
			"userLevelNull" : "用户帐号级别ID不能为空",
			"roleIdNull" : " 用户帐号角色ID不能为空",
			
			"queryAccountFunctionDesc" : "此接口用于查询帐号",
			"queryAccountAccessDesc" : "http://{ip}:{port}/esdk/rest/uc/bmu/account",
			"queryAccountRequestTypeDesc" : "GET",	
			
			"userIdParam" : "操作用户ID:",
			"exactSearchParam" : "是否精确查询：",
			"conditionParam" : "查询条件：",
			"pageCountParam" : "页面数：",
			"pageNumParam" : "当前分页：",
			
			"accountIdParam" : "帐号ID：",	
			"bindNumParam" : "绑定的SIP号码：",
			
			"queryAccount" : "查询帐号",
			
			"exactSearchParamDesc" : "是否精确查询：0：否1：是说明:精确查询只返回一条记录，当多于一条查询记录时返回错误码。",
			"conditionParamDesc" : "查询条件，只支持按“UC帐号”查询例如：“uc”",
			"pageCountParamDesc" : "分页查询页面数(0<pagecount<100)",
			"pageNumParamDesc" : "当前分页",
			
			"amountDesc" : " 符合条件的帐号总数。",
			"accountsDesc" : "UC帐号列表。",
			"accountIdParamDesc" : "帐号ID，帐号ID为添加帐号时返回的参数。",
			"bindNumParamDesc" : " 绑定的SIP号码",
			
			"userIdNull" : "操作用户ID不能为空",
			"exactSearchNull" : "是否精确查询不能为空",
			"conditionNull" : "查询条件不能为空",
			"pageCountNull" : "页面数不能为空",
			"pageNumNull" : "当前分页不能为空",
			
			"amount" : "返回帐号总数：",
			"accounts" : "返回UC帐号列表",
			"accountType" : "返回帐号类型：", 
			"accountId" : "返回帐号ID：",
			"loginName" : "返回登录帐号：",
			"name" : "返回用户姓名：",
			"sex" : "返回用户性别：",
			"homePhone" : "返回家庭电话：", 
			"cellPhone" : "返回手机：", 
			"officePhone" : "返回办公电话：",
			"shortPhone" : "返回短号：", 
			"otherPhone" : "返回其他电话：", 
			"fax" : "返回传真号码：", 
			"email" : "返回电子邮箱：", 
			"addr" : "返回联系地址：",
			"title" : "返回职务：", 
			"departmentId" : "返回帐号归属部门ID：",
			"userLevel" : "返回帐号级别ID：", 
			"roleId" : "返回帐号角色ID：",
			"bindNum" : "返回SIP号码：",
			
			"accountDesc" : "符合条件的帐号总数",
			"accountTypeDesc" : "帐号类型:0：普通帐号2：UC帐号",
			"accountIdDesc" : "帐号ID",
			"loginNameDesc" : "登录帐号",
			"nameDesc" : "用户姓名",
			"sexDesc" : "用户性别",
			"homePhoneDesc" : "家庭电话", 
			"cellPhoneDesc" : "手机",
			"officePhoneDesc" : "办公电话",
			"shortPhoneDesc" : "短号",
			"otherPhoneDesc" : "其他电话", 
			"faxDesc" : "传真号码", 
			"emailDesc" : "电子邮箱",
			"addrDesc" : "联系地址",
			"titleDesc" : "职务", 
			"departmentIdDesc" : "帐号归属部门ID",
			"userLevelDesc" : "帐号级别ID",
			"roleIdDesc" : "帐号角色ID",
			"bindNumDesc" : "UC帐号绑定的SIP号码",
			
			"operationSuccess" : "操作成功",
			"operationFailed" : "操作失败",
			"userAuthFailed" : "用户鉴权失败",
			
			"sourceCodeDesc" : "红色加粗部分代码为接口调用,其他颜色为模拟IDE开发工具中的色彩，便于阅读。",
			
			"descriptionUC" : "eSDK Server 支持UC2.2 业务的所有接口。eSDK 提供接口Rest 服务，调用者发送Rest 消息实现UC 接口功能",
			"copyright" : "版权所有 © 华为技术有限公司 1998-2015。 保留一切权利。粤A2-20044005号"
		}
	};
}