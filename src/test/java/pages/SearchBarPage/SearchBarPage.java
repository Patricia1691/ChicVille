package pages.SearchBarPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SearchBarPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(pages.SearchMenuPage.SearchMenuPage.class);
    public static SearchBarPage instance;

    private SearchBarPage() {
    }

    public static SearchBarPage getInstance() {
        if (instance == null) {
            instance = new SearchBarPage();
        }
        return instance;
    }

    private By inputProductField = By.xpath("//div[@class='f-fix']/input[@id='search']");
    private By searchBarButton = By.xpath("//button[@class='button btn-search']");
    private By acceptCookies = By.xpath("//div[@class='ccb__button']/button[@class='consent-give']");
    private By canaDaily = By.id("image-to-switch-45059");
    private By addToCart = By.xpath("//div[@class='add-to-cart']/button[@title='Cumpara']");
    private By addQuantity = By.xpath("//input[@class='input-text qty']");
    private By removeButton = By.xpath("//a[@title='Remove item']");
    private By emptyCartMessage = By.id("ajaxpro-notice-form");
    private By homeButton = By.xpath("//li[@class='home']");


    public void insertProductField(String productField) {
        LOG.info("Insert product field");
        driver.findElement(inputProductField).click();
        driver.findElement(inputProductField).clear();
        driver.findElement(inputProductField).sendKeys(productField);

    }

    public void clickSearchBarButton() {
        LOG.info("Click search bar button");
        driver.findElement(searchBarButton).click();

    }

    public void clickAcceptCookies() {
        LOG.info("Click Accept cookies");
        driver.findElement(acceptCookies).click();
    }

    public void clickCanaDaily() {
        LOG.info("Click 'Cana Daily' button");
        driver.findElement(canaDaily).click();
    }

    public void clickAddToCart() {
        LOG.info("Click 'Add to cart' button");
        driver.findElement(addToCart).click();
        sleep(3000);
    }

    public void typeInAddQuantityField(String quantity) {
        LOG.info("Typing value in 'Quantity' field");
        driver.findElement(addQuantity).clear();
        driver.findElement(addQuantity).sendKeys(quantity);
        sleep(3000);

    }

    public void clickRemoveButton() {
        LOG.info("Click 'remove' button");
        driver.findElement(removeButton).click();
        driver.switchTo().alert().accept();
        sleep(3000);
    }


    public boolean isEmptyCartMessageDisplayed() {
        LOG.info("Verify if the empty cart message is displayed");
        return driver.findElement(emptyCartMessage).isDisplayed();

    }


    public void clickHomeButton() {
        LOG.info("Click home button");
        driver.findElement(homeButton).click();
        sleep(3000);
    }

}
