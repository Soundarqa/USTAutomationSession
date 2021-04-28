package stepDefinition;


import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class loginstepDefinition {
	
	public static WebDriver driver;
	
	//Hooks
	@Before
	public void openChromeBrowser() throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");	
        Thread.sleep(3000);
	}
	
	@After
	public void closeChromeBrowser() throws InterruptedException 
	{

        driver.quit();
	}
	
	 @Given("^Open the application$")
	    public void open_the_application() throws Throwable {
		 System.out.println("Step 1 completed");
	    }

	    @When("^User is on login page$")
	    public void user_is_on_login_page() throws Throwable {
	    	System.out.println("Step 2 completed");
	    }

	    @When("^User login to the application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_to_the_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	driver.findElement(By.id("user-name")).sendKeys(strArg1);
	    	driver.findElement(By.id("password")).sendKeys(strArg2);
	    	driver.findElement(By.id("login-button")).click();
	    	Thread.sleep(5000);
	    }

	    @Then("^Home Page is displayed$")
	    public void home_page_is_displayed() throws Throwable {
	    	System.out.println("Step 4 completed");

	    }

}
