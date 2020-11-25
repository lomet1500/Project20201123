package com.yedam.interfaces;

public class Audio implements RemoteControl {

	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

}
