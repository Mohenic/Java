package step2;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short a = sc.nextShort();
		short b = sc.nextShort();
		
		if (a>b) {
			
			System.out.println(">");
			
		} else if(a<b) {
			
			System.out.println("<");

		} else if(a==b) {
			
			System.out.println("==");
			
		}
		
		
	}
}
