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

    private By inputFirstName = By.xpath("//input[@id='firstname']");
    private By inputLastName = By.xpath("//input[@id='lastname']");
    private By consent = By.xpath("//div[@id='gdpr-terms']");
    private By inputEmail = By.xpath("//input[@id='email_address']");


    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void pressConsent() {
        LOG.info("Press Consent");
        driver.findElement(consent).click();
    }


    public void insertEmail(String email) {
        LOG.info("Insert email");
        driver.findElement(inputEmail).sendKeys(email);
    }



}
