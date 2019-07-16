package VikasAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question15 {

	public static void main(String[] args) {
		//15.	WAP to print the current date
		
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sd = new SimpleDateFormat("MMMM/d/yyyy");
		System.out.println(sd.format(d));
	}

}




