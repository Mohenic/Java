package sub8;

public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + cc);
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}
}
