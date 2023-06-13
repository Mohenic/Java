package ch02.sec01;
/**
 * 날짜 : 2023/06/12
 * 이름 : 손영우
 * 내용 : 교재 p37 예제
 *
 */
public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
	}
}
