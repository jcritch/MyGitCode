import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20743/ind-vs-pak-5th-match-group-a-asia-cup-2018");
		//WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++) {
			
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		
		String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueint = Integer.parseInt(value);
		sum=sum+valueint;
		
		}
		
		System.out.println(sum);
		
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extravalues = Integer.parseInt(Extras);
		int Totalsum=sum+extravalues;
		System.out.println(Totalsum);
		
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActTotalValue = Integer.parseInt(ActualTotal);
		if(ActTotalValue==Totalsum) {
			
			System.out.println("Count Matches");
		}
		
		else {
			System.out.println("Count is not matching");
		}
	}
	

}
