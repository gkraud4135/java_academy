package com.lec206.ex04_tree.set;

import java.util.TreeSet;

/*
	TreeSet
	
	TreeSet은 이진트리(binary tree)를 기반으로 한 Set컬렉션이다. 하나의 노드는
	노드값인 value와 왼쪽, 오른쪽노드를 참조하기 위한 두개의 변수로 구성된다.
	
	TreeSet에 객체를 저장하면 자동으로 정렬괴는데 부모값과 비교해서 낮은 것은
	왼쪽, 높은 것은 오른쪽노드에 저장한다.
	
	TreeSet은 Set인터페이스변수에 대입해도 되지만 TreeSet클래스타입으로 대입한다.
	그 이유는 객체를 검색하거나 범위 검색과 관련 메서드를 사용할 수 있기 때문이다.
*/
public class TreeSetMain1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>(); //생성
		
		scores.add(new Integer(87));
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		// 가장 낮은 점수 last높은
		score = scores.first();
		System.out.println("가장 낮은 점수 = " + score);
		System.out.println("가장 높은 점수 = " + scores.last());
		System.out.println("95 바로 아래 점수 = " + scores.lower(95));
		System.out.println("95 바로 위 점수 = " + scores.higher(95));
		System.out.println("95이거나 바로 아래 점수 = " + scores. floor(95));
		System.out.println("95이거나 바로 위 점수 = " + scores.ceiling(95));
		System.out.println();
		
		while(!scores.isEmpty()) { //없을때까지
			// score = scores.pollFirst();
			score = scores.pollLast(); //가장큰것부터 출력 작은것 first
			System.out.println(score + "(남은 객체 수 = " + scores.size() + ")");
		}
	}

}


















