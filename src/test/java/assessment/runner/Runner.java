package assessment.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "TODO",
        glue = "TODO",
        plugin = {"pretty", "html:target/cucumber"})
public class Runner {
}
