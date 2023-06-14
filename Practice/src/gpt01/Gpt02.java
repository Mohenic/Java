package gpt01;

import java.util.Scanner;

/* 반지름을 입력받고, 원의 넓이를 계산하여 출력하는 프로그램을 작성하세요.
 * (힌트: 원의 넓이를 계산하는 공식은 "넓이 = π * 반지름 * 반지름"입니다. π는 3.14로 가정합니다.)
 */

public class Gpt02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("원의 반지름 :");
		int i = sc.nextInt();
		
		System.out.println("원의 넓이는 : " + (3.14 * i * i));
		
	}
}
