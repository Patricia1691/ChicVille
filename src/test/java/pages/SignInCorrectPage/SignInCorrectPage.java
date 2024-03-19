package pages.SignInCorrectPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInCorrectPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.SignInCorrectPage.SignInCorrectPage.class);
    public static pages.SignInCorrectPage.SignInCorrectPage instance;

    private SignInCorrectPage() {

    }

    public static pages.SignInCorrectPage.SignInCorrectPage getInstance() {
        if (instance == null) {
            instance = new pages.SignInCorrectPage.SignInCorrectPage();
        }
        return instance;
    }

    private By signInButton = By.xpath("//a[text()='Autentificare']");
    private By emailField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("send2");
    private By myAccount = By.xpath("//div[@class='welcome']");


    public void clickSignInButton() {
        LOG.info("Click 'Sign in' Button");
        driver.findElement(signInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();

    }

    public void insertEmailField(String Email) {
        LOG.info("input 'Email address' in field");
        driver.findElement(emailField).sendKeys(Email);
    }

    public void insertPasswordField(String Password) {
        LOG.info("input 'Password' in field");
        driver.findElement(passwordField).sendKeys(Password);
        sleep(3000);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isMyAccountDisplayed() {
        LOG.info("Verify if 'My account' is displayed");
        return driver.findElement(myAccount).isDisplayed();

    }

}

