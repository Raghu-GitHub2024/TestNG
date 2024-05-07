package AutomationClass3;

public class StaticAndNonStatic {
	
	static void add() {
		
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
		
	}
	void sub() {
		int a = 5;
		int b = 2;
		int sum = a-b;
		System.out.println(sum);
	 	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StaticAndNonStatic n1 = new StaticAndNonStatic();
		n1.sub();
		add();
	}

}
