package com.lec206.ex02_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("소향", 42));
		set.add(new Member("소향", 42));
		set.add(new Member("홍길동", 100));
		System.out.println("총객체수 = " + set.size());
		
		for(Member member:set) {
			System.out.println(member.toString());
		}

	}

}

class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// name과 age가 같다면 동일hashCode를 리턴
		System.out.println(name.hashCode());
		return name.hashCode() + age;
	}
	
//    @Override
//	public boolean equals(Object obj) {
//		// name과 age가 같다면 동일객체로 판단
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			return member.name.equals(name) && (member.age == age);
//		} else {
//			return false;
//		}
//	}	
    
    @Override
    public String toString() {
    	return "Member [name=" + name + ", age=" + age + "]";
    }
}