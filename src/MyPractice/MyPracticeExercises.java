package MyPractice;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyPracticeExercises {
	// Write a Java method to check whether a string is a valid password. Go to the editor
	//Password rules:
		//A password must have at least ten characters.
		//A password consists of only letters and digits.
		//A password must contain at least two digits.
	
	
	public static void main(String[] args) 
	{   
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
	
		System.out.println(sd.format(cal.getTime()));
		
		
		
		
		
		
	}
}

