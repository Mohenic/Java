package step3;

import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x;
		
		for(int i = 1; i<=t ; i++) {
			
			x = sc.nextInt()+sc.nextInt();
			
			System.out.printf("Case #%d: %d\n", i, x);
		}
	}
}
