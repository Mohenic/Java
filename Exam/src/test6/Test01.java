package test6;
/**
 *  날짜 : 2023/07/18
 *  이름 : 손영우
 *	내용 : 자바 총정리 연습문제
 */

public class Test01 {
	public static void main(String[] args) {
		int index;
		int primes = 0;
		
		for(int i=2; i<100; i++) {
			for(index=2; index<i; index++) {
				if(i % index == 0) {
					break;
				}
			}
			
			if(index == i) {
				primes++;
				System.out.printf("%5d%s", i, primes % 10 == 0 ? "\n" : "");
			}
		}
		
		System.out.printf("\n2부터 100사이 소수의 개수 : %d개", primes);
	}
}
