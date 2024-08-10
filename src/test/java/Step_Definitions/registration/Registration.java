package Step_Definitions.registration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObject.RegistrationPage;


public class Registration {

    private WebDriver driver2 = Hooks.driver1;
    private RegistrationPage registrationPage=new RegistrationPage(driver2);

    @Given("I am on the registration page.")
    public void VerifyLandingPage() {
        Assert.assertTrue(registrationPage.verifyonLandingPage());
    }

    @When("I click on the registration button.")
    public void navigateToRegistrationPage() {
        registrationPage.navigateToRegistrationPage();

    }

    @And("I fills the registration form with valid details.\"Male\"Anish\"Mehata\"{int}\"{int}\"{int}\"anish.M@abcd.com\"AB Limited\"Newsletter\"Abc123\"Abc123\"Click\"")
    public void registrationInputs(String gender, String FirstName, String LastName, String DoBDay, String DoBMonth, String DoBYear, String email, String Companyname, String Newsletter, String yourPassword, String confirmpassword ) {
    registrationPage.selectGender(gender);
    registrationPage.enterFirstName(FirstName);
    registrationPage.enterLastName(LastName);
    registrationPage.selectDay(DoBDay);
    registrationPage.selectMonth(DoBMonth);
    registrationPage.selectYear(DoBYear);
    registrationPage.enterEmail(email);
    registrationPage.enterCompany(Companyname);
    registrationPage.clickNewsletter(Newsletter);
    registrationPage.enterPassword(yourPassword);
    registrationPage.enterConfirmPassword(confirmpassword);
    }
    @When("I click on the registration button and continue button.")
    public void clickRegister() throws InterruptedException {
        registrationPage.clickRegisterButton();
        Thread.sleep(3000);
        registrationPage.clickContinueButton();

    }
    @Then("I should be on the home page.")
    public void VerifyHomePage() {
        Assert.assertTrue(registrationPage.verifyonHomePage());

    }

}
