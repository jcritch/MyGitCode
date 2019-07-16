package MyAssignments;

public class ConcantenateString {

	public static void main(String[] args) {
		// Write a Java program to concatenate a given string to the end of another string

		String str1 = new String("Hello");
		String str2 = new String("World");
		String str3 = new String(str1+str2);
		System.out.println("The two strings concantenated together is: " + str3);
	}
	
}
