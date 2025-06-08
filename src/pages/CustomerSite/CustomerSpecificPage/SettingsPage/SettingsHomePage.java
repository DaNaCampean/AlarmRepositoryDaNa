package pages.CustomerSite.CustomerSpecificPage.SettingsPage;

import base.BasePage;
import utils.WaitUtils;
import org.openqa.selenium.By;
import static utils.DriverUtils.driver;
public class SettingsHomePage extends BasePage {

    //Locators section

    By loginInfoXPath = By.xpath("//h2[text() = 'Login Information']");
    By pageHeaderSettingXPath = By.xpath("//h1[text() = 'Settings']");




    //Methods section


    public void selectLoginInfo(){
        System.out.println("before -select login info page");
        WaitUtils.implicitlyWaitFiveSeconds();
        WaitUtils.waitForElementVisible(driver,loginInfoXPath,30);
        System.out.println("before click site info");
        driver.findElement(loginInfoXPath).click();
        System.out.println("after click site info");
    }
    public By pageHeaderName(){

        return pageHeaderSettingXPath;
    }




}
