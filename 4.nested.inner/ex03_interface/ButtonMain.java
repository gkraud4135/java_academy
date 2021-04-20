package com.lec206.ex03_interface;

public class ButtonMain {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		button.setOnClickListner(new CallListner());
		button.touch();
		
		button.setOnClickListner(new MessageListner());
		button.touch();
		
	}
}
