package tests;

import base.BasePageDriver;
import pages.CustomerSite.CustomerSpecificPage.CustomerHomePage;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.LoginInformationPage;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.SiteAppearancePage;
import pages.CustomerSite.HomePage;
import pages.CustomerSite.LogInPage;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.SettingsHomePage;
import org.testng.annotations.*;

public class BaseTest {
    public HomePage home;
    public LogInPage login;
    public SettingsHomePage settings;
    public CustomerHomePage customer;
    public LoginInformationPage loginInformation;
    public SiteAppearancePage siteAppearance;

    @BeforeSuite
    public void initDriver(){

        //BasePageDriver.driverSetUpWindows();
        BasePageDriver.driverSetUpMac();

    }

    @BeforeTest
    public void createObjects(){
        home = new HomePage();
        login = new LogInPage();
        settings = new SettingsHomePage();
        customer = new CustomerHomePage();
        loginInformation = new LoginInformationPage();
        siteAppearance = new SiteAppearancePage();

    }

    @AfterSuite
    public void browserQuit(){

      // BasePageDriver.browserQuit();

    }


}




