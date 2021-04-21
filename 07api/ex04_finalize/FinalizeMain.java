package com.lec206.ex04_finalize;

public class FinalizeMain {

	public static void main(String[] args) {
		
		String name = "소향"; // new String("소향");
		name = null;
		
		Counter counter = null;
		for (int i=0;i<50;i++) {
			counter = new Counter(i);
			counter = null; // 생성된 객체를 더이상 참조하지 않음
			System.gc(); // GC에게 사용하지 않는 객체를 heap영역에서 제거 명령
		}
	}

}
