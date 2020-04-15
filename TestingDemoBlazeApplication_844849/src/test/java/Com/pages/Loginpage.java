package Com.pages;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Com.Excelutility.Excel;
public class Loginpage
{
	WebDriver driver;//creating webdriver as localvariable

	public void url(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))//with ignoring whether lower or upper case opens chrome browser
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/3lok/Desktop/java/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Explorer"))//with ignoring whether lower or upper case opens Internet Explorer browser
		{
			System.setProperty("webdriver.ie.driver", "C:/Users/3lok/Desktop/java/chromedriver.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();//maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//implicitly wait for the given timeperiod
		driver.get("https://google.com");//opens the chrome browser
		System.out.println(driver.getTitle());//get the title 

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");//opens the demoblaze website
		System.out.println(driver.getTitle());//get the title
	}
	public void userclick()
	{
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();//clicks on login button
	}
	public void usernamepassword(int a) throws IOException
	{
		Excel ex=new Excel();
		driver.findElement(By.id("loginusername")).sendKeys(ex.excel_username(a));//reads the username from excel
		driver.findElement(By.id("loginpassword")).sendKeys(ex.excel_password(a));//reads the password from excel
		WebElement d=driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]"));
		d.click();//clicks on the login
		
	}
	public void Assertion() throws InterruptedException
	{
		Thread.sleep(5000);//waits for a given time period
		Alert alert=driver.switchTo().alert();//gos to alert popup window
		String s=driver.switchTo().alert().getText();//stores the text in the s
		System.out.println(s);//prints the text on console
		Thread.sleep(5000);//waits for a certain period
		alert.accept();//accepts the popup
	}

}
