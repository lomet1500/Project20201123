package com.yedam.abstracts;

public abstract class Phone { // 추상 클래스
	public String owner;

	public Phone() {
	}

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public abstract void ring();

	public abstract void turnOff();

}
