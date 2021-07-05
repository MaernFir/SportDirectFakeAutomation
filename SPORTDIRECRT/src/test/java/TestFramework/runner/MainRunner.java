package TestFramework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/java/TestFramework/featureFiles/"},
            glue = {"TestFramework.stepFiles"},
            monochrome = true,
            plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
    )
    public class MainRunner {
        public MainRunner() {
        }
    }
