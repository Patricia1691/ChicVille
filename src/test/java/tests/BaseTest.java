package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SearchBarPage.SearchBarPage;
import pages.SearchMenuPage.SearchMenuPage;
import pages.SignInCorrectPage.SignInCorrectPage;
import pages.SignInPage.SignInPage;

public class BaseTest {
    public SignInPage signInPage = SignInPage.getInstance();
    public SignInCorrectPage signInCorrectPage = SignInCorrectPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public SearchMenuPage searchMenuPage = SearchMenuPage.getInstance();
    public SearchBarPage searchBarPage = SearchBarPage.getInstance();



    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();

    }

}
