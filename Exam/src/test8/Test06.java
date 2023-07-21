package test8;
/**
 * 날짜 : 2023/07/21
 * 이름 : 손영우
 * 내용 : 자바 총정리 연습문제
 */

interface MyLambda<T> {
	public T what(T t);
}

public class Test06 {
	public static void main(String[] args) {
		
		MyLambda<Integer> factorial = (n) -> {
			int result = 1;
			for(int i=1 ; i<=n; i++) {
				result *= i;
			}
			
			return result;
		};
		
		System.out.println("3! = " + factorial.what(3));
		System.out.println("5! = " + factorial.what(5));
		
		MyLambda<String> reverse = (s) -> {
			
			String result = "";
			
			for(int i=s.length()-1 ; i>=0 ; i--){
				result += s.charAt(i);
			}
			
			return result;
		};
		
		System.out.println("Hello 역순 : " + reverse.what("Hello"));
		System.out.println("World 역순 : " + reverse.what("World"));
	}
}
