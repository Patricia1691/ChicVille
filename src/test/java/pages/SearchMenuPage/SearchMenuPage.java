package pages.SearchMenuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchMenuPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchMenuPage.class);
    public static SearchMenuPage instance;

    private SearchMenuPage() {
    }

    public static SearchMenuPage getInstance() {
        if (instance == null) {
            instance = new SearchMenuPage();
        }
        return instance;

    }

    private By acceptCookies = By.xpath("//div[@class='ccb__button']/button[@class='consent-give']");
    private By noutatiMenu = By.xpath("//span[text()='noutati']");
    private By noutatiCategory = By.xpath("//a[text()='Noutati']");
    private By filtreaza = By.xpath("//label[text()='Filtreaza']");
    private By selectMaterial = By.xpath("//dd[@class='odd']/select[@id='layered-select']");
    private By clickCart = By.xpath("//button[@class='button btn-cart']");
    private By addQuantity = By.xpath("//input[@class='input-text qty']");
    private By actualizeazaButton = By.xpath("//button[@class='button btn-update-pop']");
    private By backShoppingButton = By.xpath("//button[@class='button btn-continue']");
    private By removeFilter = By.xpath("//a[@class='btn-remove']/parent::li");




    public void clickAcceptCookies(){
        LOG.info("Click Accept cookies");
        driver.findElement(acceptCookies).click();
    }

    public void clickNoutatiMenu(){
        LOG.info("Click 'Noutati' button");
        driver.findElement(noutatiMenu).click();
    }

    public void clickNoutatiCategory(){
        LOG.info("Click 'Noutati' button");
        driver.findElement(noutatiCategory).click();
    }

    public void clickFiltreaza(){
        LOG.info("Click 'Filtreaza' button");
        driver.findElement(filtreaza).click();
    }

    public void selectMaterial(String material) {
        LOG.info("Selecting  country");
        driver.findElement(selectMaterial).click();
        driver.findElement(selectMaterial).sendKeys(material);
        driver.findElement(selectMaterial).sendKeys(Keys.ENTER);
    }

    public void clickCart(){
        LOG.info("Click 'Cart' button");
        driver.findElement(clickCart).click();
        sleep(3000);
    }



    public void typeInAddQuantityField(String quantity) {
        LOG.info("Typing value in 'Quantity' field");
        driver.findElement(addQuantity).clear();
        driver.findElement(addQuantity).sendKeys(quantity);

    }

    public void clickActualizeazaButton(){
        LOG.info("Click Actualizeaza button");
        driver.findElement(actualizeazaButton).click();
        sleep(3000);
    }

    public void clickBackShoppingButton(){
        LOG.info("Click 'back shopping' button");
        driver.findElement(backShoppingButton).click();

    }

    public void clickRemoveFilter(){
        LOG.info("Click 'remove filter' button");
        driver.findElement(removeFilter).click();

    }




}





