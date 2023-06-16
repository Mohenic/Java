package step2;

import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int tm = a*60+b;
		int h = (tm+c+24*60)%(24*60);
		
		int sh = h/60;
		int sm = h%60;
		
		System.out.println(sh + " " + sm);
		
	}
}
