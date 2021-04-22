package com.lec206.ex02_name;

public class ThreadNameMain {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램시작 쓰레드이름 = " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("작업 쓰레드이름 = " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 쓰레드이름 = " + threadB.getName());
		threadB.start();
		
		ThreadB threadC = new ThreadB();
		System.out.println("작업 쓰레드이름 = " + threadC.getName());
		threadC.start();
		
	}

}
