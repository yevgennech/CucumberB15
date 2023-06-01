package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false,
        tags = "@database",
        plugin = {"pretty", "html:target/Cucumber.html", "json:target/Cucumber.json", "rerun:target/failed.txt"}

)

// tags option will execute the tagged test cases as mentioned in your runner class
// we use 'or' for executing several test cases: "@testcase1 or @testcase2"

public class SmokeRunner {
}

