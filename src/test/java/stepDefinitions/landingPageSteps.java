package stepDefinitions;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class landingPageSteps {
    TestContextSetup testContextSetup;

    public landingPageSteps (TestContextSetup testContextSetup){
     this.testContextSetup=testContextSetup;

    }


    @Given("user is on Greenkart landing page")
    public void user_is_on_greenkart_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        testContextSetup.driver=new ChromeDriver();
        //driver.get("https://rahulshettyacademy.com/locatorspractice/");
        testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        testContextSetup.driver.manage().window().maximize();
        System.out.println(testContextSetup.driver.getTitle());
        testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // throw new io.cucumber.java.PendingException();
    }

}
