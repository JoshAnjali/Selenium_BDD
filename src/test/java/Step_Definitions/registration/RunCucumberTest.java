package Step_Definitions.registration;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions

        (
              tags = "@registeration",
                 features = {"src/test/resources/Features/registration.feature"},
                //features = {"src/test/resources/Features/Login.feature"},
                glue = {"Step_Definitions"},
               // plugin = {"pretty","html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"},
               plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                       "timeline:test-output-thread/"}

        )

//
//        (
//
//                tags = "@login",
//                glue = {"Step_Definitions"},
//                    //plugin = {"pretty","html:target/site/cucumber-pretty", "json:target/cucumber/cucumber.json"},
//                plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                       "timeline:test-output-thread/"}
//        )

    public class RunCucumberTest extends AbstractTestNGCucumberTests{

}





