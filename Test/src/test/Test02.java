package test;

public class Test02 {
	public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
        	// 왼쪽 빈 별 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("☆");
            }
            // 가운데 별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("★");
            }
            // 오른쪽 빈 별 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("☆");
            }
            
            System.out.println();
        }
    }
}