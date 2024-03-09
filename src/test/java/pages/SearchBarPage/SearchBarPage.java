package pages.SearchBarPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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
    private By searchBarButton = By.xpath("//button[@class='button search-close']");
    private By canaIepure = By.xpath("//div[@class='prolabel-wrapper']/a[@id='image-to-switch-20476']");



    public void insertProductField(String productField) {
        LOG.info("Insert product field");
        driver.findElement(inputProductField).sendKeys(productField);
    }

    public void clickSearchBarButton(){
        LOG.info("Click search bar button");
        driver.findElement(searchBarButton).click();

    }

    public void clickCanaIepure(){
        LOG.info("Click cana iepure button");
        driver.findElement(canaIepure).click();
    }







}
