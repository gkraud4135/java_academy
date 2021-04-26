package com.lec206.ex04_tree.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMain3 {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("apple");
		treeSet.add("orange");
		treeSet.add("forever");
		treeSet.add("banana");
		treeSet.add("zoo");
		treeSet.add("tiger");
		treeSet.add("cherry");
		treeSet.add("for");
		treeSet.add("c");
		treeSet.add("f");

		// c~f사이의 단어를 검색
		System.out.println("[c~z사이의 단어 검색]");
		NavigableSet<String> rangeset = treeSet.subSet("c", true, "zoo", false);
		for(String word:rangeset) {
			System.out.println(word);
		}
	}

}
