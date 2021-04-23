package com.lec206.ex01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {
		
		// ArrayList vs LinkedList 성능비교
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime, endTime;
		
		// ArrayList
		startTime = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간 = " + (endTime - startTime) + "ns");
		
		// LinkedList
		startTime = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간 = " + (endTime - startTime) + "ns");
		
	}

}
