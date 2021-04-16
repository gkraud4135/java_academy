package com.lec206.ex04_mothod.declaration;

public class ComputerMain {

	public static void main(String[] args) {

		System.out.println(args.length);
		System.out.println();
		Computer computer = new Computer();
		
		computer.sum(10); 
		computer.sum(1,2,3,4); 
		System.out.println(computer.sum(new
		int[] {1,2,3,4,5,6,7,8,9,10}));
		 
		System.out.println(computer.sum1(1,2,3,4,5,6,7,8,9,10,11,12,13));
	}

}
