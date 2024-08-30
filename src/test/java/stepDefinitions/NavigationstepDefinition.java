package stepDefinitions;

import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.cucumber.java.en.*;

public class NavigationstepDefinition {
	WebDriver driver;

	@Given("Navigate to the URL")
	public void navigate_to_the_url() {
		driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("click on the Home item  link")
	public void click_on_the_1st_item() {
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		System.out.println("My name is saurabh");

	}

	@Then("click on the view product button")
	public void click_on_the_home_button() {
		driver.findElement(By.xpath("(//a[contains(text(),'View Product')])[1]")).click();

	}

	@And("click on the Add to cart button")
	public void click_on_the_add_to_cart_button() throws Throwable {
		driver.findElement(By.xpath("(//button[normalize-space()='Add to cart'])[1]")).click();
		Thread.sleep(3000);
		String modalText = driver.findElement(By.xpath("//div[@class='modal-content']/div[2]/p[1]")).getText();
		System.out.println(modalText);
		
	}

	
	@When("click on the login button of the homepage")
	public void clickOnTheSignupLoginButton() {
	driver.findElement(By.xpath("//div[@class='col-sm-8']//li[4]")).click();
	}
	
	
	
	@When("Enter the {string} and {string}")
    public void loginWithDifferentEmailAndPassword(String username, String password)  {
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys(username);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(password);
		
}
	@Then("click on the login button")
    public void clickOnLoginButton() throws Throwable {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[text()='Login']")).click();
    	String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
       
    }

}

