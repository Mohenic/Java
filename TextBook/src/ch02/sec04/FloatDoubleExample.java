package ch02.sec04;
/*
 * 날짜 : 2023/06/13
 * 이름 : 손영우
 * 내용 : 교재 p47 예제
 *
 */

public class FloatDoubleExample {
	
	public static void main(String[] args) {
		
		// 정밀도 확인
		
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println(var1);
		System.out.println(var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
