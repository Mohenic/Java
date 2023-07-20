package confirm.ch04;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
			while(true) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고| 4.종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("예금액> ");
				balance += sc.nextInt();
				
			} else if (num == 2) {
				System.out.println("출금액> ");
				balance -= sc.nextInt();
				
			} else if (num == 3) {
				System.out.println("잔고> ");
				System.out.println(balance);
				
			} else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}
