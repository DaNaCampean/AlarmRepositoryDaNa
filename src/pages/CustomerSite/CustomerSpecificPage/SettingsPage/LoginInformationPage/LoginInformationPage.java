package pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage;

import base.BasePageDriver;
import utils.Utils;
import org.openqa.selenium.By;

public class LoginInformationPage  extends BasePageDriver {
    //Locators section

   By siteApperanceXPath = By.xpath("//p[text() = 'Site Appearance']");
   By pageHeaderLoginInfoXPath = By.xpath("//h1[text() = 'Login Information']");


    //Methods section

    public void selectSiteAppearance(){
        Utils.waitForElementVisible(driver,siteApperanceXPath,30);
        driver.findElement(siteApperanceXPath).click();

    }
    public String optionsText(String expression){
        Utils.waitForElementVisible(driver,siteApperanceXPath,30);
        switch(expression) {
            case "siteApperanceXPath":
                return  driver.findElement(siteApperanceXPath).getText();
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
