package com.lec206.ex04_tree.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain2 {

	public static void main(String[] args) {

		TreeMap<Integer, String> scores = new TreeMap<>(); 
		
		scores.put(87, "홍길동");
		scores.put(98, "홍길순");
		scores.put(75, "홍길자");
		scores.put(95, "홍길녀");
		scores.put(80, "소향");
		
		// descendingMap(), descendingEntrySet()
		NavigableMap<Integer, String> dm = scores.descendingMap();
		Set<Map.Entry<Integer, String>> des = dm.entrySet();
		for(Map.Entry<Integer, String> entry:des) {
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}//내림차순
		System.out.println();
		
		NavigableMap<Integer, String> am = dm.descendingMap(); //Map으로 Navi입히고
		Set<Map.Entry<Integer, String>> asc = am.entrySet(); //entry 키 값 넣어줌
		for(Map.Entry<Integer, String> entry:asc) { //키 값 따로 출력
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}//오름차순
		
	}

}
