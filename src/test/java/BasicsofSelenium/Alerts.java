package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	
	public void alertimplementation()
	{
		WebDriver  browser1;
		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		browser1.get("https://www.leafground.com/alert.xhtml");
		browser1.findElement(By.id("j_idt88:j_idt91")).click();
		browser1.switchTo().alert().accept();
		String text = browser1.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		browser1.findElement(By.id("j_idt88:j_idt93")).click();
		browser1.switchTo().alert().dismiss();
		String text1 = browser1.findElement(By.id("result")).getText();
		System.out.println(text1);
		browser1.findElement(By.id("j_idt88:j_idt104")).click();
		browser1.switchTo().alert().sendKeys("Besant");
		System.out.println(browser1.switchTo().alert().getText());
		browser1.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alerts A = new Alerts();
		A.alertimplementation();
	}

}
