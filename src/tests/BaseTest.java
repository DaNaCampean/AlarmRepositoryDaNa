package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.CustomerSite.LogInPage;
import pages.CustomerSite.CustomerSpecificPage.CustomerHomePage;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.SettingsHomePage;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.LoginInformationPage;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.SiteAppearancePage;

import utils.DriverUtils;


public class BaseTest {
    public LogInPage login;
    public SettingsHomePage settings;
    public CustomerHomePage customer;
    public LoginInformationPage loginInformation;
    public SiteAppearancePage siteAppearance;

    @BeforeSuite
    public void initDriver(){

        DriverUtils.setupWindowsWebDriverPath();
        //DriverUtils.setupMacWebDriverPath();
        DriverUtils.chromeDriverOpen();

    }

    @BeforeTest
    public void createObjects(){
        login = new LogInPage();
        settings = new SettingsHomePage();
        customer = new CustomerHomePage();
        loginInformation = new LoginInformationPage();
        siteAppearance = new SiteAppearancePage();
    }

    @AfterSuite
    public void browserQuit(){

     DriverUtils.browserQuit();

    }
}




