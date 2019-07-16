import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.className("inputtext")).sendKeys("test123");
		//driver.findElement(By.className("inputtext")).sendKeys("password");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.close();
		
		/*driver.get("https://login.salesforce.com/");
		driver.findElement(By.name("username")).sendKeys("test");
		driver.findElement(By.id("password")).sendKeys("password");*/
	}

}
