package com.lec206.ex04_tree.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMain2 {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<>(); //
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// TreeSet은 자동으로 정렬되어서 저장된다. 기본 오름차순
		for(Integer score:scores) { //score에 저장하고 출력
			System.out.print(score + ", ");
		}
		System.out.println();
		
		// 정렬하기 : 각 저장되어있는 설정값으로 출력
		// descendingSet()      : NavigableSet을 리턴 
		// descendingIterator() : Iterator를 리턴
		//descendingIterator() : 내림차순으로 정렬된 Iterator를 리턴
		//descendingSet() : 내림차순으로 정렬된 NavigableSet 반환

		
		NavigableSet<Integer> descSet = scores.descendingSet();
		for(Integer score:descSet) {
			System.out.print(score + ", ");
		}
		System.out.println();		
		
		NavigableSet<Integer> ascSet = descSet.descendingSet();
		for(Integer score:ascSet) {
			System.out.print(score + ", ");
		}
		System.out.println();		
		
	}

}















