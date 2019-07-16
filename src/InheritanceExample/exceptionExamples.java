package InheritanceExample;

public class exceptionExamples {

	public static void main(String[] args) {
		
		
		try
		{
			int arr[] = new int[5];
			System.out.println(arr[7]);
			
			int k,b,c;
			b=10;
			c=0;
			k=b/c;
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("I am catching an Arithmetic Exception");
		}
		
		catch(IndexOutOfBoundsException et)
		{
			System.out.println("This array Index out of bound exception");
		}
		
		catch(Exception e)
		{
			System.out.println("This is catching an exception");
		}
		
		
		finally
		{
			System.out.println("This will always be executed");
		}
		
		
		
	}

}
