import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		
		//enter something in capitals and enter
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//right click
		
		a.moveToElement(move).contextClick().build().perform();
	
	}

}
