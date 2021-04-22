package com.lec206.ex10_arrays;

import java.util.Arrays;

public class ArraysMethodMain {

	public static void main(String[] args) {
		
		// 1. 기본타입 정렬 및 검색
		int[] scores = {99,98,97};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println(index);
		System.out.println();
		
		// 2. String 정렬 및 검색
		String[] names = {"홍길동", "류관순", "임꺽정"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println(index);
		System.out.println();
		
		// 3. 객체 정렬 및 검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("류관순");
		Member m3 = new Member("임꺽정");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		index = Arrays.binarySearch(members, m1);
		System.out.println(index);

	}

}

class Member implements Comparable<Member>  {

	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member m) {
		// TODO Auto-generated method stub
		return name.compareTo(m.name); // -1, 0, 1
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}