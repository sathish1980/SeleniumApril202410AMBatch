package BasicsofSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
	WebDriver  browser1;

	public void cr() throws InterruptedException
	{
		
		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.facebook.com/");
		System.out.println("lauch fb");
		//browser1.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		browser1.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		/*WebDriverWait wait = new WebDriverWait(browser1,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));
		*/
		Thread.sleep(5000);
		browser1.findElement(By.name("firstname")).sendKeys("sathish");
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("lastname")));
		browser1.findElement(By.name("lastname")).sendKeys("sathish");
		
		}
	
	public void EnterlastName()
	{
		browser1.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait wait = new WebDriverWait(browser1,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("lastname")));
		browser1.findElement(By.name("lastname")).sendKeys("sathish");

	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreateAccount c = new CreateAccount();
		c.cr();
	}

}
