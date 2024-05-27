package BasicsofSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	WebDriver  browser1;
	public void FramesImplementation() throws InterruptedException, IOException
	{

		browser1 = new ChromeDriver();
		browser1.manage().window().maximize();
		TakeScreenshot("name1");
		browser1.get("https://www.leafground.com/frame.xhtml");
		TakeScreenshot("name2");
	}
	
	public void TakeScreenshot(String name) throws IOException
	{
		TakesScreenshot t =(TakesScreenshot) browser1;
		File SourceFile =t.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
		FileUtils.copyFile(SourceFile, DestinationFile);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Screenshot s = new Screenshot();
		s.FramesImplementation();
	}

}
