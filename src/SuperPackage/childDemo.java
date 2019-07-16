package SuperPackage;

public class childDemo extends parentDemo{

	String name = "Qualitest";
	
	public void getStringData() {
		
		final int a=4;
		
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public childDemo() {
		
		super();
		System.out.println("This is child class constructor");
		
	}
	public void getData() {
		
		super.getData();
		System.out.println("I am child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
	}

	
	
	
}
