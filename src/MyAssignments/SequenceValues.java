package MyAssignments;

public class SequenceValues {

	public static void main(String[] args) {
		// Write a Java program to test if a given string contains the specified sequence of char values

		String str1 = new String("What is your name");
		String str2 = "name";
		
		if (str1.contains(str2))
		{
			System.out.println("The string contains the sequence of " + str2);		
		}
		else
		{
			System.out.println("The string does not contain the sequence");
		}
	}
	
}
