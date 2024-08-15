package Step_Definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions

        (
              //tags = "@registeration",
                //features = {"src/test/resources/Features/registration.feature"},
                //features = {"src/test/resources/Features/Login.feature"},
                features={"src/test/resources/Feature"},
                glue = {"Step_definitions"},
               // plugin = {"pretty","html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"},
               plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                       "timeline:test-output-thread/"}

        )

            public class RunCucumberTest extends AbstractTestNGCucumberTests {

}