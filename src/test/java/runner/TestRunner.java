package runner;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.core.cli.Main;

   // @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/features",
            glue = {"stepDefinitions"},tags = "@AddtocartTest",
            dryRun = true,
            monochrome = true,
            plugin = {"pretty", "html:target/reports/cucumber-reports.html","json:target/reports/cucumber-reports.json"}
    )
    public class TestRunner extends AbstractTestNGCucumberTests {

    }

