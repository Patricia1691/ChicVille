package tests.SearchMenuTest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.testng.Assert;
import pages.SearchMenuPage.SearchMenuPage;
import tests.BaseTest;
import org.testng.annotations.Test;

import static pages.BasePage.*;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SearchMenuTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchMenuTest.class);
    private String noutati = getBaseUrl() + "oportunitati/noutati.";


    String material = "bumbac";
    String quantity = "3";


    @Test
    public void fillSearchMenu() {
        driver.get(noutati);

        sleep(3000L);

        LOG.info("Click 'Accept cookies' button");
        registerPage.clickAcceptCookies();

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






    }




}
