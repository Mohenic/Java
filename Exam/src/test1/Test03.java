package test1;

/*
 * 날짜 : 2023/06/13
 * 이름 : 손영우
 * 내용 : Java 연산자 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		
		result = num++;
		System.out.println("result : " + result);
		
		result = ++num;
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}

}
