package step3;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0;
	
		for(int i = 1 ; i<=n ; i++) {
			
			x += i;
			
		}
		
		System.out.println(x);
	
	}

}
