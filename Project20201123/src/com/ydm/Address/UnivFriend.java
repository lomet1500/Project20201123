package com.ydm.Address;

public class UnivFriend extends Friend {
	private String univ;
	private String major;

	public UnivFriend(String name, String phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override // source - override implement...
	public void showFriendInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("이름: " + super.getName() + ", 연락처: " + super.getPhone() + ", 학교: " + this.univ + ", 전공: " + this.major);
	}
}
