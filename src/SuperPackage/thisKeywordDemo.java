package SuperPackage;
import InheritanceExample.*;
public class thisKeywordDemo extends ArrayExample {

	
	int a = 3;
	
	public void getData1() {
		
		int a = 2;
		System.out.println(a);
		System.out.println(this.a);
		int sum=a+this.a;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		
		thisKeywordDemo tk = new thisKeywordDemo();
		tk.getData();
		ArrayExample ae = new ArrayExample();
		tk.x=7;
		tk.getData();
		
	}
		


}
