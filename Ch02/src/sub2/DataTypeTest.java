package sub2;

/**
 * 날짜 : 2023/06/12
 * 이름 : 손영우
 * 내용 : Java 자료형 실습하기
 *
 * 자료형(Data Type)
 *  - 변수에 저장되는 데이터의 종류와 크기를 나타낸 키워드
 *  - 자료형은 기본형과 참조형(객체) 로 나뉨
 *
 */
public class DataTypeTest {
	public static void main(String[] args) {
		
		// 정수형
		byte  num1 = 127;
		short num2 = 32767;
		int   num3 = 2147483647;
		long  num4 = 922337203685477507L;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		// 실수형
		float  var1 = 0.123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("var1 : " + var1); // 소수점  8자리까지 출력
		System.out.println("var2 : " + var2); // 소수점 17자리까지 출력
		
		// 논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		// 문자형
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		
		// 문자열
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";
		
		System.out.println("A : " + str1);
		System.out.println("가 : " + str2);
		System.out.println("Apple : " + str3);
		System.out.println("가을 : " + str4);
	}
}
