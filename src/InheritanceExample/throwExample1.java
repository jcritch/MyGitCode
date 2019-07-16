package InheritanceExample;

public class throwExample1 {

	
	void checkAge(int age ) {
		
		if(age<18) {
			
			throw new ArithmeticException("Not eligible for voting");
		}
			else
				System.out.println("Eligible for voting");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		throwExample1 te1 = new throwExample1();
		te1.checkAge(15);
		System.out.println("This program is completed");
	}

}
