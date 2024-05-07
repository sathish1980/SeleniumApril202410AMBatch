package BasicsofSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RadioButtonAndcheckbox {
	
	public void RadioButton(String expectedname)
	{
		WebDriver  browser1;

			browser1 = new ChromeDriver();
			browser1.manage().window().maximize();
			browser1.get("https://www.leafground.com/radio.xhtml");
			browser1.findElement(By.xpath("//*[@id='j_idt87:console1']//td[2]//div[starts-with(@class,'ui-radiobutton-box')]")).click();
			
			/*
			 * dynamically handling radio button
			 */
			List<WebElement> allRadiobutton= browser1.findElements(By.xpath("//*[@id='j_idt87:console1']//td"));
			for(int i=1;i<=allRadiobutton.size();i++)
			{
				String actualname = browser1.findElement(By.xpath("//*[@id='j_idt87:console1']//td["+i+"]//label")).getText();
				if(actualname.equalsIgnoreCase(expectedname))
				{
					browser1.findElement(By.xpath("//*[@id='j_idt87:console1']//td["+i+"]//div[starts-with(@class,'ui-radiobutton-box')]")).click();
					String className = browser1.findElement(By.xpath("//*[@id='j_idt87:console1']//td["+i+"]//div[starts-with(@class,'ui-radiobutton-box')]")).getAttribute("class");
					if(className.contains("ui-state-active"))
					{
						System.out.println("pass");
					}
					
					break;
				}
			}
			
			
			
	}
	
	public void checkbox(String[] expectedNAmes)
	{
		WebDriver  browser1;

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.leafground.com/checkbox.xhtml");
		browser1.findElement(By.cssSelector("[class^='ui-selectcheckboxmenu-trigger']")).click();
		WebDriverWait wait = new WebDriverWait(browser1,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[starts-with(@class,'ui-selectcheckboxmenu-items')]//li[last()]")));
		
		List<WebElement> allvalues = browser1.findElements(By.xpath("//ul[starts-with(@class,'ui-selectcheckboxmenu-items')]//li"));
		for(int i=1;i<=allvalues.size();i++)
		{
			String actualName = browser1.findElement(By.xpath("//ul[starts-with(@class,'ui-selectcheckboxmenu-items')]//li["+i+"]//label")).getText();
			for(String expectedNAme : expectedNAmes)
			{
			if(expectedNAme.equalsIgnoreCase(actualName))
			{
				 browser1.findElement(By.xpath("//ul[starts-with(@class,'ui-selectcheckboxmenu-items')]//li["+i+"]//div[starts-with(@class,'ui-chkbox-box')]")).click();
				 //break;
					
			}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonAndcheckbox R = new RadioButtonAndcheckbox();
		String[] values = {"Rome","Paris","Amsterdam"};
		R.checkbox(values);
	}

}
