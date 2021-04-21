package com.lec206.ex03_clone.thin;

// implements Cloneable의 의미는 객체를 복제할 수 있다
// 는 의미. 이 정의가 없으면 객체를 복제할 수 없다.
public class Member implements Cloneable {

	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int scores[] = {90,88,92};
	
	public Member(String id, String name, String password, 
			int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		
		Member cloned = null;
		
		try {
			cloned = (Member) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cloned;	
	}
}
