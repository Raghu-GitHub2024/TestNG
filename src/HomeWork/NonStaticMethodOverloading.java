package HomeWork;

public class NonStaticMethodOverloading {
	int a = 20;
	int b = 10;
	
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	void mult() {
		System.out.println(a*b);
	}
	void div() {
		System.out.println(a/b);
	}
	void mod() {
		int mod = a % b;
		System.out.println(mod);
	}
	public static void main(String[] args) {
		NonStaticMethodOverloading n1 = new NonStaticMethodOverloading ();
		n1.add();
		n1.sub();
		n1.mult();
		n1.div();
		n1.mod();
	}
}
