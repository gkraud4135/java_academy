package com.lec206.ex04_finalize;

/*
	객체소멸자(finalize)
	
	참조하지 않는 객체(배열등)는 GC(Garbage Collector)가 힙영역에서 자동적으로
	소멸(삭제)시킨다. GC는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자를
	실행 시킨다. 소멸자는 Object.finalize()메서드를 말하는 데 이 메서드에는 실행
	할 내용이 없다.
	
	만약, 객체가 소멸되기 전에 실행할 내용이 있다면 개발자가 이 메서드를 재정의
	해서 사용할 수가 있다.
	
 */
public class Counter {

	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행되었습니다!");
	}
}
