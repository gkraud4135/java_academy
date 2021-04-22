package com.lec206.ex03_multi;

public class ProductMain {

	public static void main(String[] args) {
		
		Product<TV, String> tv = new Product<TV, String>();
		tv.setKind(new TV());
		tv.setModel("스마트TV");
		TV tvProduct = tv.getKind();
		String tvModel = tv.getModel();
		
		Product<Car, String> car = new Product<Car, String>();
		car.setKind(new Car());
		car.setModel("포르쉐");
		Car carProduct = car.getKind();
		String carModel = car.getModel();
		
		// String, String
		Product<String, String> prod1 = new Product<String, String>();
		prod1.setKind("자동차");
		prod1.setModel("SUV");
		
		// Integer Ingeger
		Product<Integer, Integer> prod2 = new Product<Integer, Integer>();
		prod2.setKind(100);
		prod2.setModel(99999);
	}

}
