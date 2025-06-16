package tests.heroCard;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.CustomerSite.CustomerSpecificPage.HeroCard;
import pages.CustomerSite.LogInPage;
import utils.DriverUtils;

public class BaseTest {
    public LogInPage login;
    public HeroCard hero;

    @BeforeSuite
    public void initDriver(){

       // DriverUtils.setupWindowsWebDriverPath();
        DriverUtils.setupMacWebDriverPath();
        DriverUtils.chromeDriverOpen();

    }

    @BeforeTest
    public void createObjects(){
        login = new LogInPage();
        hero = new HeroCard();
    }

    @AfterSuite
    public void browserQuit(){

      //  DriverUtils.browserQuit();

    }
}
