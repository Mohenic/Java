package sub1;

/**
 * 날짜 : 2023/06/26
 * 이름 : 손영우
 * 내용 : Java 예외처리 실습하기
 * 
 * 예외처리(Exception)
 *  - 예외는 프로그램 실행중에 발생하는 모든 에러(Error)
 *  - 실행 중(Runtime)에 발생하는 예외와 컴파일(CompileTime)에 발생하는 예외처리
 *  - 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws
 *  - 사용자가 생성한 예외를 throw
 *  
 */

public class ExceptionTest {
	public static void main(String[] args) {
		
		////////////////////////////////////
		// 실행 예외
		////////////////////////////////////
		
		// 예외 상황1
		int num1 = 1;
		int num2 = 0;
		
		int rs1 =0;
		int rs2 =0;
		int rs3 =0;
		int rs4 =0;
		
		try {
			// 예외가 발생할 가능성이 있는 코드작성
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2;
		
		}catch (ArithmeticException e) {
			// 어떤수를 0으로 나눌 때
			e.printStackTrace(); // 예외 내용 출력
		}
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		// 예외상황2
		
		int[] arr = {1, 2, 3, 4, 5};
		
		
		try {
			for(int i = 0;  i<6 ; i++) {
				System.out.println("arr["+i+"] : " + arr[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// 배열의 인덱스 범위를 벗어났을 때
			e.printStackTrace();
		}
		
		// 예외상황3
		Animal ani = null;
		
		try {
			ani.move();
			ani.hunt();
		}catch (NullPointerException e) {
			// 객체 생성 없이 참조 (Null 포인터 에러)
			e.printStackTrace();
		}
		
		// 예외상황4
		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle(); // 업캐스팅
		Animal a3 = new Shark(); // 업캐스팅
		
		try {
			Eagle eagle = (Eagle) a1; // 다운캐스팅
			Shark shark = (Shark) a2; // 다운캐스팅
			Tiger tiger = (Tiger) a3; // 다운캐스팅
		}catch (ClassCastException e) {
			// 잘못된 캐스팅
			e.printStackTrace();
		}

		
		////////////////////////////////////
		// 일반 예외
		////////////////////////////////////
		
		try {
			Class obj = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언
			e.printStackTrace();
		} finally {
			// 예외처리 발생유무에 상관없이 마지막에 항상 실행되는 코드
			System.gc(); // 메모리 정리
			
			System.out.println("finally 실행");
			
		}
		

		System.out.println("프로그램 정상 종료...");
	}
}
