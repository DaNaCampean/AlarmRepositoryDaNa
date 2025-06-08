package pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage;

import static utils.DriverUtils.driver;

import base.BasePage;
import utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

public class SiteAppearancePage extends BasePage {

    //Locators section

    By darkModeTextXPath = By.xpath("//span[text() = 'Dark Mode']");
    By highContrastTextXPath = By.xpath("//span[text() = 'High Contrast']");
    By pageHeaderSiteAppearanceXPath = By.xpath("//h1[text() = 'Site Appearance']");
    By darkModeToggleXPath = By.xpath("//input[@class='dark-mode']");
    By highContrastToggleXPath = By.xpath("//input[@class='high-contrast' and @type='checkbox']");
    By saveButtonXPath = By.xpath("//span[text() = 'Save']");
    By notificationSave = By.xpath("//p[@class='notification-text' and text()='Your preferences have been updated.']");

    //Methods section

    public String returnAttributeDarkMode(String attribute){
        System.out.println("TEXT = " + driver.findElement(darkModeTextXPath).getText());
        return driver.findElement(darkModeToggleXPath).getDomAttribute(attribute);
    }

    public String returnAttributeContrast(String attribute){
        System.out.println("TEXT = " + driver.findElement(highContrastTextXPath).getText());
        return driver.findElement(highContrastToggleXPath).getDomAttribute(attribute);
    }
    public void darkModeClick(){
         driver.findElement(darkModeToggleXPath).click();
       // System.out.println("Toggle = " + returnAttributeDarkMode("data-checked"));

    }

    public void contrastClick(){

        driver.findElement(highContrastToggleXPath).click();
    }

    public By pageHeaderName(){
        return pageHeaderSiteAppearanceXPath;
    }

    public void saveClick(){

        driver.findElement(saveButtonXPath).click();
    }
    public String returnNotificationSave(){
        WaitUtils.waitForElementVisible(driver, notificationSave,30);
        System.out.println("TEXT = " + driver.findElement(notificationSave).getText());
        return driver.findElement(notificationSave).getText();
    }
    public Color contrastToggleBlue(){

        contrastClick();//Toggle off
        contrastClick(); //Toggle on again for next to appear:  @media not all and (pointer: coarse) {

        Color toggleColor = Color.fromString(driver.findElement(highContrastToggleXPath).getCssValue("outline-color"));
        System.out.println("TOGGLE COLOR = " + toggleColor);

        assert toggleColor.asRgba().equals("rgba(45, 164, 240, 1)"); //on
        System.out.println("toggle BLUE!!!!!!!!!!!!!");
        return toggleColor;
    }

    public Color darkModeToggleBlue(){

        darkModeClick();//Toggle off
        darkModeClick(); //Toggle on again for next to appear:  @media not all and (pointer: coarse) {

        Color toggleColor = Color.fromString(driver.findElement(darkModeToggleXPath).getCssValue("outline-color"));
        System.out.println("TOGGLE COLOR = " + toggleColor);

        assert toggleColor.asRgba().equals("rgba(45, 164, 240, 1)"); //on
        System.out.println("toggle BLUE!!!!!!!!!!!!!");
        return toggleColor;
    }





}
