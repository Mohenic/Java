package test5;

/**
 *  날짜 : 2023/07/17
 *  이름 : 손영우
 *	내용 : 자바 총정리 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);

		System.out.println(a > b || a == b);
		System.out.println(a < b && a == b);

		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		System.out.println(true ^ false);

		System.out.println(!(a > b));
		System.out.println(!(a < b));
		
	}
}
