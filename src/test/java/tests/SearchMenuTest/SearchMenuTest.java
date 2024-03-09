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
    private String giftCards = getBaseUrl() + "gift-card/gift-card-chicville";
    private String mese = getBaseUrl() + "mobila/mese";
    String material = "bumbac";

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
        searchMenuPage.selectMaterial("bumbac");
        sleep(3000L);



    }
}
