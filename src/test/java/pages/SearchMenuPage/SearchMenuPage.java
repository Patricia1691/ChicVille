package pages.SearchMenuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    private By noutatiCategory = By.xpath("//div[@class='nav-dropdown level0 shown-sub']/div[@class='nav-dropdown-inner level0']");
    private By filtreaza = By.xpath("//label[text()='Filtreaza']");
    private By selectMaterial = By.xpath("//dd[@class='odd']/select[@id='layered-select']");
    private By clickCart = By.xpath("//button[@class='button btn-cart']");
    private By addQuantity = By.xpath("//input[@class='input-text qty']");
    private By actualizeazaButton = By.xpath("//button[@class='button btn-update-pop']");
    private By backShoppingButton = By.xpath("//button[@class='button btn-continue']");
    private By removeFilter = By.xpath("//a[text()='Sterge Toate']");
    private By cadouriTab = By.xpath("//span[text()='cadouri']");
    private By cadouriCopii = By.xpath("//a[text()='Cadouri copii']");
    private By papusaAnnie = By.xpath("//a[text()='Papusa Annie, bumbac, verde, 35 cm - modele diverse ']");
    private By cumparaButton = By.xpath("//button[@id='product-addtocart-button']");
    private By successMessage = By.xpath("//li[@class='success-msg']");
    private By orderButton = By.xpath("//td//button[@title='Spre finalizarea comenzii']");
    private By inputPf = By.xpath("//input[@id='input_pf']");
    private By inputLastName = By.xpath("//input[@id='billing:lastname']");
    private By inputFirstName = By.xpath("//input[@id='billing:firstname']");
    private By inputEmail = By.xpath("//input[@id='billing:email']");
    private By inputAddress = By.xpath("//input[@id='billing:street1']");
    private By selectRegion = By.xpath("//select[@id='billing:region_id']");
    private By selectCity = By.xpath("//select[@id='billing:city_select']");
    private By inputPostalCode = By.xpath("//input[@id='billing:postcode']");
    private By inputPhone = By.xpath("//input[@id='billing:telephone']");
    private By inputDelivery = By.xpath("//input[@id='s_method_cargus_cargusm']");
    private By inputRamburs = By.xpath("//input[@id='p_method_cashondelivery']");
    private By acceptConsent = By.xpath("//input[@id='agreement-1']");


    public void clickAcceptCookies() {
        LOG.info("Click Accept cookies");
        driver.findElement(acceptCookies).click();
    }

    public void clickNoutatiMenu() {
        LOG.info("Click 'Noutati' button");
        driver.findElement(noutatiMenu).click();
        sleep(3000);
    }

    public void clickNoutatiCategory() {
        LOG.info("Click 'Noutati' button");
        driver.findElement(noutatiCategory).click();
        sleep(3000);
    }

    public void clickFiltreaza() {
        LOG.info("Click 'Filtreaza' button");
        driver.findElement(filtreaza).click();
    }

    public void selectMaterial(String material) {
        LOG.info("Selecting  country");
        driver.findElement(selectMaterial).click();
        driver.findElement(selectMaterial).sendKeys(material);
        driver.findElement(selectMaterial).sendKeys(Keys.ENTER);
    }

    public void clickCart() {
        LOG.info("Click 'Cart' button");
        driver.findElement(clickCart).click();
        sleep(3000);
    }


    public void typeInAddQuantityField(String quantity) {
        LOG.info("Typing value in 'Quantity' field");
        driver.findElement(addQuantity).clear();
        driver.findElement(addQuantity).sendKeys(quantity);

    }

    public void clickActualizeazaButton() {
        LOG.info("Click Actualizeaza button");
        driver.findElement(actualizeazaButton).click();
        sleep(3000);
    }

    public void clickBackShoppingButton() {
        LOG.info("Click 'back shopping' button");
        driver.findElement(backShoppingButton).click();
        sleep(3000);

    }

    public void clickRemoveFilter() {
        LOG.info("Click 'remove filter' button");
        driver.findElement(removeFilter).click();

    }

    public void clickCadouriTab() {
        LOG.info("Click 'Cadouri' button");
        driver.findElement(cadouriTab).click();
        sleep(3000);

    }

    public void clickCadouriCopii() {
        LOG.info("Click 'Cadouri copii' button");
        driver.findElement(cadouriCopii).click();
        sleep(3000);

    }

    public void clickPapusaAnnie() {
        LOG.info("Click 'Papusa Annie' button");
        driver.findElement(papusaAnnie).click();
        sleep(3000L);

    }

    public void clickCumparaButton() {
        LOG.info("Click 'cumpara' button");
        driver.findElement(cumparaButton).click();
        sleep(3000L);

    }

    public boolean isSuccessMessageDisplayed() {
        LOG.info("Verify if success message is displayed");
        return driver.findElement(successMessage).isDisplayed();

    }

    public void clickOrderButton() {
        LOG.info("Click 'order' button");
        driver.findElement(orderButton).click();

    }

    public void clickInputPfButton() {
        LOG.info("Click 'persoana fizica' button");
        driver.findElement(inputPf).click();

    }

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void insertEmail(String email) {
        LOG.info("Insert email");
        driver.findElement(inputEmail).sendKeys(email);

    }

    public void insertAddress(String address) {
        LOG.info("Insert address");
        driver.findElement(inputAddress).sendKeys(address);

    }

    public void insertPostalCode(String postalCode) {
        LOG.info("Insert postal code");
        driver.findElement(inputPostalCode).sendKeys(postalCode);

    }

    public void insertPhone(String phone) {
        LOG.info("Insert postal code");
        driver.findElement(inputPhone).sendKeys(phone);

    }

    public void selectRegion(String region) {
        LOG.info("Selecting  region");
        driver.findElement(selectRegion).click();
        driver.findElement(selectRegion).sendKeys(Keys.ENTER);
    }

    public void selectCity(String city) {
        LOG.info("Selecting  city");
        driver.findElement(selectCity).click();
        driver.findElement(selectCity).sendKeys(Keys.ENTER);
    }


    public void clickInputDelivery() {
        LOG.info("Click delivery method button");
        driver.findElement(inputDelivery).click();
    }

    public void clickInputRamburs() {
        LOG.info("Click ramburs payment method button");
        driver.findElement(inputRamburs).click();

    }

    public void clickAcceptConsent() {
        LOG.info("Click 'accept consent' button");
        driver.findElement(acceptConsent).click();

    }

}





