package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver5;

    public LoginPage(WebDriver driver4) {
        driver5 = driver4;
        PageFactory.initElements(driver5, this); //constructor method for login page
    }

    @FindBy(linkText = "Log in")
    private WebElement LoginLink;


    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(id = "RememberMe")
    private WebElement RememberMe;

    @FindBy(className = "button-1.login-button")
    private WebElement LoginButton;

    public boolean verifyonLandingPage() {
        return LoginLink.isDisplayed();
    }

    public void navigateToLoginPage() {
        LoginLink.click();
    }

    public void enterEmail(String email) {
        this.email.sendKeys((email));
    }

    public void enterPassword(String password) {
        this.password.sendKeys((password));
    }

    public void clickRememberMe() {
        this.RememberMe.click();
    }

    public void clickLoginButton() {
        this.LoginButton.click();
    }

    public void clickLoginlink() {LoginLink.click();
    }
}


