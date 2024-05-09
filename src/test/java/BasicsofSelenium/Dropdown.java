package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public void DropdownImplementation() throws InterruptedException
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.leafground.com/select.xhtml");
		//browser1.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select s = new Select(browser1.findElement(By.className("ui-selectonemenu")));
		/*
		 * selectByIndex
		 * selectByvalue
		 * selectByvisibleText
		 * isMultiple
		 * deselectByIndex
		 * deselectByvalue
		 * deselectByvisibleText
		 * deselectAll
		 */
		System.out.println(s.isMultiple());
		s.selectByIndex(2);
		//Thread.sleep(2000);
		s.selectByVisibleText("Cypress");
		//s.selectByValue("");
	}

	
	public void DropdownImplementationwithmultiple() throws InterruptedException
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		//browser1.get("https://www.leafground.com/select.xhtml");
		browser1.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select s = new Select(browser1.findElement(By.xpath("//*[@class='col-lg-3' and @id='second']")));
		/*
		 * selectByIndex
		 * selectByvalue
		 * selectByvisibleText
		 * isMultiple
		 * deselectByIndex
		 * deselectByvalue
		 * deselectByvisibleText
		 * deselectAll
		 */
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByVisibleText("Burger");
		Thread.sleep(2000);
		s.selectByValue("donut");
		Thread.sleep(2000);
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByValue("burger");
		Thread.sleep(2000);
		s.deselectAll();
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown D = new Dropdown();
		D.DropdownImplementationwithmultiple();
	}

}
