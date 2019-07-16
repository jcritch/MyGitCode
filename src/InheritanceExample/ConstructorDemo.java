package InheritanceExample;

public class ConstructorDemo {
	
	
	public void getdata() {
	
		System.out.println("This is a normal method");
	}
	
	
	public ConstructorDemo() {
		
		System.out.println("I am in a constructor method");
	
	}
	
	public ConstructorDemo(int a, int b) {
		
		System.out.println("I am in a parameterized constructor method");
	
	}
	
	public ConstructorDemo(String s) {
		
		System.out.println(s);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(4,5);
		ConstructorDemo cd2 = new ConstructorDemo("Pass");
	}


}
