package pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage;

import base.BasePage;
import org.openqa.selenium.By;


public class LoginInformationPage  extends BasePage {
    //Locators section
   By siteAppearanceXPath = By.xpath("//p[text() = 'Site Appearance']");
   By pageHeaderLoginInfoXPath = By.xpath("//h1[text() = 'Login Information']");

    //Methods section

    public void selectSiteAppearance(){
       selectItem(siteAppearanceXPath);
    }

    public String pageOptionsName(){
        return getText(siteAppearanceXPath);
    }

    public String pageHeaderName(){
        return getText(pageHeaderLoginInfoXPath);
    }

}
