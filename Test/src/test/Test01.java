package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		// 예제 입력
		System.out.println("예제 입력");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("예제출력");
		
		// 반복 실행
		for(int i = 1 ; i<=n ; i++) {
			// 공백 출력
			for(int x = 1 ; x<=n-i ; x++) {
				System.out.print(" ");
			}
			// 별 출력
			for(int x = 1; x<=i ; x++) {
				System.out.print("*");
			}
			// 개행처리
			System.out.println();
		}
	}
}
