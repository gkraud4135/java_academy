package com.lec206.exercise.answer;

public class ShopService {

	private ShopService(){}
	private static ShopService shop = new ShopService();
	static ShopService getshop(){
		return shop;
	}

}
