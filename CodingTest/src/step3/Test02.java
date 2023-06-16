package step3;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t ; i++){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int x = a+b;
			
			System.out.println(x);
		}
		
		
	}

}
