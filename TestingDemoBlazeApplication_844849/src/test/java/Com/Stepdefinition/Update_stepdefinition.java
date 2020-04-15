package Com.Stepdefinition;

import java.io.IOException;

import Com.pages.Updatepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Update_stepdefinition 
{
	Updatepage l=new Updatepage();//creating object for updatepage
	@Given("^user launches the chromebrowser$")
	public void user_launches_the_chromebrowser() 
	{
	   l.url("chrome"); //calling method using object
	}

	@When("^the user opened the demoblaze website$")
	public void the_user_opened_the_demoblaze_website() 
	{
	   l.demoblaze_homePage();//calling method using object
	}

	@Then("^user will add multiple products and will display price on console window$")
	public void user_will_add_multiple_products_and_will_display_price_on_console_window() throws InterruptedException, IOException
	{
	   l.addproducts();//calling method using object
	}

	@Then("^user will tahe the screenshot of the addedproducts\\.$")
	public void user_will_tahe_the_screenshot_of_the_addedproducts()
	{
		System.out.println("Screenshot taken sucessfully");//printing message
	}

}
