package com.lec206.ex02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
	Set 컬렉션
	
	List컬렉션은 저장순서를 유지하지만 Set컬렉션은 저장순서를 유지하지 않고 또한 객체를 
	중복할 수 없다.(null도 저장가능하지만 단 하나의 null값만 저장할 수 있다.)
	Set컬렉션은 HashSet, TreeSet, LinkedSet등이 있다. Set컬렉션은 순서가 없어서 인덱스로
	객체를 검색할 수 없다. 대신에 전체 객체를 한번씩 반복해서 가져오는 반복자(Iterator)를
	제공한다. 반복자는 Iterator인터페이스를 구현한 객체를 말하는데 iterator()메서드를 호출
	하면 자료를 얻을 수 있다.
	
	Iterator에는 아래와 같은 메서드가 있다.
	
	1. hasNext() : 가져올 자료가 있다면 true, 없으면 false를 리턴한다.
	2. next()    : 컬렉션에서 한개의 자료(객체)를 가져온다.
	3. remove()  : 컬렉션에서 객체를 삭제한다.
	
	HashSet은 객체들을 순서없이 저장하고 동일한 객체는 중복저장하지 않는다. 하지만 HashSet이
	판단하는 동일객체란 꼭 같은 인스턴스를 의미하지는 않는다. HashSet객체를 저장하기 전에 먼저
	객체의 hashCode()메서드를 호출해서 해시코드를 가져오고 이미 저장되어 있는 객체들의 해시코드
	를 비교한다.
	
	만약, 동일한 hashcode가 있다면 다시 equals()메서드로 두 객체를 비교해서 true가 리턴되면
	동일 객체로 판단하고 중복저장하지 않는다.
	
*/
public class HashSetMain1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("DataBase");
		set.add("Python");
		set.add("R");
		set.add("JDBC");
		set.add("Java"); // 에러는 발생하지 않지만 중복저장되지는 않는다.
		
		int size = set.size();
		System.out.println("총객체수는 " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println();
		
		set.remove("DataBase");
		System.out.println("총객체수는 " + set.size());
		for(String element:set) {
			System.out.println(element);
		}
		System.out.println();
		
		set.clear();
		System.out.println("총객체수는 " + set.size());
		
	}

}













