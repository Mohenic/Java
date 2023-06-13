package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 손영우
 * 내용 : Java 기본입출력 연습문제
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.println("올해 년도 입력 : ");
		year = sc.nextInt();
				
		System.out.println("태어난 년도 입력 : ");
		birth = sc.nextInt();
		
		System.out.println("이름 입력 : ");
		name = sc.next();
		
		int age = year - birth;
				
				System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
				
		sc.close();
		
	}

}
