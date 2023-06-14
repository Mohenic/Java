package gpt01;

// 두 개의 정수를 입력받고, 두 수의 합을 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Gpt01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수 : ");
		int x = sc.nextInt();
		
		System.out.println("두 번째 수 : ");
		int y = sc.nextInt();
	
		int result = x+y;
		
		System.out.println("두 수의 합은 : " + (result));
		sc.close();
	}

}
