package gpt01;

import java.util.Scanner;

/* 사용자로부터 양수를 입력받아서, 입력된 숫자가 소수인지 판별하는 프로그램을 작성하세요.
 * (소수는 1과 자기 자신만을 약수로 갖는 수입니다.)
 */

public class Gpt05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수 입력 : ");
		int x = sc.nextInt();
		
		if(x%x == 0 || x == 1) {
			System.out.println("입력된 숫자는 소수가 아닙니다.");
		}else {
			System.out.println("입력된 숫자는 소수가 아닙니다.");
		}
		
		sc.close();
	}

}
