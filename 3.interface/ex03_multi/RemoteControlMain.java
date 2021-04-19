package com.lec206.ex03_multi;

import com.lec206.ex02_implement.RemoteControl;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		rc.setVolume(11);
		// 자식객체 SmartTelevision에서 부모객체로 형변환되었기 때문에
		// search()메서드는 호출이 불가능 하다.
		// rc.search("www.google.com"); (x)
		
		Searchable smartRC = tv;
		smartRC.search("http://www.google.com");

	}

}
