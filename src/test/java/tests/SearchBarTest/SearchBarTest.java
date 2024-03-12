package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchBarPage.SearchBarPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.sleep;


public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);

    String productField = "cana";
    String quantity = "2";


    @Test
    public void fillSearchBar() {

        LOG.info("Type in productField");
        searchBarPage.insertProductField(productField);
        sleep(3000L);

        LOG.info("Click search bar button");
        searchBarPage.clickSearchBarButton();
        sleep(3000L);

        LOG.info("Click 'Accept cookies' button");
        registerPage.clickAcceptCookies();

        LOG.info("Click Cana Daily button");
        searchBarPage.clickCanaDaily();
        sleep(3000L);

        LOG.info("Click 'Add to cart' button");
        searchBarPage.clickAddToCart();
        sleep(3000L);

        LOG.info("Add the quantity in the field");
        searchBarPage.typeInAddQuantityField(quantity);


//        LOG.info("Click 'remove' button");
//        searchBarPage.clickRemoveButton();
//        sleep(3000L);

        LOG.info("Click Send and check message");
        Assert.assertTrue(searchBarPage.isSuccessfullyAddedFieldDisplayed(), "Successfully Added Field is not displayed");
        sleep(3000L);

        LOG.info("Click back button");
        searchBarPage.clickBackButton();

        LOG.info("Click home button");
        searchBarPage.clickHomeButton();
        sleep(3000L);





    }
}

