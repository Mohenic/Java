package confirm.ch07;


class Parent01 {
	public String nation;
	
	public Parent01() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent01(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child01 extends Parent01{
	public String name;
	
	public Child01() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child01(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

public class Test7 {
	public static void main(String[] args) {
		Child01 child = new Child01();
	}
}
