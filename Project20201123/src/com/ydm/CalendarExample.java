package com.ydm;

import java.util.Calendar;

public class CalendarExample {

	public static void showCal(int year, int month) {

		Calendar cal = Calendar.getInstance();

		cal.set(2020, 1, 1);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("날짜: " + cal.get(Calendar.DATE));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));

	}

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // calendar 객체 생성
		
		cal.set(2020,06,01);
		
	System.out.print(cal.get(Calendar.DATE) +"일");
	System.out.print(cal.get((Calendar.MONTH)+1) +"월");
	System.out.println(cal.get(Calendar.YEAR) +"년");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

int wek = 0;
int start_day = cal.get(Calendar.DAY_OF_WEEK);
int last_day = cal.getActualMaximum(Calendar.DATE);
for(int i = 1; i < start_day; i++) {
System.out.print("\t");
wek++;
}
for (int i = 1; i <= last_day; i++) {
	if(wek % 7 == 0) {
		System.out.println();
	}
	wek++;
	System.out.print(i + "\t");
}
	
			showCal(2020, 6); // 2020년 6월달 달력 보고싶습니다.
		}
}
