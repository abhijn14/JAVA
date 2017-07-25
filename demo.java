abstract class A {
	abstract void callme();

	void callmetoo() {
		System.out.println("Callme too!!");
	}
}

class B extends A {
	void callme() {
		System.out.println("Inside B's callme");
	}
}

class demo {
	public static void main(String[] args) {
		B b = new B();
		b.callme();
		b.callmetoo();
	}
}
