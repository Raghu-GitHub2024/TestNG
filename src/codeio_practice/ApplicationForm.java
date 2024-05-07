package codeio_practice;

public class ApplicationForm {
	
	String name;
	int rollno;
	
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
		
	}
	
	public static void main(String[] args) {
		ApplicationForm pract = new ApplicationForm();
		pract.name="vishwa";
		pract.rollno=101;
		pract.display();
	}

}
