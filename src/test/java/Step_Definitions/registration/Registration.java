package Step_Definitions.registration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.RegistrationPage;


public class Registration {

    private WebDriver driver2 = Hooks.driver1;
    private RegistrationPage registrationPage=new RegistrationPage(driver2);

    @Given("I am on the landing page")
    public void VerifyLandingPage()
    {
        Assert.assertTrue(registrationPage.verifyonLandingPage());
    }

    @When("I click on the registration button")
    public void navigateToRegistrationPage()
    {
        registrationPage.navigateToRegistrationPage();

    }

    @When("User fills the registration form with valid details {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} ")
    public void registrationInputs(String gender, String firstname,String lastname, String DoBDay, String DoBMonth, String DoBYear, String email, String companyname, String newsletter, String password, String ConfirmPassword)
    {
        registrationPage.selectGender(gender);
        registrationPage.enterFirstName(firstname);
        registrationPage.enterLastName(lastname);
        registrationPage.selectDay(DoBDay);
        registrationPage.selectMonth(DoBMonth);
        registrationPage.selectYear(DoBYear);
        registrationPage.enterEmail(email);
        registrationPage.enterCompany(companyname);
        registrationPage.clickNewsletter(newsletter);
        registrationPage.enterPassword(password);
        registrationPage.enterConfirmPassword(ConfirmPassword);
    }
    @When("I click on the registration button and continue button")
    public void clickRegister() throws InterruptedException
    {
        registrationPage.clickRegisterButton();
        Thread.sleep(5000);
        registrationPage.clickContinueButton();

    }
    @Then("I should be on the home page")
    public void VerifyHomePage()
    {
        Assert.assertTrue(registrationPage.verifyonHomePage());

    }

}
