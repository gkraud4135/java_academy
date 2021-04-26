package com.lec206.ex03_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map Collection
	
	Map컬렉션은 key와 value으로 구성된 Map.Entry객체를 저장하는 구조를 가지고 있다.
	키와 값은 모두 객체이다. 키는 중복불가이나 값은 중복저장이 가능ㅎ다. 만약 기존에
	저장된 key와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체가
	된다.
	
	Map컬렉션에는 HashMap, HashTable, LinkedHashMap, Properties, TreeMape등이 있다.
	
	값을 얻고자할 경우에는 2가지 방법이 있다. 키를 알고 있다면 get(키)메서드로 간단히
	객체를 찾어올 수 있지만 저장된 전체 객체를 대상으로 하나씩 갑을 가져올 경우에는
	
	1. ketSet()메서드로 모든 키를 Set컬렉션으로 얻은 다음 반복자를 통해 키를 하나씩
	   읽어서 get()메서드로 값을 얻는 방법
	2. entrySet()메서드로 모든 Map.Entry객체를 Set컬렉션으로 얻은 다음 반복자를 통해
	   Map.Entry객체를 하나씩 읽어서 getKey()와 getValue()메서드를 이용하는 방법이 있다.
*/
public class HashMapMain1 {

	public static void main(String[] args) {
		
		// 1. Map컬렉션을 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 2. 객체를 저장
		map.put("홍길동", 85);
		map.put("홍길순", 90);
		map.put("홍길자", 80);
		map.put("홍길녀", 95);
		map.put("홍길동", 99); // 에러는 발생하지 않지만 마지막 값이 저장된다.
		System.out.println("총객체수 = " + map.size());
		
		// 3. 객체를 검색 : 순서가 없기 때문에 key값으로 검색
		System.out.println("홍길동의 점수 = " + map.get("홍길동"));
		System.out.println();
		
		// 4. 전체객체검색(1) - keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> keys = keySet.iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			Integer value = map.get(key);
			System.out.println(key +"의 점수 = " + value);
		}
		System.out.println();
		
		// 5. 전체객체검색(2) - entrySet()
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entrys = entrySet.iterator();
		while(entrys.hasNext()) {
			Map.Entry<String, Integer> entry = entrys.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key +"의 점수 = " + value);			
		}
		System.out.println();
		
		// 6. 객체삭제
		map.remove("홍길동");
		keySet = map.keySet();
		keys = keySet.iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			Integer value = map.get(key);
			System.out.println(key +"의 점수 = " + value);
		}
		System.out.println();
		
		// 7. 전체삭제
		map.clear();
		System.out.println("총객체수 = " + map.size());
		

	}
	
}
