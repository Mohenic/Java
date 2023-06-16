package step3;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for(int x = 1; x<=9 ; x++) {
			
			int y = N*x;
			
			System.out.printf("%d * %d = %d\n", N , x , y);
			
		}
		
	}

}
