package com.lijie.domain;

import java.util.Date;

public class YsUser {
	private Integer id;
	
	private String name;
	
	private Boolean gender;
	
	private Date birthday;
	
	private String addr;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	
	public Boolean getGender() {
		return gender;
	}
	
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr == null ? null : addr.trim();
	}
	
	public YsUser(Integer id, String name, Boolean gender, Date birthday, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.addr = addr;
	}
	
	public YsUser(String name, Boolean gender, Date birthday, String addr) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "YsUser [id="+ id + ", name=" + name + ", gender=" + gender + ", birthday="
				+ birthday + ", addr=" + addr + "]";
	}
	
}