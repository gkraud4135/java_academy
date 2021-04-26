package com.lec206.ex03_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain2 {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "소향"), 95);
		map.put(new Student(1, "소향"), 95);
		System.out.println("총 객체수 = " + map.size());

	}

}

class Student {
	
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name +"]";
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.contentEquals(student.name));
		} else {
			return false;
		}
	}
}