package step3;

import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			
			for(int x = 0; x<=i ; x++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
	
}
