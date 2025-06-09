package pages.CustomerSite.CustomerSpecificPage.SettingsPage;

import base.BasePage;
import org.openqa.selenium.By;
public class SettingsHomePage extends BasePage {

    //Locators section
    By loginInfoXPath = By.xpath("//h2[text() = 'Login Information']");
    By pageHeaderSettingXPath = By.xpath("//h1[text() = 'Settings']");

    //Methods section

    public void selectLoginInfo(){
        selectItem(loginInfoXPath);

    }

    public String pageHeaderName(){
        return getText(pageHeaderSettingXPath);
    }




}
