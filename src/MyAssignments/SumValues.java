package MyAssignments;


public class SumValues {
	
	public static void main(String[] args) {
	//Write a Java program to sum values of an array
		
		int a[] = new int[]{5, 7, 9, 12, 15, 20};
		int sum = 0;

		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}

		System.out.println("The sum of the values of the array equals: " +sum);
	
	}
	

}
