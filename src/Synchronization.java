import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://alaskatrips.poweredbygps.com/");
		
		//driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys("nyc");
		//driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//section[@id='section-package-tab-hp']//div[@class='cols-nested ab25184-location']//div[1]//div[1]//div[1]//button[1]")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys("newark");
		//driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//div[contains(@class,'hero-banner-box siteId-70208 cf hideClassicDcol')]//div[1]//div[2]//div[1]//div[1]//button[1]")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//fieldset[contains(@class,'sub-nav-select')]//div[4]//label[1]")).click();
		driver.findElement(By.xpath("//fieldset[contains(@class,'sub-nav-select')]//div[4]//label[1]")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@id='hotel-destination-hp-package']")).sendKeys("Newark");
		driver.findElement(By.xpath("//input[@id='hotel-destination-hp-package']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='package-hc-departing-hp-package']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='package-hc-departing-hp-package']")).sendKeys("06/22/2019");
		driver.findElement(By.xpath("//input[@id='package-hc-departing-hp-package']")).sendKeys(Keys.ENTER);
		WebDriverWait d = new WebDriverWait(driver, 10);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@id='3257815']//a[contains(@class,'flex-link')]")));
		driver.findElement(By.xpath("//article[@id='3257815']//a[contains(@class,'flex-link')]")).click();
		
		//d.until(ExpectedConditions.titleContains(title));
		//d.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		//d.until(ExpectedConditions.elementToBeClickable(locator));
		//Thread.sleep(5000L);
		
		
		
		
	}

}
