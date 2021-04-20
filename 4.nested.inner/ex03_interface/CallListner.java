package com.lec206.ex03_interface;

public class CallListner implements Button.OnClickListner {

	@Override
	public void OnClick() {
		System.out.println("전화를 겁니다!");
	}

}
