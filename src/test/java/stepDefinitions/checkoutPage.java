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

public class checkoutPage {
    TestContextSetup testContextSetup;

    public checkoutPage (TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;

    }

        @Then("User check out")
    public void add_item_to_cart() {
        // Write code here that turns the phrase above into concrete actions
            testContextSetup.driver=new ChromeDriver();
        testContextSetup.driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
            testContextSetup.driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
            testContextSetup.driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
        //Explicit Wait
        WebDriverWait wPromo =new WebDriverWait(testContextSetup.driver,Duration.ofSeconds(5));
        wPromo.until(ExpectedConditions.visibilityOf(testContextSetup.driver.findElement(By.cssSelector(".promoInfo"))));
        System.out.println(testContextSetup.driver.findElement(By.cssSelector(".promoInfo")).getText());
            testContextSetup.driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        System.out.println("Navigated to "+ testContextSetup.driver.getTitle());
        System.out.println("Navigated to URL "+testContextSetup.driver.getCurrentUrl());
        Assert.assertEquals(testContextSetup.driver.getCurrentUrl(),"https://rahulshettyacademy.com/seleniumPractise/#/country");
        wPromo.until(ExpectedConditions.elementToBeClickable(testContextSetup.driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"))));
        WebElement ddwebCountry=testContextSetup.driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"));
        ddwebCountry.click();
        Select ddCountry=new Select(ddwebCountry);

        ddCountry.selectByValue("United States");
        System.out.println(ddCountry.getFirstSelectedOption().getText());
        WebElement chkbox=testContextSetup.driver.findElement(By.cssSelector("input[type='checkbox']"));
        chkbox.click();

        if(chkbox.isSelected()) {
            System.out.println("Agreed to Terms");
            testContextSetup.driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
            System.out.println("Order processed");
        }
        else
            //WebElement errText=driver.findElement(By.xpath("//button[contains(text(),'Please accept Terms & Conditions - Required')]"));
            Assert.assertEquals(testContextSetup.driver.findElement(By.xpath("//button[contains(text(),'Please accept Terms & Conditions - Required')]")).getText(),"Please accept Terms & Conditions - Required");
            testContextSetup.driver.quit();
       // throw new io.cucumber.java.PendingException();
    }

}
