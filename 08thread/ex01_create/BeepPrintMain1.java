package com.lec206.ex01_create;

import java.awt.Toolkit;

public class BeepPrintMain1 {

	public static void main(String[] args) throws Exception {
		
		// 띵소리 5번
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();	
			Thread.sleep(500); // 0.5초 정지
		}
		
		// 띵출력 5번
		for(int i=0;i<5;i++) {
			System.out.println("띵~~~");
			Thread.sleep(500); // 0.5초 정지
		}

	}

}
