package sub5;

public class Sedan extends Car{

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void speedTurbo() {
		// private에서 protected로 접근권한  변경해서 자식클래스 참조
		this.speed += 20;
	}
	
	public void show() {
		
		super.show();
		System.out.println("배기량 : " + this.cc);
		
	}
}
