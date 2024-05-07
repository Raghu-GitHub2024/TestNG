package HomeWork;

class Method_Parent {
	void login() {
		System.out.println("Login with Mob.NO");
	}

}

public class Assignment97 extends Method_Parent {
	void login() {

		// super.login();
		// super keyword is used to avoid method overriding with child class or super
		// keyword can used only in child class to gather the parent method with child
		// class

		System.out.println("Login with Email ID");
	}

	public static void main(String[] args) {

		/*
		 * MethodOverriding m1 = new MethodOverriding(); m1.login();
		 */
		Method_Parent m2 = new Method_Parent();
		m2.login();

	}

}