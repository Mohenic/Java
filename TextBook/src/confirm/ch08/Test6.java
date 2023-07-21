package confirm.ch08;

interface Soundable {
	public String sound();
}

class Cat implements Soundable {
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable {
	public String sound() {
		return "멍멍";
	}
}

public class Test6 {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
