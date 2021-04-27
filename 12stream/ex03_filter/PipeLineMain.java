package com.lec206.ex03_filter;

import java.util.Arrays;
import java.util.List;

public class PipeLineMain {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 39),
				new Member("홍길자", Member.FEMALE, 34),
				new Member("홍길녀", Member.FEMALE, 23),
				new Member("홍길상", Member.MALE, 30));
		
		// 남자회원의 평균나이
		double ageAvg = list.stream()
				.filter(m -> m.getGender() == Member.MALE)       // list 스트림데이터에서 남자회원만 필터링
				.mapToInt(Member :: getAge)     // 필터링결과에서 회원나이만 mapping
				.average()      // 회원나이의 평균을 OptionalDouble에 저장
				.getAsDouble(); 
		System.out.println("남자회원의 평균나이 = " + ageAvg);
	} 
}
//filter(n -> n.startsWith("소"))
class Member {
	
	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int gender;
	private int age;

	public Member(String name, int gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	public int getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
}