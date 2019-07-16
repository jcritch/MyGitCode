import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.makemytrip.com/");
		//System.out.println("Before click on multi city option");
		//driver.findElement(By.xpath("//input[@id='hp-widget_return']")).isDisplayed();
		//driver.findElement(By.xpath("//label[contains(text(),'multi-city')]")).click();
		//System.out.println("Before click on multi city option");
		//driver.findElement(By.xpath("//input[@id='hp-widget_return']")).isDisplayed();
		
		//System.out.println("Before click on multi city option");
		//System.out.println(driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).isDisplayed());
		//driver.findElement(By.xpath("//li[contains(text(),'Multi City')]")).click();
		//System.out.println("After clicking on multi city option");
		//System.out.println(driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).isDisplayed());
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("Https://www.makemytrip.com/");
		System.out.println("Before click on multi city option");
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).isDisplayed());
		driver.findElement(By.xpath("//li[contains(text(),'Multi City')]")).click();
		System.out.println("After clicking on multi city option");
		//driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).isDisplayed();
	}

}
