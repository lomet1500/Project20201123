package com.yedam.string;

public class StringExample {
	public static void main(String[] args) {
		String birth1 = "991123-1234567";
		String birth2 = "991112-2345678";
		String birth3 = "010101*3123456";
		String birth4 = "0202024211234:";

		String[] birth = { birth1, birth2, birth3, birth4 };
		char sex = birth1.charAt(7);
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
		case '2':
		case '4':
			System.out.println("여자");
			break;

		}
	}
}
