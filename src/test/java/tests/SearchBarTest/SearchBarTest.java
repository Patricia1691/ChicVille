package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SearchBarPage.SearchBarPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.sleep;


public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);

    String productField = "cana";


    @Test
    public void fillSearchBar() {

        LOG.info("Type in productField");
        searchBarPage.insertProductField(productField);
        sleep(3000L);

        LOG.info("Click search bar button");
        searchBarPage.clickSearchBarButton();
        sleep(3000L);

        LOG.info("Click cana iepure button");
        searchBarPage.clickCanaIepure();
        sleep(3000L);





    }
}

