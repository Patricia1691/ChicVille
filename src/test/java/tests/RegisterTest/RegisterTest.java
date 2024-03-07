package tests.RegisterTest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.testng.Assert;
import tests.BaseTest;
import org.testng.annotations.Test;

import static pages.BasePage.*;


public class RegisterTest extends BaseTest {
    public  static final  Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "customer/account/create/";

    @Test
    public void fillRegister(){
        driver.get(newUrl);

        sleep(3000L);


        String firstName = "Ion";
        String lastName = "Popescu";
        String email = "automation@domnain.com";
        String password = "secretPassword";




        LOG.info("Typing full name");
        registerPage.acceptConsent();

        registerPage.insertFullName(firstName, lastName);
        sleep(3000L);

        LOG.info("Type in email");
        registerPage.insertEmail(email);

        LOG.info("Set password");
        registerPage.setPassword(password);

        sleep(3000L);

        LOG.info("Click 'Accept cookies' button");
        registerPage.clickAcceptCookies();

        LOG.info("Click 'Send' button");
        registerPage.clickSendButton();

        LOG.info("Click Send and check message");
        registerPage.clickSendButton();
        Assert.assertTrue(registerPage.isMandatoryFieldDisplayed(), "Mandatory Field is not displayed");
        sleep(3000L);



    }


}
