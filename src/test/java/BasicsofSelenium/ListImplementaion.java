package BasicsofSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListImplementaion {
	
	public void listimple(String expectedcountry)
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.leafground.com/select.xhtml");
		/*
		 * click the list
		 * wait for the full list to be load
		 * select the value which u want ( get the text of each value in the list and select)
		 * 
		 */
		
		browser1.findElement(By.xpath("//*[@id='j_idt87:country']//*[starts-with(@class,'ui-selectonemenu-trigger')]")).click();
		WebDriverWait wait = new WebDriverWait(browser1,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:country_items']//li[last()]")));
		
		List<WebElement> allcountries = browser1.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
		for(WebElement eachcountry :allcountries )
		{
			String name = eachcountry.getText();
			if(expectedcountry.equalsIgnoreCase(name))
			{
				eachcountry.click();
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListImplementaion L = new ListImplementaion();
		L.listimple("Brazil");
	}

}
