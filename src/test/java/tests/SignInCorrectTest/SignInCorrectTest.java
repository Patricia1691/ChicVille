package tests.SignInCorrectTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.*;

public class SignInCorrectTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(tests.SignInCorrectTest.SignInCorrectTest.class);

    @Test
    public void signInCorrect() {
        String email = "patrymaria16@gmail.com";
        String password = "Blabla5";


        LOG.info("Check 'button'");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Sign in' button");
        signInCorrectPage.clickSignInButton();

        LOG.info("Complete the fields");
        signInCorrectPage.insertEmailField(email);
        signInCorrectPage.insertPasswordField(password);

        LOG.info("Click Enter and check message");
        signInCorrectPage.clickEnterButton();
        Assert.assertTrue(signInCorrectPage.isMyAccountDisplayed(), "My account is not displayed");
        sleep(3000);





    }

}


