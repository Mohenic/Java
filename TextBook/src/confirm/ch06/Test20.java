package confirm.ch06;

import java.util.Scanner;

class BankAccount{
	
	private String id;
	private String name;
	private int balance;
	
	public BankAccount(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + balance;
	}
}

public class Test20 {
	public static void main(String[] args) {
		// 20번
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] accounts = new BankAccount[100];
		
		while(true) {
			
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			
			int answer = sc.nextInt();
			
			if(answer == 1) {
				
			}else if(answer == 2) {
				
			}else if(answer == 3) {
				
			}else if(answer == 4) {
				
			}else if(answer == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
