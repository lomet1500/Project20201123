package com.yedam;

public class StudentExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setSchool("예담");
		s1.setId("15-1234");
		s1.setName("홍길동");
		s1.setMajor("15");

		Student s2 = new Student("계명", "15-1245");

		Student s3 = new Student("경북", "15=1267", "고길동", "16");

		Student[] students = { s1, s2, s3 };
		for (Student stu : students) {
			if (stu != null) {
				if (stu.getSchool().equals("예담")) {
					System.out.println(stu.getMajor());
					System.out.println(stu.getName());
				}

				s1.ShowStudentInfo();

			}
	}
}
}
