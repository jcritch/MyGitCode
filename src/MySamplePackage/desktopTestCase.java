package MySamplePackage;

public class desktopTestCase {

	public static void main(String[] args) {
		
		String s = "hannah";
		String t = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t + s.charAt(i);
	
		}
	
	System.out.println(t);
	
	if(s.equals(t))
	{
		System.out.println("The value is a palindrome");
		System.out.println("Desktop Case 1");
	}
	
	else
	{
		
	System.out.println("Value is not a palindrome");
	System.out.println("Desktop Case 2");
	}
	
	}
	

}
