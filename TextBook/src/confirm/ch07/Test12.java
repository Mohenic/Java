package confirm.ch07;

class A {
	public void method1() {
		System.out.println("A-method1()");
	}
}

class B extends A {
	public void method1() {
		System.out.println("B-method1()");
	}
}

class C extends A {
	public void method1() {
		System.out.println("C-method1()");
	}
	
	public void method2() {
		System.out.println("C-method2()");
	}
}

public class Test12 {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}

