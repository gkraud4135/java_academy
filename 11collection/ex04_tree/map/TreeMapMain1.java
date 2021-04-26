package com.lec206.ex04_tree.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "홍길동"); // 키와 값을 가지고있다
		scores.put(98, "홍길순");
		scores.put(75, "홍길자");
		scores.put(95, "홍길녀");
		scores.put(80, "소향");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();			//키와 값을 따로 호출이 가능하다
		System.out.println("가장 낮은 점수 = " + entry.getValue() + ":" + entry.getKey() );
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 = " + entry.getValue() + ":" + entry.getKey() );
		
		entry = scores.lowerEntry(95);
		System.out.println("95 바로 아래 점수 = " + entry.getValue() + ":" + entry.getKey() );
		
		entry = scores.higherEntry(95);
		System.out.println("95 바로 위 점수 = " + entry.getValue() + ":" + entry.getKey() );
		
		entry = scores.floorEntry(95);
		System.out.println("95 이거나 바로 아래 점수 = " + entry.getValue() + ":" + entry.getKey() );
		
		entry = scores.ceilingEntry(95);
		System.out.println("95 이거나 바로 위 점수 = " + entry.getValue() + ":" + entry.getKey() );
		System.out.println();
		
		while(!scores.isEmpty()) {//scores가 없을때까지
//			entry = scores.pollFirstEntry();
			entry = scores.pollLastEntry(); //entry에 높은순서대로 넣어서 출력
			System.out.println(entry.getValue() + "=" + entry.getKey() +
					"(남은 객체수 = " + scores.size() + ")");
		}
	}

}
