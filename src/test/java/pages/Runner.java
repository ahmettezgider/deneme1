package pages;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@test1",
        features = {"src/test/java/pages/"},
        glue = {"pages"}
)

public class Runner extends AbstractTestNGCucumberTests {
}
