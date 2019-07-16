package MyAssignments;

public class SmallestAndLargest {

	public static void main(String[] args) {
	//Write a Java program to find the smallest and largest element in a given array. Elements in the array can be in any order.
	
		int a[] = new int[]{3, 6, 9, 20, 10, 7, 50, 1, 12};
		int smallest = a[0];
		int largest = a[0];
	
		for (int i = 0; i < a.length; i++) {
		
			if (a[i] > largest) {
				largest = a[i];
			}
		    if (a[i] < smallest) {
				smallest = a[i];
		    }
		}
		
		System.out.println("The smallest value in the array is: " + smallest);
		System.out.println("The largest value in the array is: " + largest);
	}
}
