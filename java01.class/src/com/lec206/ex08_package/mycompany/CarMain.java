package com.lec206.ex08_package.mycompany;

import com.lec206.ex08_package.hankook.SnowTire;
import com.lec206.ex08_package.hyundai.Engine;
import com.lec206.ex08_package.kumho.BigWidthTire;
 
public class CarMain {

	public static void main(String[] args) {
		
		Engine engine = new Engine();
		com.lec206.ex08_package.hankook.Tire flt =
				new com.lec206.ex08_package.hankook.Tire();
		com.lec206.ex08_package.kumho.Tire frt = 
				new com.lec206.ex08_package.kumho.Tire();
		
		SnowTire blt = new SnowTire();
		BigWidthTire brt = new BigWidthTire();
		
		System.out.println("자동차가 생산되었습니다!");
	}

}
