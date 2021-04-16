package com.lec206.ex01_class;
/*
클래스

1. 선언규칙
   1) 하나이상의 문자로 이루어져야한다. 단, 첫 글자는 대문자로 시작해야하고
      한글이름도 가능하다. 다만, 관례적으로 영문이름을 사용한다.
   2) 첫 번째 문자는 숫자가 올 수 없다.
   3) $, _이외의 특수문자는 사용할 수 없다.
   4) 자바 키워드(int, for, if...)는 사용할 수 없다.

2. 클래스를 선언하는 키워드는 class는 반드시 소문자로 해야 한다.
3. 일반적으로 소스파일 하나당 한 개의 클래스를 정의하지만 2개이상의 클래스도 선언이
   가능하다. 다만 클래스 하나당 ~.class파일이 각각 생성된다.
   제약사항은 소스파일명과 동일한 클래스에만 public(접근제한자)를 선언할 수 있다. 

*/

public class Human {
	String name;
	String gender;
	int age;
	
	void speak() { System.out.println("말을 한다.");}
	void speak(String lang) { System.out.println(lang  + "말을 한다.");}
	
	void eat() { System.out.println("먹는다.");}
}
class Car {}
class Tire {}