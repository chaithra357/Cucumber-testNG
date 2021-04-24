package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Steps {
	
	WebDriver driver;
	@Given("I should be on the Home screen with Login Page")
	public void i_should_be_on_the_home_screen_with_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
}
	@When("Enter valid crednetials")
	public void enter_valid_crednetials() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("Login Successful")
	public void login_successful() {
		String name = driver.findElement(By.id("welcome")).getText();
		String ActualData = "Welcome Hansika";
		org.testng.Assert.assertEquals(name,ActualData);
		System.out.println("Login Successfully");
		driver.close();
		
}
}
