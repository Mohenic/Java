package confirm.ch08;

interface Remocon {
	public void powerOn();
}

public class Test5 implements Remocon {
	
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new Test5();
		r.powerOn();
	}
}
