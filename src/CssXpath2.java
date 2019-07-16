import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id='Login']")).click();*/
		
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test");
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("test123");
		driver.findElement(By.cssSelector("#pass")).sendKeys("password123");
		driver.findElement(By.cssSelector("#u_0_a")).click();*/
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("password123");
		driver.findElement(By.cssSelector("input#u_0_2")).click();*/
		
		//driver.get("http://www.rediff.com");
		//driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		//driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input[1]")).sendKeys("test");
		
		driver.get("https://inmarsat--tst2.cs92.my.salesforce.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pass123");
		
	}

}
