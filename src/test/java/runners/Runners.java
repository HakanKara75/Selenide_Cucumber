package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
        },
        monochrome = true,
        features = "src/test/resocurces/features",
        glue = {"stepdefinitions"},
        dryRun = false,
        tags ="@headless3"
)
public class Runners {
}
