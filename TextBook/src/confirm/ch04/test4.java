package confirm.ch04;

public class test4 {
	public static void main(String[] args) {
		
		
		while(true) {
			int dice1 = (int)(Math.random()*6);
			int dice2 = (int)(Math.random()*6);
			
			System.out.println("(" + dice1 + ")" + "(" + dice2 + ")");
			if (dice1 + dice2 == 5) {
				break;
			}
		}
		
	}
}
