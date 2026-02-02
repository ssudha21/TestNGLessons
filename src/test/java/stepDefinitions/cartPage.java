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

public class cartPage {
    TestContextSetup testContextSetup;

    public cartPage(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;

    }

    @When("user search an item by {int} letters and extracted actual name of the product")
    public void user_search_an_item_by_letters_and_extracted_actual_name_of_the_product(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        testContextSetup.driver=new ChromeDriver();
        Actions a = new Actions(testContextSetup.driver);
        WebDriverWait waitSearch =new WebDriverWait(testContextSetup.driver,Duration.ofSeconds(20));
        waitSearch.until(ExpectedConditions.visibilityOf(testContextSetup.driver.findElement(By.xpath("//input[@type='search']"))));
        WebElement searchText = testContextSetup.driver.findElement(By.xpath("//input[@type='search']"));
        a.sendKeys(searchText,"apple").perform();
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Searching..");
        a.moveToElement(searchText).doubleClick().keyDown(Keys.DELETE).perform();
        System.out.println("Cleared Search..");

        //throw new io.cucumber.java.PendingException();
    }

    @Then("user verifies the item exists in the page and add to Cart")
    public void user_verifies_the_item_exists_in_the_page() {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> productList = testContextSetup.driver.findElements(By.cssSelector("h4.product-name"));
        int j = 0;
        for (int i = 0; i < productList.size(); i++) {
            //String prdName=productList.get(i).getText();
            String[] prdName = productList.get(i).getText().split("-");
            String formattedPrd = prdName[0].trim();

            // String[] result = Arrays.stream(attributes.split(",")).map(String::trim).toArray(String[]::new);
            String[] prdtoAdd = {"Cucumber", "Banana", "Apple"};
            int itemstoBuy = prdtoAdd.length;
         /*if(prdName.contains("Cucumber"))
         {
             List<WebElement> btnAdd=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
             btnAdd.get(i).click();
             System.out.println("Added to cart "+ prdName);
             break;

         }*/
            List<String> prdtoAddArray = Arrays.asList(prdtoAdd);
            if (prdtoAddArray.contains(formattedPrd)) {
                itemstoBuy++;
                //List<WebElement> btnAdd = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
                List<WebElement> btnAdd = testContextSetup.driver.findElements(By.xpath("//div[@class='product-action']"));
                btnAdd.get(i).click();
                System.out.println("Added to cart " + formattedPrd);
                if (itemstoBuy == 3) {
                    break;
                }
            }
            /*else
                System.out.println("Product not found");*/

        }
        System.out.println("Items Added " + testContextSetup.driver.findElement(By.xpath("(//strong[contains(text(),itemstoBuy)])[1]")).getText());
        testContextSetup.driver.findElement(By.xpath("//img[@alt='Cart']")).click();

       // throw new io.cucumber.java.PendingException();
    }


}
