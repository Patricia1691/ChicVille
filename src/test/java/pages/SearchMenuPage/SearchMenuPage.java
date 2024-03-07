package pages.SearchMenuPage;

import org.openqa.selenium.By;
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
    private By noutatiCategory = By.xpath("//div[@class='nav-dropdown level0 shown-sub']//a[.='Noutati']");
    private By filtreaza = By.xpath("//label[text()='Filtreaza']");
    private By selecteaza = By.xpath("//dd[@class='odd']/select[@id='layered-select']");

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

    public void clickSelecteaza(){
        LOG.info("Click 'Selecteaza' button");
        driver.findElement(selecteaza).click();
    }

}



