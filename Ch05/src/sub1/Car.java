package sub1;

// Car 클래스 정의
public class Car {
	
	// 필드(속성)
	String name;
	String color;
	int speed;
	
	// 메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차랑명 : " + this.name);
		System.out.println("차랑명 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
