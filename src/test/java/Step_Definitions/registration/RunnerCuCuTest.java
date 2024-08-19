package Step_Definitions.registration;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

    (
            tags = "@registration",
            features = {"src/test/resources/Features/registration.feature"},
            glue = {"Step_Definitions"},
            plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                    "timeline:test-output-thread/"}

    )

public class RunnerCuCuTest extends AbstractTestNGCucumberTests {
}

