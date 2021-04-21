package com.lec206.ex03_clone.thin;

public class MemberMain {

	public static void main(String[] args) {
		
		Member original = new Member("sohyang", "소향", "12345", 42, true);
		Member cloned = original;
		
		System.out.println(original.password);
		System.out.println(cloned.password);
		original.password = "abcdefg";
		System.out.println(original.password);
		System.out.println(cloned.password);
		System.out.println(original.password.hashCode());
		System.out.println(cloned.password.hashCode());
		
		original.age = 100;
		System.out.println(original.age);
		System.out.println(cloned.age);
		System.out.println();
		
		Member cloned1 = original.getMember();
		System.out.println("원본객체 암호 = " + original.password);
		System.out.println("복제객체 암호 = " + cloned1.password);
		original.password = "67890";
		System.out.println("원본객체 암호 = " + original.password);
		System.out.println("복제객체 암호 = " + cloned1.password);
		System.out.println();	
		
		original.name = "홍길동";
		System.out.println("[원본객체]");
		System.out.println(original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		System.out.println(original.scores[0]);
		System.out.println();
		
		System.out.println("[복제객체]");
		System.out.println(cloned1.id);
		System.out.println(cloned1.name);
		System.out.println(cloned1.password);
		System.out.println(cloned1.age);
		System.out.println(cloned1.adult);
		System.out.println(cloned1.scores[0]);
		System.out.println();
		
		System.out.println(original.hashCode());
		System.out.println(cloned1.hashCode());
		System.out.println();
		
		System.out.println(original.scores.hashCode());
		System.out.println(cloned1.scores.hashCode());
		System.out.println();
		
		cloned1.scores[0] = 100;
		System.out.println(original.scores[0]);
		System.out.println(cloned1.scores[0]);
		
		
	}

}






















