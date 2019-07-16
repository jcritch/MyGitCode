package InheritanceExample;

public class overridingExample extends overloading{

	public static void main(String[] args) {
		overloading oe1 = new overloading();
		oe1.add(5, 21);
		overloading oe2 = new overridingExample();
		oe2.add(6, 17);
	}
	
	public void add(int a, int b) {
		
		int sum=a+b;
		System.out.println("The sum value in overriding method is "+sum);
}
}