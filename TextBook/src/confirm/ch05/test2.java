package confirm.ch05;

public class test2 {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		int x = 0;
		
		for(int i=0; i<array.length; i++) {
			if(x < array[i]) {
				x = array[i];
			}
		}
		
		System.out.println(x);
	}
}
