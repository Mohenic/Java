package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int avg = 0;
		
		while(true) {
			System.out.println("정수를 입력하세요.");
			int n = sc.nextInt();
			
			if(n==0) {
				break;
			}
			
			sum += n;
			count++;
			avg = sum/count;
		}
		System.out.println("합계는 " + sum + "입니다. 평균은 " + avg + "입니다.");
	}
}
