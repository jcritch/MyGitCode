package InheritanceExample;

public class ArrayExample {

	protected int x=3;
	
	protected void getData() 
	{
		System.out.println("This is a TEST Message");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		a[0]=4;
		a[1]=2;
		a[2]=5;
		a[3]=3;
		a[4]=9;
		
		int b[] = {3,4,2,6,7};
		
		for(int i=0;i<b.length;i++) {
			
			System.out.println(b[i]);
		}
	
	ArrayExample ae = new ArrayExample();
	ae.getData();
	
	
	}
	
	
	
	

}
