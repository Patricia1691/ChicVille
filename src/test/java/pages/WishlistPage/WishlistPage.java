package pages.WishlistPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.SearchMenuPage.SearchMenuPage;

public class WishlistPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(WishlistPage.class);
    public static WishlistPage instance;

    private WishlistPage() {
    }

    public static WishlistPage getInstance() {
        if (instance == null) {
            instance = new WishlistPage();
        }
        return instance;
    }

    private By signInButton = By.xpath("//a[text()='Autentificare']");
    private By emailField = By.xpath("//input[@type='email']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By enterButton = By.id("send2");

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' Button");
        driver.findElement(signInButton).click();
    }


    public void insertEmailField(String Email) {
        LOG.info("input 'Email address' in field");
        driver.findElement(emailField).sendKeys(Email);
    }

    public void insertPasswordField(String Password) {
        LOG.info("input 'Password' in field");
        driver.findElement(passwordField).sendKeys(Password);
        sleep(3000l);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }
}
