package CaptureScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Libraries.Utility;

public class FaceBook_Screenshot {
	WebDriver driver;
@Test
public void  CaptureScreenshot()throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 driver=new ChromeDriver();
driver.	manage().window().maximize();
driver.get("http://www.facebook.com");
Utility.CaptureScreenshot(driver,"BrowserStarted" );
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Learn Automation");
Utility.CaptureScreenshot(driver,"TypeUName" );

}
@AfterMethod
public void tearDown(ITestResult result)
{

if(ITestResult.FAILURE==result.getStatus())
{
	Utility.CaptureScreenshot(driver,result.getName());
}
driver.quit();
}
}