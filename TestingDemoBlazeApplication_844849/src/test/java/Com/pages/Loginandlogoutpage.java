package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Loginandlogoutpage
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
			System.setProperty("webdriver.ie.driver","C:/Users/3lok/Desktop/java/chromedriver.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();//maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//implicitly wait for the given timeperiod
		driver.get("https://google.com");//opens chrome browser
		System.out.println(driver.getTitle());//prints the title of google

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");//opens demoblaze website
		System.out.println(driver.getTitle());//get title
	}
	public void userclick()
	{
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();//clicks the login button
	}
	public void usernamepassword(String username,String password) 
	{
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(username);//sending username using sendkeys
		driver.findElement(By.id("loginpassword")).sendKeys(password);//sending password using sendkeys
		WebElement d=driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]"));
		d.click();//clicks login 
	}
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);//waits for the given time period
		driver.findElement(By.xpath("//*[@id=\"logout2\"]")).click();//clicks on logout
	}

}
