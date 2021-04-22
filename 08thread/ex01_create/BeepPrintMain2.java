package com.lec206.ex01_create;

import java.awt.Toolkit;

/*
	메인쓰레드
	
	모든 자바 애플리케이션은 메인쓰레드(main thread)가 main()메서드가 실행하면서 시작된다.
	메인쓰레드 main()메서드의 첫 줄부터 순차적으로 실행하고 main()메서드의 마지막 코드가 
	실행되거나 return문을 만나면 실행이 종료가 된다.
	
	멀티쓰레드로 실행하는 애플리케이션을 개발하려면 먼저 몇개의 작업을 병렬로 실행할지 결정
	하고 각 작업별로 쓰레드를 생성해야 한다.
	
	어떤 자바 애플리케이션이건 메인쓰레드는 반드시 존재하기 때문에 메인 작업이외에 추가적인
	병렬작업의 수 만큼 쓰레드를 생성하면 된다. 자바에서는 작업 쓰레드도 객체로 생성되기 때
	문에 객체가 필요하다. java.lang.Thread클래스를 직접 객체화해서 생성해도 되지만 Thread를
	상속해서 하위 클래스를 만들어 생성할 수도 있다.
	
	쓰레드를 생성하는 방법
	
	1. Thread클래스를 직접 생성
	
	   java.lang.Thread클래스로 부터 작업쓰레드 객체를 직접 생성하려면 Runnable을 매개값으로 
	   갖는 생성자를 호출해야 한다.
	   
	   Thread thread = new Thread(Runnable target);
	   
	   Runnable은 작업쓰레드가 실행할 수 있는 코드를 가지고 있는 객체라고 해서 붙여지 이름이다.
	   Runnable은 인터페이스타입이기 때문에 구현 객체를 만들어 대입해야 한다.
	   Runnable에는 run()메소드 하나가 정의 되어 있는데 구현클래스는 run()을 재정의해서 작업 쓰
	   레드가 실행할 코드를 작성해야 한다.
	   
	   Runnable을 구현한 객체는 작업내용을 가지고 있는 객체이지 실제 쓰레드는 아니다. Runnable
	   구현객체를 생성한 수, 이 것을 매개값으로 해서 Thread생성자를 호출하면 비로소 작업 쓰레드
	   가 생성된다.
	   
	   작업쓰레드는 생성되는 즉시 실행되는 것이 아니라 start()메서드를 호출해야만 비로서 쓰레드가
	   실행된다.	   
	
*/
public class BeepPrintMain2 {

	public static void main(String[] args) throws InterruptedException {

		// 쓰레드를 생성하는 방법
		// 1. 외부클래스(BeepTask)
		//    1) 외부 클래스를 Runnable인터페이스를 구현
		//    2) run()메서드를 재정의(내가 필요한 로직을 구현)
		//    3) 외부클래스의 객체를 생성(자료형은 Runnable)
		//    4) 생성된 외부객체(beepTask)를 매개변수로 한 Thread를 생성
		//    5) 생성된 쓰레드객체(thread)를 시작 : thread.start()
		// 
		
		// Runnable beepTask = new BeepTask();
		// Thread thread = new Thread(beepTask);
		
		// 2. 익명객체
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0;i<5;i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}				
//			}
//		});
				
		// 3. lambda식
		// 한개의 메서드만 가진 interface(Functional Interface)만 람다식으로 구현가능
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
		});
		
		thread.start();
		
		// 띵출력 5번
		for(int i=0;i<5;i++) {
			System.out.println("띵~~~");
			Thread.sleep(500); // 0.5초 정지
		}		
	}

}

class BeepTask implements Runnable {

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
