import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Note2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.qualitestgroup.com");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Links available in footer
		WebElement FooterDriver = driver.findElement(By.xpath("//div[@class='footer__main']"));
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		//Links for particular column or section
		WebElement ColumnDriver = driver.findElement(By.xpath("//div[@class='menu-footer-solutions-container']"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		//click on each link
		for(int i=1;i<ColumnDriver.findElements(By.tagName("a")).size();i++) {
			
			String ClickTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickTab);
			Thread.sleep(10000L);
		}
		
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}
