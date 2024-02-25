package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage.SignInPage;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {
        String email= "abc@email.com";
        String password = "parola1";

        LOG.info("Check 'button'");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Sign in' button");
        signInPage.clickSignInButton();

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDysplayed(), "Logo is not displayed");

        LOG.info("Insert Email");
        signInPage.insertEmail(email);

        LOG.info("Insert Password");
        signInPage.insertPassword(password);

        LOG.info("Click 'Enter' button");
        signInPage.clickEnterButton();

        LOG.info("Verify if error message is displayed");
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed");

        LOG.info("Navigate back");
        signInPage.clickBack();

        LOG.info("Click 'Skip sign in button'");
        signInPage.clickSignInButton();



    }

}


