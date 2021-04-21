package com.lec206.ex03_clone.deep;

public class MemberMain {

	public static void main(String[] args) {
		
		Member original = new Member("sohyang", "소향", "12345", 42, 
				true, new Car("벤츠"));
		Member cloned = original.getMember();
		
		cloned.scores[0] = 100;
		System.out.println(original.scores[0]);
		System.out.println(cloned.scores[0]);
		
		cloned.car.model = "포르쉐";
		System.out.println(original.car.model);
		System.out.println(cloned.car.model);
		
	}

}
