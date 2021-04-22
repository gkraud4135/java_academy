package com.lec206.ex12_math_random;

import java.util.Random;

/*
	Random class
	
	java.util.Random클래스는 다양한 난수를 얻기 위해 다양한 메서드를 제공한다.
	Math.random()메서드는 0<=난수<1 사이의 실수타입의 난수 1개를 얻는데만 사용
	하는 반면에 Random클래스는 boolean, long, float, double등의 난수를 얻을 수
	있다. 또 다른 차이점은 Random클래스는 seed(종자)값을 지정할 수 있다.
	
	seed값을 지정하면 난수가 발생할 때 항상 동일한 난수값을 얻을 수가 있다.
*/
public class RandomMain {

	public static void main(String[] args) {
		
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("금주 로또당첨번호: ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1; // 0<= 난수 < 45 + 1
			System.out.print(selectNumber[i]+ ", ");
		}

	}

}
