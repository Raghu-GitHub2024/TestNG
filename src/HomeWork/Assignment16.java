package HomeWork;

interface ParentClass {
	void Email();

	void PWD();
}

public class Assignment16 implements ParentClass {

	public static void main(String[] args) {
		Assignment16 A = new Assignment16();
		A.Email();
		A.PWD();

	}

	@Override
	public void Email() {

		System.out.println("example@GroTech.com");
	}

	@Override
	public void PWD() {

		System.out.println("GroTech@24");
	}

}
