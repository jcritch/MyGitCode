import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

public class cert01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Defining profile which accepts insecure certificates
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		//Second way
		//ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//handle cookies
		driver.get("https://www.google.com");
		/*driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("");
		driver.manage().addCookie(null);*/
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("D:\\Screenshot1.png"));
		
		WindowsUtils.killByName("excel.exe");
	
		
	}
}
