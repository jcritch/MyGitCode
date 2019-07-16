package InheritanceExample;

public class Parent extends GrandParent {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.city();
		p.state();

	}

	public void country() {
		
		System.out.println("Country name is India");
	}
	
		
}
