package step2;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a%4 == 0 && a%100 != 0) {
			
			System.out.println("1");
			
		} else if(a%400 == 0) {
			
			System.out.println("1");

		} else {
			
			System.out.println("0");
			
			
		}
		
	}

}
