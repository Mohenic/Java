package confirm.ch05;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int students = 0;
		int[] scores = null;
		
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수> ");
				students = Integer.parseInt(sc.nextLine());
				scores = new int[students];
				
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
				
			}else if(selectNo == 4) {
				int x = 0;
				int sum = 0;
				
				for(int i = 0; i<scores.length; i++) {
					if(x < scores[i]) {
						x = scores[i];
					}
					sum += scores[i];
				}
				
				double avg = (double)sum/students;
						
				System.out.println("최고 점수 : " + x);
				System.out.println("평균 점수 : " + avg);
				
			}else if(Integer.parseInt(sc.nextLine()) == 5) {
				System.out.println("프로그램 종료");
				break;
				
			}
		}
	}
}
