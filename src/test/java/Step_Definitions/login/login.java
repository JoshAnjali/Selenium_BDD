package Step_Definitions.login;

import Step_Definitions.registration.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.LoginPage;

public class login
{
    private WebDriver driver4 = Hooks.driver1;
    private LoginPage loginPage = new LoginPage(driver4);

    @When("i fills the login form with valid details {string} {string}")
    public void userFillsLoginform(String username, String password)
    {
        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void clickLoginbutton() {
        loginPage.clickLoginlink();
    }

    @When("I click on the login link text")
    public void iclickonTheLoginLinkText()
    {
        loginPage.clickLoginlink();
    }
}


