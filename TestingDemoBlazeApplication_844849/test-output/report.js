$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "DemoBlaze Website",
  "description": "",
  "id": "demoblaze-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DemoBlaze_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "To check that the application showing error if invalid details are given and by using alert handling popup message is captured or not",
  "description": "",
  "id": "demoblaze-website;to-check-that-the-application-showing-error-if-invalid-details-are-given-and-by-using-alert-handling-popup-message-is-captured-or-not",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_demoblazeloginusingexcel"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launched the chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user open the Demoblaze website",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user will enter the username password using excel",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "handling the popup message by using assert",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_stepdefinition.the_user_launched_the_chromebrowser()"
});
formatter.result({
  "duration": 14672467100,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepdefinition.the_user_open_the_Demoblaze_website()"
});
formatter.result({
  "duration": 2633015000,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepdefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 229807800,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepdefinition.user_will_enter_the_username_password_using_excel()"
});
formatter.result({
  "duration": 2799177300,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d80.0.3987.162)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-5MEJP6I\u0027, ip: \u0027192.168.43.56\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.162, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\3lok\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:61964}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9311796b50a7082debb9b6604c41dfba\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"logInModal\"]//div//div//div[3]//button[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Com.pages.Loginpage.usernamepassword(Loginpage.java:52)\r\n\tat Com.Stepdefinition.Login_stepdefinition.user_will_enter_the_username_password_using_excel(Login_stepdefinition.java:36)\r\n\tat ✽.And user will enter the username password using excel(src/main/resources/Feature/Testcase.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login_stepdefinition.handling_the_popup_message_by_using_assert()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Login and logout",
  "description": "",
  "id": "demoblaze-website;login-and-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tc02_demoblazeloginandlogout"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launched the chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "the user opens Demoblazeapplication",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user will click on the loginbutton",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user will enter credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user will logout",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginandLogout_stepdefinition.user_launched_the_chromebrowser()"
});
