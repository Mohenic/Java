package sub6;

public class Car {
	
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차랑명 : " + this.name);
		System.out.println("차랑색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
