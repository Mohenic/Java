package step2;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int a = H * 60 + M;
		int b = (a - 45 + 24 * 60) % (24*60); // 음수값 제거를 위해 24*60을 곱하고 나머지화 시킴
		
		int r1 = b/60;
		int r2 = b%60;
		
		System.out.print(r1 + " " +  r2);
		
	}
}
