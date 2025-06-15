package pages.CustomerSite.CustomerSpecificPage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import static utils.DriverUtils.driver;

public class CustomerHomePage extends BasePage {
    //Locators section
    By customerNameXPath = By.xpath("//span[text() = 'PM360R_243D17']"); //reading the name of the customer, from left menu
    By automationXPath = By.xpath("//p[text() = 'Automation']"); // Automation from menu
    By settingsXPath = By.xpath("//p[@class='ellipsize ' and text() = 'Settings']"); // settings from menu
    By homeXPath = By.xpath("//p[text() = 'Home']"); //Home from menu
    By refreshXPath = By.xpath("//button[@aria-label = 'Reload Application']"); //refresh button
    By logOutButtonXPath = By.xpath("//span[text()='Log out']"); //log out
    By backgroundColorRGBA = By.xpath("//body[contains(@class,'base-background ember-application')]");
    By contrastXPath = By.xpath("//div[@id='app-page']");

    //Methods section
    public void logOut(){
        clickWait(logOutButtonXPath);
    }

    public String customerName(){
        return getText(customerNameXPath);
    }


    public String pageHeaderName(By elementXPath){
        return getText(elementXPath);
    }

    public void selectSettings(){
        selectItem(settingsXPath);
    }

    public void selectAutomation(){
        selectItem(automationXPath);
    }

    public void selectHome(){
        selectItem(homeXPath);
    }

    public void refreshApp(){
        selectItem(refreshXPath);
    }

    public Color darkModeAppliedRGBA(){
        return Color.fromString(driver.findElement(backgroundColorRGBA).getCssValue("background-color"));
    }

    public Color highContrastAppliedRGBA(){
       return Color.fromString(driver.findElement(contrastXPath).getCssValue("color"));
    }
}
