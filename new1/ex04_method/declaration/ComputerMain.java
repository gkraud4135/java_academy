package com.lec206.ex04_method.declaration;

public class ComputerMain {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		Coumputer com = new Coumputer();
		System.out.println("1~10까지의 합은 " + com.sum());
		System.out.println("1~10까지의 합은 " + com.sum(1,2,3));
		System.out.println("1~10까지의 합은 " + 
				com.sum(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println("1~10까지의 합은 " + 
				com.sum1(1,2,3,4,5,6,7,8,9,10));
		System.out.println("1~100까지의 합은 " + 
				com.sum1(1,2,3,4,5,6,7,8,9,10,11,2,2,2,2,2,2,2,2));
	}

}
// c:\>java.exe com.lec206.ex04_method.declaration.CompupterMian.class 1 2 3 4 5