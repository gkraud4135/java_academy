package com.lec206.ex01_class;

public class StudentMain {

	public static void main(String[] args) {
		
		Student 초딩이 = new Student();
		Student 중딩이 = new Student();
		Student 고딩이 = new Student();

		초딩이.name = "초등학생";
		중딩이.name = "중학생";
		고딩이.name = "고등학생";
		
		초딩이.study("산수");
		중딩이.study("수학");
		고딩이.study("미적분");
	}

}
