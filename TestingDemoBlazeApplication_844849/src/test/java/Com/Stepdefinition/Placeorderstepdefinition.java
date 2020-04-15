package Com.Stepdefinition;

import Com.pages.Placeorderpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Placeorderstepdefinition 
{
	Placeorderpage p=new Placeorderpage();//creating object for placeorder page
	@Given("^user launches ChromeBrowser$")
	public void user_launches_ChromeBrowser() 
	{
	    p.url("chrome");//calling method using object
	}

	@When("^the user open demoBlaze$")
	public void the_user_open_demoBlaze() 
	{
	   p.demoblaze_homePage();//calling method using object
	}

	@Then("^user will add the product and place the order$")
	public void user_will_add_the_product_and_place_the_order() throws InterruptedException
	{
	    p.placeorder();//calling method using object
	}



}
