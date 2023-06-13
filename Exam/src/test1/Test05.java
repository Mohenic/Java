package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 손영우
 * 내용 : Java 조건문 연습문제
 */

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		switch(score/10){
		case 10:
		case 9:
			System.out.println("A 입니다.");
			break;
		case 8:
			System.out.println("B 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;
		default:
			System.out.println("F 입니다.");
			break;
			
		}
		
		sc.close();
	}

}
