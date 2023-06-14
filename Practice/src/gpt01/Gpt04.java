package gpt01;

// 1부터 10까지의 숫자 중에서 짝수만 출력하는 프로그램을 작성하세요.

public class Gpt04 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=10 ; i++) {
			
			if(i%2 == 0) {
				System.out.println("1부터 10까지의 숫자중 짝수 : " + i);
			}
		}
	}
}
