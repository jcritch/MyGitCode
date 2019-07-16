import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//driver.get("https://login.yahoo.com/account/create?done=https%3A%2F%2Flogin.yahoo.com%2Faccount%2Fpersonalinfo&specId=yidReg");
		
		//static dropdown
		
		//driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click();
		//driver.findElement(By.xpath("//option[@value='1']")).click();
		
		//Select s = new Select(driver.findElement(By.xpath("//select[@id='usernamereg-month']")));
		//s.selectByValue("2");
		//s.selectByIndex(4);
		//s.selectByVisibleText("March");
		
		//dynamic dropdown and checkbox
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		
		
	}
}
