package step3;

// BufferedReader와 BufferedWriter 사용법 숙지 후 다시 도전
 


import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0 ; i<t ; i++) {
			int x = sc.nextInt()+sc.nextInt();
			
			System.out.println(x);
			
		}
	}
}
