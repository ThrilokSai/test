package Com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Updatepage
{
	WebDriver driver;//creating webdriver as localvariable

	public void url(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))//with ignoring whether lower or upper case opens chrome browser
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/3lok/Desktop/java/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Explorer"))//with ignoring whether lower or upper case opens Internet Explorer browser
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Ramya\\Desktop\\TestingDemoBlazeApplication_844849\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();//maximising the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//implicitly wait for an given time period
		driver.get("https://google.com");//opens the google chrome browser
		System.out.println(driver.getTitle());//gets the title

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");//opens the demoblaze application
		System.out.println(driver.getTitle());//gets the title
	}
	public void addproducts() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();//clicks on homepage
		WebElement b=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
		b.click();//clicks on the phone
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);//waits for the given time period
		Alert alert=driver.switchTo().alert();//Alert handling
		String s=driver.switchTo().alert().getText();//store the message in s
		System.out.println(s);//prints the text in the console window
		Thread.sleep(5000);//waits for the given time period
		alert.accept();//accepts the alert
		driver.findElement(By.xpath("//*[@id=\"nava\"]/img")).click();//clicking on home page
		WebElement b2=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
		b2.click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(5000);
		Alert alert2=driver.switchTo().alert();//Alerthandling
		String s2=driver.switchTo().alert().getText();//store the message in s
		System.out.println(s2);//prints the text in the console window
		Thread.sleep(5000);//waits for the given time period
		alert.accept();//accepts the alert
		Thread.sleep(2000);//waits for the given time period
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		Thread.sleep(5000);//waits for an given time period
		String s3=driver.findElement(By.id("totalp")).getText();//stores the price in the string s3
		System.out.println("Total price  of All addeditems:" +s3);//printing price in console
		Thread.sleep(2000);
		screenshot("C:\\Users\\Ramya\\Desktop\\TestingDemoBlazeApplication_844849\\src\\test\\resources\\Screenshots\\screenshot1.png");//screenshot will take and stores in that path
		}
	//Taking screenshot
		public void screenshot(String path) throws IOException
		{
			TakesScreenshot ts=((TakesScreenshot)driver);
			File Store=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Store,new File(path));
			
		}

}
