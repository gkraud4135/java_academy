package com.lec206.ex03_interface;


public class MessageListner implements Button.OnClickListner {

	@Override
	public void OnClick() {
		System.out.println("메시지를 보냅니다!");
	}

}
