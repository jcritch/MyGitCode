package InheritanceExample;

public class drawAndCalculate extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		drawAndCalculate dc = new drawAndCalculate();
		dc.area();
		dc.draw();
		dc.nonabstractMethod();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		System.out.println("The area is calculated");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("The shape is drawn");
	}

}
