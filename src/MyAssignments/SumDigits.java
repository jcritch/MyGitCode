package MyAssignments;

public class SumDigits {

	public static void main(String[] args) {
		// Write a Java method to compute the sum of the digits in an integer

		int num = 48;
		int sum = 0;
		
		while (num > 0) 
		{
			sum = sum + num % 10;
			num = num / 10;
			
			
			
		}
	{
		System.out.println("The sum of the digits in the integer is: " + sum);
	}
 }
	
}
	

