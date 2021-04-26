package com.lec206.ex02_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>(); //Set을 Hashset으로 생성
		
		set.add(new Member("소향", 42));  //객체추가
		set.add(new Member("소향", 42));
		set.add(new Member("홍길동", 100));
		System.out.println("총객체수 = " + set.size());
		
		for(Member member:set) {  //출력 
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
		return name.hashCode() + age;  //해쉬코드를 설정 값을 숫자로 변경하여
										//컴파일러시 확인할수있게 변별을줌
	}
	
    @Override
	public boolean equals(Object obj) { 
	// name과 age가 같다면 동일객체로 판단
		if(obj instanceof Member) { //같은Member클래스의 객체이면
			Member member = (Member)obj; //object에서 Member로 형변환
			return member.name.equals(name) && (member.age == age); //name이랑 age가 같으면
			//name은 String이라equals								//true
		} else {
			return false;
		}
	}	
    
    @Override
    public String toString() {
    	return "Member [name=" + name + ", age=" + age + "]";
    }
}