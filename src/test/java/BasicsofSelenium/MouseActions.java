package BasicsofSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {
	
	public void MouseActionImplementation()
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.ebay.com/");
		/*
		 * 1.MoveToelement
		 * 2.click
		 * 3.SendKeys
		 * 4.doubleclick
		 * 5.contextClick
		 * 6.DragAndDrop(sourceelement,destinationelement)
		 * 7.DragandDropBy(sourceelement,int xaxis, int yaxis)
		 */
		
		Actions mouseactions = new Actions(browser1);
		mouseactions.moveToElement(browser1.findElement(By.xpath("//*[@class='vl-flyout-nav__js-tab']//a[text()='Electronics']"))).perform();
		WebDriverWait wait = new WebDriverWait(browser1,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Computers and tablets']")));
		
		mouseactions.moveToElement(browser1.findElement(By.xpath("//a[text()='Computers and tablets']"))).click().perform();
		
	}

	public void mouseimplementaion2()
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser1);
		
		mouseactions.moveToElement(browser1.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
	}
	
	public void DragAndDrop()
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.leafground.com/drag.xhtml");
		Actions mouseactions = new Actions(browser1);
		
		mouseactions.moveToElement(browser1.findElement(By.id("form:drag_content"))).dragAndDrop(browser1.findElement(By.id("form:drag_content")), browser1.findElement(By.id("form:drop_content"))).perform();
		
	}
	
	public void DragAndDropby()
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.leafground.com/drag.xhtml");
		Actions mouseactions = new Actions(browser1);
		
		mouseactions.moveToElement(browser1.findElement(By.xpath("//*[@id='form:j_idt125']//span[2]"))).dragAndDropBy(browser1.findElement(By.xpath("//*[@id='form:j_idt125']//span[2]")), -60, 0).perform();
		mouseactions.moveToElement(browser1.findElement(By.xpath("//*[@id='form:j_idt125']//span[1]"))).dragAndDropBy(browser1.findElement(By.xpath("//*[@id='form:j_idt125']//span[1]")), 60, 0).perform();

	}
	
	
	public void mouseimplementaionwithkeyboard()
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser1);
		
		mouseactions.moveToElement(browser1.findElement(By.id("email"))).sendKeys("sathish").perform();
		mouseactions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		mouseactions.moveToElement(browser1.findElement(By.id("pass"))).sendKeys("password").perform();
		mouseactions.keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT).keyUp(Keys.TAB).perform();
		
	}
	
	
	public void KeyboardusingRobot() throws AWTException, InterruptedException
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser1);
		
		mouseactions.moveToElement(browser1.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		MouseActions M = new MouseActions();
		M.KeyboardusingRobot();
	}

}
