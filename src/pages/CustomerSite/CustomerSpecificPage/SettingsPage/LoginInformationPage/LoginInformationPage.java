package pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage;

import base.BasePage;
import utils.WaitUtils;
import org.openqa.selenium.By;
import static utils.DriverUtils.driver;

public class LoginInformationPage  extends BasePage {
    //Locators section

   By siteAppearanceXPath = By.xpath("//p[text() = 'Site Appearance']");
   By pageHeaderLoginInfoXPath = By.xpath("//h1[text() = 'Login Information']");


    //Methods section

    public void selectSiteAppearance(){
        WaitUtils.waitForElementVisible(driver,siteAppearanceXPath,30);
        driver.findElement(siteAppearanceXPath).click();

    }
    public String optionsText(String expression){
        WaitUtils.waitForElementVisible(driver,siteAppearanceXPath,30);
        switch(expression) {
            case "siteAppearanceXPath":
                return  driver.findElement(siteAppearanceXPath).getText();
                // code block

            default:
                return "zzzz";
        }


    }

    public By pageHeaderName(){

       return pageHeaderLoginInfoXPath;
       // return search;
    }



}
