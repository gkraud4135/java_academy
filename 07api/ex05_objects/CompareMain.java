package com.lec206.ex05_objects;

import java.util.Comparator;
import java.util.Objects;

/*
	Objects클래스
	
	java.lang.Object와 유사한 이름을 가진 java.util.Objects클래스는 
	객의 비교, 해시코드 생성, null여부, 객체문자열리턴 등의 기능을 
	수행하는 정적메서드로 구성된 Object의 유틸리티클래스이다.
	
	1. 객체비교(compar(T a, T b, Comparator<T> c)
	
	   Objects.compare()메서드는 두 객체를 비교해서 int값을 리턴한다.
	   java.util.Comparator<T>는 제네릭 인터페이스 타입으로 두 객체를
	   비교하는 compare(T a, T b)메서드가 정의 되어 있다.
	
*/
public class CompareMain {

	static class Student {
		int sno;
		public Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class Car {}
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student a, Student b) {
			
//			if(a.sno < b.sno) return -1;
//			else if (a.sno == b.sno) return 0;
//			else return 1;
			
			return Integer.compare(a.sno, b.sno); // -1, 0, 1
		}
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		if(s1 == s2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		
//		result = Objects.compare(new Car(), new Car(), new StudentComparator());
	}

}
