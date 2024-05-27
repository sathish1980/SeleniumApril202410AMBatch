package BasicsofSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	WebDriver  browser1;
	public void FramesImplementation() throws InterruptedException
	{

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.leafground.com/frame.xhtml");
		//Thread.sleep(3000);
		/*
		 * to navigate inside of the frame by the 3 ways
		 * 1.id
		 * 2.name
		 * 3.index
		 */
		List<WebElement> allFrame =browser1.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrame.size();i++)
		{
			// navigate in to the frame
			browser1.switchTo().frame(i);
			// given element exist in the frame or not ?
			List<WebElement> elementExist =	browser1.findElements(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]"));
			if(elementExist.size()>0)
			{
				browser1.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
				break;
			}
			// come out of from the frame
			browser1.switchTo().defaultContent();
		}
		browser1.switchTo().defaultContent();
		
		
	}
	
	
	public void FramesinsideofFrame() throws InterruptedException
	{

		//Thread.sleep(3000);
		/*
		 * to navigate inside of the frame by the 3 ways
		 * 1.id
		 * 2.name
		 * 3.index
		 */
		List<WebElement> allFrame =browser1.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrame.size();i++)
		{
			// navigate in to the frame
			browser1.switchTo().frame(i);
			List<WebElement> innerFrame =browser1.findElements(By.tagName("iframe"));
			if(innerFrame.size()>0)
			{
				browser1.switchTo().frame("frame2");
				// given element exist in the frame or not ?
				List<WebElement> elementExist =	browser1.findElements(By.xpath("//*[@id='Click' and contains(@style,'4b7ecf')]"));
				if(elementExist.size()>0)
				{
					browser1.findElement(By.xpath("//*[@id='Click' and contains(@style,'4b7ecf')]")).click();
					break;
				}
			}
			
			// come out of from the frame
			browser1.switchTo().defaultContent();
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Frames F = new Frames();
		F.FramesImplementation();
		F.FramesinsideofFrame();
	}

}
