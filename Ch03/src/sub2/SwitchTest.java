package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 손영우
 * 내용 : Java 조건문 Switch 실습하기
 */

public class SwitchTest {
	
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		
		System.out.println("입력한 숫자 : " + number);
		
		switch(number % 2) {
		
		case 0:
			System.out.println("number는 짝수");
			break;
		case 1:
			System.out.println("number는 홀수");
			break;
		}
	}
}
