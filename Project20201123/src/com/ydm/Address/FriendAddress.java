package com.ydm.Address;

import java.util.Scanner;

public class FriendAddress {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	// 주소록 생성 프로그램...
	public static void main(String[] args) {
		Friend[] friends = new Friend[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.종료 6.검색");
			System.out.println("--------------------------------------------");
			System.out.println("선택 > ");
			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				addFriend();

			} else if (selectNo == 2) {
				addUnivFriend();

			} else if (selectNo == 3) {
				addCompFriend();

			} else if (selectNo == 4) {
				showFriendList();

			} else if (selectNo == 5) {
				System.out.println("프로그램 종료.");
				break;

			} else if (selectNo == 6) {
				searchFriend();
			}
		}

		// Friend[] friends = null;

		// Friend f1 = new Friend("친구1","11-1111");
		// CompFriend f2 = new CompFriend("친구2", "22-2222" );
		// f2.setCompany("네이버");
		// f2.setDepartment("개발부서");
		// UnivFriend f3 = new UnivFriend("친구3", "33-3333");
		// f3.setUniv("서울대학교");
		// f3.setMajor("컴퓨터정보");

		// f1.showFriendInfo();
		// f2.showFriendInfo();
		// f3.showFriendInfo();

	} // end of main()

	public static void addFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		new Friend(name, phone);
		Friend frnd = new Friend(name, phone);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}

	public static void addUnivFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("학교이름: ");
		String univ = scn.nextLine();
		System.out.println("전공정보: ");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}

	public static void addCompFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("회사이름: ");
		String univ = scn.nextLine();
		System.out.println("부서정보: ");
		String major = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(univ);
		frnd.setDepartment(major);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = frnd;
				break;
			}
		}
	}

	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();

			}
		}
	}

	public static void searchFriend() {
		System.out.println("검색> ");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getName().equals(name)) {
					friends[i].showFriendInfo();

				}
			}
		}
	}
}

// end of class.()