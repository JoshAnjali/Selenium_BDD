package Step_Definitions.registration.login;

import Step_Definitions.registration.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObject.LoginPage;

public class login {
    private WebDriver driver4 = Hooks.driver1;
    private LoginPage loginPage = new LoginPage(driver4);

    @Given("I am on the landing page.")
    public void VerifyLandingPage() {
        Assert.assertTrue(loginPage.verifyonLandingPage());
    }

    @When("I click on the login button.")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @When("I click on the login link text.")
    public void iclickOnTheLoginLinkText() {
        loginPage.clickLoginlink();

    }

    @When("I fills the login form with valid credentials.\"Email\"Password\"Abc123\"")
    public void iFillsLoginform(String username, String password) {

        loginPage.enterEmail(username);
        loginPage.enterPassword(password);
    }


}

