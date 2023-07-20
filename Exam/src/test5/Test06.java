package test5;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *  날짜 : 2023/07/17
 *  이름 : 손영우
 *	내용 : 자바 총정리 연습문제
 *
 *	윤년(Leap Year)
 *	- 4년마다 2월을 하루 늘린 해
 *	- 4로 나누어지고 100으로 나우어지지 않는 해
 *	- 400으로 나누어 떨어지는 해
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		
		if(year%4 == 0 && year%400 == 0) { 
			System.out.printf("%d는 윤년입니다.\n", year);
		} else {
			System.out.printf("%d는 평년입니다.\n", year);
		}
		
		GregorianCalendar greCal = new GregorianCalendar();
		
		if (greCal.isLeapYear(year)) {
			System.out.printf("%d는 윤년입니다.\n", year);
		}else {
			System.out.printf("%d는 평년입니다.\n", year);
		}
		
	}
}
