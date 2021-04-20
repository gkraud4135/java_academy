package com.lec206.ex03_interface;

public class Button {

	interface OnClickListner {
		void OnClick();
	}
	
	// 필드
	OnClickListner listner;
	
	// 메서드
	void touch() {
		listner.OnClick();
	}
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
}
