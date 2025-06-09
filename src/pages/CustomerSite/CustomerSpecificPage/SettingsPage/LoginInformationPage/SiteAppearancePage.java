package pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

import static utils.DriverUtils.driver;

public class SiteAppearancePage extends BasePage {

    //Locators section

    By pageHeaderSiteAppearanceXPath = By.xpath("//h1[text() = 'Site Appearance']");
    By darkModeToggleXPath = By.xpath("//input[@class='dark-mode']");
    By highContrastToggleXPath = By.xpath("//input[@class='high-contrast' and @type='checkbox']");
    By saveButtonXPath = By.xpath("//span[text() = 'Save']");
    By notificationSave = By.xpath("//p[@class='notification-text' and text()='Your preferences have been updated.']");

    //Methods section
/*
NU merg astea, pe toggle sa verific ca e visible sau clickable....asa ca am folosit fara verificari

public String returnAttributeDarkMode(String attribute){
      return getAttributeString(darkModeToggleXPath, attribute);
   }

    public String returnAttributeContrast(String attribute){
        return getAttributeString(highContrastToggleXPath, attribute);
   }

public void darkModeClick(){
        clickWait(darkModeToggleXPath);
   }

   public void contrastClick(){
        clickWait(highContrastToggleXPath);
    }

 */


    public String returnAttributeDarkMode(String attribute){
        return driver.findElement(darkModeToggleXPath).getDomAttribute(attribute);

    }

    public String returnAttributeContrast(String attribute){
        return driver.findElement(highContrastToggleXPath).getDomAttribute(attribute);
   }


    public void darkModeClick(){
        driver.findElement(darkModeToggleXPath).click();
    }

    public void contrastClick(){
        driver.findElement(highContrastToggleXPath).click();
    }

    public String pageHeaderName(){
        return getText(pageHeaderSiteAppearanceXPath);
    }

    public void saveClick(){
        clickWait(saveButtonXPath);
    }
    public String returnNotificationSave(){
        isVisible(notificationSave);
        return getText(notificationSave);
    }
    public Color contrastToggleBlue(){
        contrastClick();//Toggle off
        contrastClick(); //Toggle on again for next to appear:  @media not all and (pointer: coarse)
       // NU MERGE ASA:  return Color.fromString(isVisible(highContrastToggleXPath).getCssValue("outline-color"));
        return Color.fromString(driver.findElement(highContrastToggleXPath).getCssValue("outline-color"));
    }

    public Color darkModeToggleBlue() {
        darkModeClick();//Toggle off
        darkModeClick(); //Toggle on again for next to appear:  @media not all and (pointer: coarse) {
        // NU MERGE ASA:   return Color.fromString(isVisible(darkModeToggleXPath).getCssValue("outline-color"));
        return Color.fromString(driver.findElement(darkModeToggleXPath).getCssValue("outline-color"));
    }
}
