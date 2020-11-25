package com.ydm.Address;

public class CompFriend extends Friend {
	private String company;
	private String department;

	public CompFriend(String name, String phone) {

		super(name, phone);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override // source - override implement Method...
	public void showFriendInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("이름: " + super.getName() + ", 연락처: " + super.getPhone() + ", 회사: " + this.company + ", 부서: " + this.department);
	}

}
