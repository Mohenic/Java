package gpt01;

import java.util.Scanner;

// 사용자로부터 5개의 정수를 입력받아서, 이 정수들의 평균을 계산하여 출력하는 프로그램을 작성하세요.

public class Gpt03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        
        int result = num1+num2+num3+num4+num5;
        int average = result/5;
        
        System.out.println("5개 정수의 평균 : " + average);
        
        	
	}

}
