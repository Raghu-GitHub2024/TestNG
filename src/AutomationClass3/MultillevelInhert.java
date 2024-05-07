package AutomationClass3;

class GrandParent{
	
	 static void add() {
		 System.out.println(5+2);
	}
}
class parentclass extends GrandParent{
	
	static void sub() {
		System.out.println(5-2);
	}
	
}
public class MultillevelInhert extends parentclass {

	public static void main(String[] args) {
		
		add();
		sub();

	}

}
