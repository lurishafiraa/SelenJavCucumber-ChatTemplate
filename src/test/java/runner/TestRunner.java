package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions (
        features = "src/test/java/features",
        glue = {"utility", "steps"}
)

public class TestRunner {

}
