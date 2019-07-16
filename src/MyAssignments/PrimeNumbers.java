package MyAssignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Write a Java program to compute the sum of prime numbers between 0 to 100
		
		int i = 0;
		int number = 0;
		int count = 0;
		int sum = 0;
		
		for(number = 1; number <= 100; number++)
		{
			count = 0;
			for (i = 2; i <= number/2; i++)
			{
				if(number % i == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0 && number != 1 )
			{
				sum = sum + number;
	
			}
		}
		System.out.println("The sum of the prime numbers from 0 to 100 is: " + sum);
	}
}