package pages;


import com.cucumber.listener.Reporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = "@test1",
        features = {"src/test/java/pages/"},
        glue = {"pages"},
        plugin = { //basit rapor oluşturan plugin
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        }
)

public class Runner extends AbstractTestNGCucumberTests {


}
