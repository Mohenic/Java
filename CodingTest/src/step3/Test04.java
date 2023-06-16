package step3;

import java.util.Scanner;

public class Test04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int t = 0;
		
		for(int i = 0; i<b ; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			t = t + (x*y);
		}
		
		if (t==a) {
			
			System.out.println("Yes");
			
		} else if(t!=a){
			
			System.out.println("No");

		}
	}
}
