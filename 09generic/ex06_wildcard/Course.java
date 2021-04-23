package com.lec206.ex06_wildcard;

// Course<?> : 수강생은 모든 타입의 수강등록(Person, Worker, Student, HighStudent)
// Course<? extends Student> : 수강생은 Student, HighStudent
// Course<? super Worker> : Worker, Person만 가능
public class Course<T> {

	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		super();
		this.name = name;
		this.students = (T[]) new Object[capacity]; // 수강등록인원수
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}			
	
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
