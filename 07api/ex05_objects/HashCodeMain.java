package com.lec206.ex05_objects;

import java.util.Objects;

/*
	Objects 클래스
	
	3. 해시코드생성(hash(), hashCode())
	
	   Objects.hash(Object ... values)메서드는 주어진 값들을 이용해서 해시코드를 생성
	   하는 역할을 한다. 주어진 매개값들로 배열을 생성하고 Arrays.hashCode(Object[])를
	   호출해서 해시코드를 얻고 이 값을 리턴한다.
	   
	   이 메서드는 클래스가 hashCode()를 재정의할 때 리컨값을 생성하기 위해 사용하면 좋다.
	   클래스가 여러가지 필드값을 가지고 있을 때 이 필드들로 부터 해시코드를 생성하게 되면
	   동일한 필드값을 가지는 객체는 동일한 해시코드를 얻을 수 있다.
	   
*/
public class HashCodeMain {

	static class Student {
		
		int sno;
		String name;
		
		public Student(int sno, String name) {
			this.name = name;
			this.sno = sno;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "소향");
		Student s2 = new Student(1, "소향");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));
	}

}
















