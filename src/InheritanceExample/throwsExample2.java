package InheritanceExample;

public class throwsExample2 {

	int division(int a, int b) throws ArithmeticException {
		
		int t = a/b;
		return t;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		throwsExample2 te = new throwsExample2();
		
		try
		{
			System.out.println(te.division(10, 0));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("This is catching arithmetic exception");
		}
	}

}
