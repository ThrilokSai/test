@DemoBlaze_Feature
Feature: DemoBlaze Website

@tc01_demoblazeloginusingexcel
Scenario: To check that the application showing error if invalid details are given and by using alert handling popup message is captured or not

Given the user launched the chromebrowser
When the user open the Demoblaze website
Then user clicks on login button
And user will enter the username password using excel
Then handling the popup message by using assert

@tc02_demoblazeloginandlogout
Scenario: Login and logout

Given user launched the chromebrowser
When the user opens Demoblazeapplication
Then user will click on the loginbutton
Then user will enter credentials
Then user will logout

@tc03_demoblazeupdatecart
Scenario: Updating the cart with more than one product and printing the price in the console window

Given user launches the chromebrowser
When the user opened the demoblaze website
Then user will add multiple products and will display price on console window
And user will tahe the screenshot of the addedproducts.

@tc04_demoblazeplacetheorder
Scenario: Clicking on phones and adding to the cart and place he order.

Given user launches ChromeBrowser
When the user open demoBlaze
Then user will add the product and place the order

