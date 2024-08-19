package Step_Definitions.registration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BCKHooks {
    public static WebDriver driver1;

    @Before
    public void openBrowswer()
    {
        String appUrl = "https://demo.nopcommerce.com/";
        driver1 = new ChromeDriver();
        driver1.get(appUrl);
        driver1.manage().window().maximize();
    }

    @After
    public void CloseBrowser() throws InterruptedException
    {
        Thread.sleep(5000);
        if(driver1!=null)
        {
            driver1.quit();
        }
    }
}
