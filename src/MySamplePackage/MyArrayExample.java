package MySamplePackage;

public class MyArrayExample {
 
	public static void main(String[] args) {
		
		int c[] = {4,5,6,7};
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
			if(c[i]==6)
			{
				break;
				
			}
		}
		System.out.println("We are out of loop");
}
}