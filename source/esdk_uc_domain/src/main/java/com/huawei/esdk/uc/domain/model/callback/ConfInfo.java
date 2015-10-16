package com.huawei.esdk.uc.domain.model.callback;

import java.util.List;

public class ConfInfo {
	/*
	 * 会议主题
	 */
	private String subject;
	
	/*
	 * 是否录音
	 */
	private String record;
	
	/*
	 * 主持人号码
	 */
	private String emCee;
	
	/*
	 * 创建者
	 */
	private String creator;
	
	/*
	 * 人数
	 */
	private int num;
	
	private List<ConfUser> users;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getEmCee() {
		return emCee;
	}

	public void setEmCee(String emCee) {
		this.emCee = emCee;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public List<ConfUser> getUsers() {
		return users;
	}

	public void setUsers(List<ConfUser> users) {
		this.users = users;
	}
}
