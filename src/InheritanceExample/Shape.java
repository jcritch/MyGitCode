package InheritanceExample;

public abstract class Shape {

	
	abstract public void area();
	abstract public void draw();
	public void nonabstractMethod() {
		
		System.out.println("This is a non-abstract method");
	}
}
