package ch06.sec10.exam03;

public class Car {
	
	int speed;

	void run() {
		System.out.println(speed + "으로 달립니다");
	}
	
	static void simulate() {
		
		Car mycar = new Car();
		
		mycar.speed = 200;
		mycar.run();
	}
	
	public static void main(String[] args) {
		
		simulate();
		
		Car mycar = new Car();
		mycar.speed = 60;
		mycar.run();
		
	}

}
