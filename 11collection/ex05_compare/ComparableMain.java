package com.lec206.ex05_compare;

import java.util.Iterator;
import java.util.TreeSet;

/*
Comparable과 Comparator

TreeSet과 TreeMap의 키는 저장과 동시에 자동으로 오름차순으로 정렬되는데 
숫자(Double, Integer)타입일 경우는 값으로 정력하고 문자열(String)타입일
경우는 유니코드로 정렬된다.

TreeSet객체와 TreeMap은 정렬을 하기 위해 java.lang.Comparable인터페이스를
구현한 객체를 요구하는데 Integer, Double, String은 모두 Comparable인터페이
스를 구현하고 있다. 

사용자 정의클래스도 Comparable을 구현한다면 자동으로 정렬을 할수가 있다. 
Comparable인터페이스는 compareTo()메서드가 정의되어 있기 땜ㄴ에 사용자가
정의하는 클래스에선 compareTo()메서드를 재정의한 후 값을 만들어 내여 한다.

compareTo()는 int값을 리턴하는데 객체가 동일할 경우 0, 객체보다 적을 경우는
-1, 객체보다 클 경우에는 1을 리턴한다.

TreeSet객체와 TreeMap의 키가 Comparable을 구현하고 있는 않을 경우에는 저장하는
순간 ClassCastException예외가 발생한다.

*/
public class ComparableMain {//TreeSet,Map에서 객체를 추가할땐 객체가 정렬기준이 없기때문에
							 //객체클래스에 Comparable Comparator을 해줘야한다

	public static void main(String[] args) {
		
		TreeSet<Person> ts = new TreeSet<>();
		
		ts.add(new Person("홍길동", 80));
		ts.add(new Person("소향", 90));
		ts.add(new Person("손흥민", 85));
		ts.add(new Person("윤여정", 89));
		
		Iterator<Person> person = ts.iterator();
		while(person.hasNext()) {
			Person per = person.next();
			System.out.println(per.name + "=" + per.age);
		}
	}
}

class Person  implements Comparable<Person> { //정렬기준 없으면 에러
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) { //오름차순
		if(age < o.age) return -1;  //매개와 비교해 본인이 더작으면-1
		else if(age == o.age) return 0; //같 0
		else return 1; //크면 +1 그러면 결국 값끼리 비교가 되고 age로 비교해 오름차순으로정렬된다
	}
}