package HomeWork;


class Animal{
	
	void sound() {
		System.out.println("Animals make sound ");
	}
}
 class Dog extends Animal{
	
	 void sound2() {
			System.out.println("Barks");
	}
}


public class Assignment104 {

	public static void main(String[] args) {
		Animal A = new Dog();// upcasting  implicitly
		//A.sound();
		Dog D = (Dog)A;//Down casting 
		D.sound(); // Method calling 
		D.sound2();// Method calling 
		
		

	}

}

