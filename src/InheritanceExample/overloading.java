package InheritanceExample;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading ov = new overloading();
		ov.add(5, 10);
		ov.add(10.2, 5);
		ov.add(3, 4, 5);
		
	}

	public void add(int a, int b) {
		
		int sum=a+b;
		System.out.println("The sum value in overloading method is "+sum);
	}
	
	public void add(double a, int b) {
		
		double sum = a+b;
		System.out.println("The sum value in overloading method is "+sum);
	}
	
	public void add(int a, int b, int c) {
		
		int sum=a+b+c;
		System.out.println("The sum value in overloading method is "+sum);
	}
}
