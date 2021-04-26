package com.lec206.ex04_tree.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapMain3 {

	public static void main(String[] args) {

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("orange", 20);
		treeMap.put("banana", 30);
		treeMap.put("cherry", 40);
		treeMap.put("mango", 10);
		treeMap.put("pea", 20);
		treeMap.put("for", 30);

		// c~f사이의 단어검색  entry는 키,값을가진다
		NavigableMap<String, Integer> rm = treeMap.subMap("c", true, "pea", false);
		for(Map.Entry<String, Integer> entry:rm.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "개");
		}
	}

}
