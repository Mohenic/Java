package confirm.ch05;

public class test3 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95 , 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
				count++;
			}
		}
		
		int avg = sum/count;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
