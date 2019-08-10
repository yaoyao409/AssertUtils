package com.chenweiguang.entity;

import java.util.Date;

public class Persons {
	private String username;
	private Integer age;
	private String about;
	private Date pdate;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public Persons(String username, Integer age, String about, Date pdate) {
		super();
		this.username = username;
		this.age = age;
		this.about = about;
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", about=" + about + ", pdate=" + pdate + "]";
	}
	

}
