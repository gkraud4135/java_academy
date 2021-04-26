package com.lec206.ex05_compare;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorMain {

	public static void main(String[] args) {
		
		// Fruit가 Comparable인터페이스를 구현하지 않았기 때문에
		// 저장하는 순가 Exception이 발생
		// TreeSet<Fruit> ts = new TreeSet<>();
		// ts.add(new Fruit("사과", 1000));
		
		// Comparable을 구현하지 않고 Comparator를 만드는 방법
		TreeSet<Fruit> ts = new TreeSet<>(new DescComparator()); //생성된 비교자로 생성
		ts.add(new Fruit("사과", 1000));
		ts.add(new Fruit("바나나", 1500));
		ts.add(new Fruit("오렌지", 1200));
		
		Iterator<Fruit> fruit = ts.iterator();
		while(fruit.hasNext()) {
			Fruit f = fruit.next();
			System.out.println(f.name + "-" + f.price);
		}
	}

}


class Fruit {
	
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

class DescComparator implements Comparator<Fruit> {//Comparator을 따로 만들어 생성해사용

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return -1;
		else if (o1.price == o2.price) return 0;
		else return 1;
	}
	
}