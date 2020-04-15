package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Placeorderpage
{
	WebDriver driver;//creating webdriver as localvariable

	public void url(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))//with ignoring whether lower or upper case opens chrome browser
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/3lok/Desktop/java/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Explorer"))//with ignoring whether lower or upper case opens Internet explorer browser
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Ramya\\Desktop\\TestingDemoBlazeApplication_844849\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();//maximizes the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//implicitly wait for the given time period
		driver.get("https://google.com");//opens googole chrome
		System.out.println(driver.getTitle());//gets the title

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");//opens the demoblaze website
		System.out.println(driver.getTitle());//get the title
	}
	public void placeorder() throws InterruptedException
	{
		WebElement b=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
		b.click();//clicks on phone
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();//clicks on add to cart
		Thread.sleep(5000);//waits for the given time period
		Alert alert=driver.switchTo().alert();//Alert handling
		String s=driver.switchTo().alert().getText();//Stores the text in s
		System.out.println(s);//prints the text in the console window
		Thread.sleep(5000);//waits for the given time period
		alert.accept();//accept alert message
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();//clicks on cart
		Thread.sleep(3000);//waits fo the given time period
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();//click on placeorder
		   driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ramya");//using sendkeys sending name
		   driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");//sending country name using send keys
		   driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Chennai");//sending city name using send keys
		   driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("123456");//sending cardnumber using sendkeys
		   driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("12");//sending month name using sendkeys
		   driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("22");//sending year using sendkeys
		   driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();//licks on place order
		
	}

}
