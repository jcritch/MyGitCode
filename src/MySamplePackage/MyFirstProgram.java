package MySamplePackage;

public class MyFirstProgram {

	public static void main(String[] args) {
		
		System.out.println("Navigated to the Home Page");

	ValidateHeader vh = new ValidateHeader();
	String status = vh.headervalidation();
	System.out.println(status);
	
	System.out.println("hello");
	}

}
