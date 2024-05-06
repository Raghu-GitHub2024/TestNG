package HomeWork;

public class Assignment62 {

	public static void main(String[] args) {
		String name[] = new String[3];
		name[0] = "Abhishek";
		name[1] = "prabhu";
		name[2] = "saddam";

		int rollno[] = new int[3];
		rollno[0] = 10;
		rollno[1] = 11;
		rollno[2] = 12;

		char[] Gender = new char[3];
		Gender[0] = 'F';
		Gender[1] = 'M';
		Gender[2] = 'M';
		for (int i = 0; i < 3; i++) {
			System.out.println("Studentnames" + " Rollno" + " " + "Gender");
			System.out.println(name[i] + "        " + rollno[i] + "    " + Gender[i]);
		}

	}

}
