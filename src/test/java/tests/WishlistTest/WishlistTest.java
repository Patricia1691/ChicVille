package tests.WishlistTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WishlistPage.WishlistPage;
import tests.BaseTest;

import static pages.BasePage.*;

public class WishlistTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(WishlistTest.class);
    private String wishlist = getBaseUrl() + "wishlist";


    String email = "patrymaria16@gmail.com";
    String password = "Blabla5";


    @Test
    public void fillWishlistTest() {
        driver.get(wishlist);

        sleep(3000L);


        LOG.info("Click 'Sign in' button");
        wishlistPage.clickSignInButton();

        LOG.info("Complete the fields");
        wishlistPage.insertEmailField(email);
        wishlistPage.insertPasswordField(password);
    }
}
