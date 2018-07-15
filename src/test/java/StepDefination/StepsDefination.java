package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepsDefination
{
WebDriver driver;

@Given("^Login page Url$")
public void login_page_Url() {
    driver=new ChromeDriver();
    driver.get("https://hris.qainfotech.com/login.php");
}

@When("^User enters valid Creddentials$")
public void user_enters_valid_Creddentials() {
driver.findElement(By.cssSelector("form[name='loginForm']  #txtUserName")).sendKeys("anmolaggarwal@qainfotech.com");
driver.findElement(By.cssSelector("form[name='loginForm']  #txtPassword")).sendKeys("Anmol@321#");
driver.findElement(By.cssSelector("input[type='submit']")).click();
}

@Then("^User gets Login$")
public void user_gets_Login() {
    
}
}
