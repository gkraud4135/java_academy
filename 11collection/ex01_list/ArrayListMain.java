package com.lec206.ex01_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // 기본 10개;
		
		// 1. 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Python");
		list.add("R");
		list.add("C#");
		list.add("C++");
		
		System.out.println("총객체수 = " + list.size());
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + "=" + str);
		}
		System.out.println();
		
		// 2. 삽입
		list.add(2, "Spring");
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + "=" + str);
		}
		System.out.println();
		
		// 3. 삭제
		list.remove(2); // Spring
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + "=" + str);
		}
		System.out.println();	

		list.remove(2); // Python
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + "=" + str);
		}
		System.out.println();	
		
		list.remove("JDBC"); // JDBC
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + "=" + str);
		}
		System.out.println();
		
		// 4. 중복
		list.add("R");
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + "=" + str);
		}
		System.out.println();	
		
		// 5. 전체삭제
		list.clear();
		System.out.println("총객체수 = " + list.size());		
	}

}
