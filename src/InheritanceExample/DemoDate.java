package InheritanceExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Date d = new Date();
			System.out.println(d.toString());
			
			SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
			System.out.println(sd.format(d));
	}

}
