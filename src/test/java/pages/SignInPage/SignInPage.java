package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By signInButton = By.id("Autentificare");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("send2");
    private By errorMessage = By.id("error-msg");
    private By signUpEmailField = By.id("email_address");
    private By enterSignUpButton = By.id("submit");

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' Button");
        driver.findElement(signInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();

    }

    public boolean isLogoDysplayed() {
        LOG.info("Verify if Logo image is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void insertEmail(String Email) {
        LOG.info("input 'Email address' in field");
        driver.findElement(emailField).sendKeys(Email);
    }

    public void insertPassword(String Password) {
        LOG.info("input'Password' in field");
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verify if error message is displayed");
        return driver.findElement(errorMessage).isDisplayed();

    }

    public void clickBack() {
        LOG.info("Click back in browser");
        driver.navigate().back();
    }


    public void email(String email) {
        LOG.info(" insert email address");
        driver.findElement(signUpEmailField).sendKeys(email);
    }


    public void clickRegisterButton() {
        LOG.info("click register button");
        driver.findElement(enterSignUpButton);
    }

}









