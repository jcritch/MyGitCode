package MyPractice;

public class PrimeNumbers3 {
	
	
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7};
		int b_even = 0;
		int b_odd = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]%2 == 0)
			{
				b_even++;
			}
			else
				b_odd++;
		}
		
		System.out.println("number of even: " + b_even);
		System.out.println("number of odd: "+ b_odd);
	
		
	}
}

