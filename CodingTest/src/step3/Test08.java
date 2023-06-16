package step3;

import java.util.Scanner;

public class Test08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x;
		
		for(int i = 1; i<=t ; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			x = a+b;
			
			System.out.printf("Case #%d: %d + %d = %d\n", i ,a , b, x);
		}
	}
}
