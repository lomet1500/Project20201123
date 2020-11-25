package com.yedam;

public class Student {
	String school;
	String id; // ex) 15-1234
	String name;
	String major;

	Student() {
	}

	Student(String school, String id, String name, String major) {
		this.school = school;
		this.id = id;
		this.name = name;
		this.major = major;
	}

	Student(String school, String id) {
		this.school = school;
		this.id = id;
	}

	public void ShowStudentInfo() {
		System.out.println("학교: " + school + " " + "학번: " + id + " " + "이름: " + name + " " + "전공: " + major);
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
