package com.lec206.ex01_create;

import java.awt.Toolkit;

/*
	2. Thread하위 클래스로로 부터 생성
	
	작업쓰레드가 실행할 작업을 Runnable로 만들지 않고 Thread하위 클래스로 작업쓰레드를
	정의하면서 작업내용을 실행할 수 있다.
	
	Thread클래스를 상속한 후 run()메서드를 재정의해서 쓰레드가 실행할 코드를 작성하면
	된다. 작업쓰레드 클래스로 부터 객체를 생성하는 방법은 일반적인 객체를 생성하는 방법과
	동일하다.
*/
public class BeepPrintMain3 {

	public static void main(String[] args) throws InterruptedException {
		// Thread를 하위 클래스로 부터 생성하는 방법
		
		// 1. 외부클래스(Thread를 상속)
		// Thread thread = new BeepThread();
		
		// 2. 익명객체
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		thread.start();
		
		// 띵출력 5번
		for(int i=0;i<5;i++) {
			System.out.println("띵~~~");
			Thread.sleep(500); // 0.5초 정지
		}			
	}

}

class BeepThread extends Thread {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}