package com.lec206.ex10_get_set;

public class Person {
	
	private String name;
	private String ssn;
	private String memberId;
	private String password;
	private String address;
	private int age;
	private boolean 질병;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void set질병(boolean 질병) {
		this.질병 = 질병;
	}
	
	@Override
	public String toString() {
		return name +", " + ssn;
	}
	

}
