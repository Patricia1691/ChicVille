package tests.RegisterTest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import tests.BaseTest;
import org.testng.annotations.Test;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public  static final  Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "customer/account/create/";

    @Test
    public void fillRegister(){
        driver.get(newUrl);

        registerPage.pressConsent();
        String firstName = "Ion";
        String lastName = "Popescu";
        String email = "automation@domnain.com";


        LOG.info("Typing full name");
        LOG.info("Type in address");


        LOG.info("Type in email");
        registerPage.insertEmail(email);






    }
}
