package com.lec206.ex03_multi;

import com.lec206.ex02_implement.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을/를 검색합니다!");
	}

	@Override
	public void turnOn() {
		System.out.println("Smart TV를 파워온");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV를 파워오프");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV의 볼륨은 " + this.volume + " 입니다!");
	}

}
