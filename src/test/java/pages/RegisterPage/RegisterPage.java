package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;

    }

    private By inputFirstName = By.id("firstname");
    private By inputLastName = By.id("lastname");
    private By acceptConsent = By.xpath("//div[@id='gdpr-terms']/input[@type='checkbox']");
    private By inputEmail = By.id("email_address");
    private By password = By.id("password");
    private By confirmPassword = By.id("confirmation");
    private By acceptCookies = By.xpath("//div[@class='ccb__button']/button[@class='consent-give']");
    private By sendButton = By.xpath("//button[@type='submit']");
    private By mandatoryField = By.id("advice-required-entry-captcha_user_create");


    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void acceptConsent() {
        LOG.info("Click the consent button");
        driver.findElement(acceptConsent).click();
    }


    public void insertEmail(String email) {
        LOG.info("Insert email");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setPassword(String pass) {

        LOG.info("Setting password and confirm password");
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
    }

    public void clickAcceptCookies() {
        LOG.info("Click Accept cookies");
        driver.findElement(acceptCookies).click();
    }

    public void clickSendButton() {
        LOG.info("Click Send button");
        driver.findElement(sendButton).click();
    }

    public boolean isMandatoryFieldDisplayed() {
        LOG.info("Verify if error message is displayed");
        return driver.findElement(mandatoryField).isDisplayed();

    }

}
