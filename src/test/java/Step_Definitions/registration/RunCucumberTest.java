package Step_Definitions.registration;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions

        (

                features = {"src/test/resources/Features"},
                glue = {"Step_Definitions"},
               plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


        )

            public class RunCucumberTest extends AbstractTestNGCucumberTests {

}