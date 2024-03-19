package tests.SearchMenuTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class SearchMenuTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchMenuTest.class);
    private String noutati = getBaseUrl() + "oportunitati/noutati.";


    String material = "bumbac";
    String quantity = "3";
    String firstName = "Patricia";
    String lastName = "Blidarean";
    String email = "patrymaria16@gmail.com";
    String address = "str Donath 13";
    String region = "Cluj";
    String city = "CLUJ-NAPOCA";
    String postalCode = "40090";
    String phone = "0752577172";


    @Test
    public void fillSearchMenu() {
        driver.get(noutati);

        sleep(3000L);

        LOG.info("Click 'Accept cookies' button");
        searchMenuPage.clickAcceptCookies();

        LOG.info("Click 'Noutati' button");
        searchMenuPage.clickNoutatiMenu();
        sleep(3000L);

        LOG.info("Click 'Noutati' button");
        searchMenuPage.clickNoutatiCategory();
        sleep(3000L);

        LOG.info("Click 'Filtreaza' button");
        searchMenuPage.clickFiltreaza();
        sleep(3000L);

        LOG.info("Click 'Select material' button");
        searchMenuPage.selectMaterial(material);
        sleep(3000L);

        LOG.info("Click 'Cart' button");
        searchMenuPage.clickCart();
        sleep(3000L);

        LOG.info("Add the quantity in the field");
        searchMenuPage.typeInAddQuantityField(quantity);

        LOG.info("Click Actualizeaza button");
        searchMenuPage.clickActualizeazaButton();
        sleep(3000L);

        LOG.info("Click 'back shopping' button");
        searchMenuPage.clickBackShoppingButton();
        sleep(3000L);


        LOG.info("Click 'remove filter' button");
        searchMenuPage.clickRemoveFilter();
        sleep(3000L);

        LOG.info("Click 'Cadouri' button");
        searchMenuPage.clickCadouriTab();
        sleep(3000L);

        LOG.info("Click 'Cadouri copii' button");
        searchMenuPage.clickCadouriCopii();
        sleep(3000L);

        LOG.info("Click 'papusa Annie' button");
        searchMenuPage.clickPapusaAnnie();
        sleep(3000L);


        LOG.info("Click 'cumpara' button");
        searchMenuPage.clickCumparaButton();
        sleep(3000L);

        LOG.info("Check message");
        Assert.assertTrue(searchMenuPage.isSuccessMessageDisplayed(), "Success message is not displayed");
        sleep(3000L);

        LOG.info("Click 'order' button");
        searchMenuPage.clickOrderButton();
        sleep(3000L);

        LOG.info("Click 'persoana fizica' button");
        searchMenuPage.clickInputPfButton();
        sleep(3000L);

        LOG.info("Typing full name");
        searchMenuPage.insertFullName(firstName, lastName);
        sleep(3000L);

        LOG.info("Typing  email");
        searchMenuPage.insertEmail(email);
        sleep(3000L);

        LOG.info("Typing  address");
        searchMenuPage.insertAddress(address);

        LOG.info("Typing  postal code");
        searchMenuPage.insertPostalCode(postalCode);

        LOG.info("Typing  phone number");
        searchMenuPage.insertPhone(phone);

        LOG.info("Select region");
        searchMenuPage.selectRegion(region);

        LOG.info("Select city");
        searchMenuPage.selectCity(city);

        LOG.info("Click delivery method button");
        searchMenuPage.clickInputDelivery();
        sleep(1500L);

        LOG.info("Click ramburs payment method button");
        searchMenuPage.clickInputRamburs();
        sleep(1500L);

        LOG.info("Click 'accept consent' button");
        searchMenuPage.clickAcceptConsent();
        sleep(1500L);

    }

}
