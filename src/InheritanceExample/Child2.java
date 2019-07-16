package InheritanceExample;

public class Child2 extends Parent implements Banking{

	public static void main(String[] args) {
	
		Child2 c2 = new Child2();
		c2.city();
		c2.creditCard();
		c2.debitCard();
		c2.ewallet();
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		System.out.println("Test1");
	}

	@Override
	public void debitCard() {
		// TODO Auto-generated method stub
		System.out.println("Test2");
	}

	@Override
	public void ewallet() {
		// TODO Auto-generated method stub
		//System.out.println("Test3");
	}

}
