package com.ydm;

import java.util.Calendar;

public class calendar {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // calendar 객체 생성

		cal.set(2020, 05, 01);

		System.out.println(cal.get(Calendar.YEAR) + "년" + " "
				+ ((cal.get(Calendar.MONTH) + 1) + "월" + " " + (cal.get(Calendar.DATE) + "일" + " ")));

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int wek = 0;
		int start = cal.get(Calendar.DAY_OF_WEEK);
		int last = cal.getActualMaximum(Calendar.DATE);
		for (int i = 1; i < start; i++) {
			System.out.print("\t");
			wek++;
		}
		for (int i = 1; i <= last; i++) {
			if (wek % 7 == 0) {
				System.out.println();
			}
			wek++;
			System.out.print(i + "\t");
		}

	}

	public static void sum() {
		CarExample ce = new CarExample();
		
		int[] numbers = {1,2,3};
		int num = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			num = i;
//						if(i % 3 == 1) {
//			          System.out.println();
//					}   
// ctrl + / = 간단한 전체 슬래쉬 축약키
		}
	}
}