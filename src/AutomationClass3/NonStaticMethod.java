package AutomationClass3;

public class NonStaticMethod {
	
	void add() {
		
		int a =100;
		int b = 200;
		System.out.println(a+b);
	}
	void sub() {
		
		int a =100;
		int b = 200;
		System.out.println(a-b);
		
	}
	void mult() {
		
		int a =100;
		int b = 200;
		System.out.println(a*b);
	}
	void div() {
		
		int a =100;
		int b = 200;
		System.out.println(a/b);
	}
	void mod() {
		
		int a =100;
		int b = 200;
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod n1 = new NonStaticMethod();
		n1.add();
		n1.sub();
		n1.mult();
		n1.div();
		n1.mod();

	}

}
