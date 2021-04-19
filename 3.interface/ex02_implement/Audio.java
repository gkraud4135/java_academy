package com.lec206.ex02_implement;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오 파워온!!");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 파워오프!!");
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
		System.out.println("현재 오디오의 볼륨은 " + this.volume + " 입니다!");
	}

}
