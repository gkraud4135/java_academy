package com.lec206.ex06_lifo_fifo;

import java.util.Stack;

/*
	LIFO와 FIFO 컬렉션
	
	후입선출(LIFO Last In First Out)은 맨 마지막에 저장된 객체가 먼저 읽어오는 자료구조이고
	반대로 선입선출(FIFO First In First Out)은 맨 처음에 저장된 객체를 먼저 읽어오는 자료구
	조를 말한다.
	
	컬렉션 프레임워크에는 LIFO자료구조를 제공하는 Stack클래스와 FIFO자료구조를 제공하는 Queue
	인터페이스를 제공하고 있다.
	
	1. Stack
	 
	   Stack클래스는 LIFO자료구조를 구현한 클래스이다. 주요 메서드는
	   
	   1) push(E item) : 주어진 객체를 stack에 저장
	   2) peek() : 맨 마지막에 저당된 객체를 가져온후에 객체를 스택에서 제거하지 않는다.
	   3) pop() : 맨 마지막에 저당된 객체를 가져온후에 객체를 스택에서 제거한다.
	 
	2. Queue
	
	   Queue인터페이스는 FIFO자료구조를 구현한 인터페이스이고 주요메서드는
	   
	   1) offer(E item) : 주어진 객체를 queue에 저장
	   2) peek() : 객체를 가져온 후에 queue에서 제거하지 않는다.
	   3) poll() : 객체를 가져온 후에 queue에서 제거한다.
*/
public class StackMain {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) { //출력시 나중에넣은 10원부터 꺼내진다
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 = " + coin.getValue() + "원");					
		}

	}

}

class Coin {
	
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
