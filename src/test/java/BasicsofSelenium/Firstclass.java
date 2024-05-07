package BasicsofSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.devtools.v122.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;

public class Firstclass {

	public void Launch(String value) throws InterruptedException
	{
		
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--start-maximized");
		cp.addArguments("--ignore-certificate-errors");
		cp.addArguments("--disable-popup-blocking");
		cp.addArguments("incognito");
		cp.addArguments("--headless=new");
		WebDriver browser1;
		if(value=="headless")
		{
		  browser1 = new ChromeDriver(cp);
		 
		}
		else
		{
			browser1 = new ChromeDriver();
		}
		//WebDriver browser1 = new EdgeDriver(); // open the browser
		browser1.manage().window().maximize();
		browser1.get("https://www.facebook.com/");
		System.out.println("lauch fb");
		//browser1.get("https://www.gmail.com/");
		/*browser1.navigate().to("https://www.gmail.com/");
		browser1.navigate().back();
		browser1.navigate().forward();
		browser1.navigate().refresh();
		//browser1.manage().window().minimize();
		//browser.close();
		browser1.quit();*/
		WebElement username = browser1.findElement(By.id("email"));
		username.sendKeys("facebook");
		username.clear();
		//or
		browser1.findElement(By.id("email")).sendKeys("details");
		browser1.findElement(By.id("email")).clear();	
		System.out.println("email entered and cleared");
		// or
		browser1.findElement(By.id("email")).sendKeys("kumar");
		Thread.sleep(1000);
		browser1.findElement(By.name("email")).sendKeys("kumar");
		browser1.findElement(By.cssSelector("input#pass")).sendKeys("test");
		browser1.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("test1");
		System.out.println("email entered");
		//browser1.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("besant");
		//browser1.quit();
		// webelement +action = Step;
		//browser1.findElement(By.name("login")).click();
		//browser1.findElement(By.linkText("Forgotten password?")).click();
		//browser1.findElement(By.partialLinkText("passw")).click();
		System.out.println("done");
		browser1.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("email id");
		browser1.findElement(By.xpath("//input[@data-testid='royal_email']")).clear();
		browser1.findElement(By.xpath("//div[@class='_6lux']//input[@id='email']")).sendKeys("Besant");
		browser1.findElement(By.xpath("//input[contains(@class,'_55r1') and @id='email']")).clear();
		//browser1.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();
		browser1.findElement(By.xpath("//*[text()='Create new account']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Firstclass F = new Firstclass();
		F.Launch("chrome");
	}

}
