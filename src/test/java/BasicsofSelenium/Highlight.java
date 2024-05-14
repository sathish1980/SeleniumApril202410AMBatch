package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Highlight {

	WebDriver browser;

	public void HighLights()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/dashboard.xhtml");
		WebElement element = browser.findElement(By.id("menuform:j_idt40"));
		
		JavascriptExecutor js = (JavascriptExecutor) browser;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
	js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid red;');", element);
		WebElement ele = browser.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid red;');", ele);
		
		
	}
	
	public  static void main(String[] args)
	{
		Highlight h = new Highlight();
		h.HighLights();
		
	}
}
