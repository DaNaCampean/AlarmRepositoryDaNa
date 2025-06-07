package pages.CustomerSite.CustomerSpecificPage;

import base.BasePageDriver;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.LoginInformationPage;
import pages.CustomerSite.CustomerSpecificPage.SettingsPage.LoginInformationPage.SiteAppearancePage;
import utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class CustomerHomePage extends BasePageDriver {
    //Locators section

    By customerNameXPath = By.xpath("//span[text() = 'PM360R_243D17']");
    By automationXPath = By.xpath("//p[text() = 'Automation']");
    By settingsXPath = By.xpath("//p[@class='ellipsize ' and text() = 'Settings']");
    By homeXPath = By.xpath("//p[text() = 'Home']");
    By refreshXPath = By.xpath("//button[@aria-label = 'Reload Application']");
    By backXPath = By.xpath("/html");

    By loginInfoNameXPath = By.xpath("//h1[text() = 'Login Information']");
    By logOutButtonXPath = By.xpath("//span[text()='Log out']");
    //Methods section

    public void logOut(){
        driver.findElement(logOutButtonXPath).click();


    }
    public String colorScheme(){
        // Locate the <html> element . Checking color-scheme
        WebElement htmlElement = driver.findElement(backXPath);
        String colorTheme="";

        // Get the 'style' attribute
        String styleAttribute = htmlElement.getDomAttribute("style");
        if (styleAttribute.contains("color-scheme: dark")){
            System.out.println("Background = DARK");
            colorTheme = "dark";
        }
        else if (styleAttribute.contains("color-scheme: light")){
            colorTheme = "light";
        }
        return colorTheme;
        }

    public String customerName(){
        Utils.waitForElementVisible(driver,customerNameXPath,30);
        return driver.findElement(customerNameXPath).getText();
    }

    public String pageHeaderName(By elementXPath){
        System.out.println("base = ");
        return driver.findElement(elementXPath).getText();

    }

    public void selectSettings(){


        Utils.waitForElementVisible(driver,settingsXPath,30);
        System.out.println("BEFORE CLICK SETTINGS");
        Utils.implicitlyWaitFiveSeconds();
        WebElement settingWebElement = driver.findElement(settingsXPath);
        Utils.implicitlyWaitFiveSeconds();
        settingWebElement.click();

        System.out.println("AFTER click settings");
    }
    public void selectAutomation(){


        Utils.waitForElementVisible(driver,automationXPath,30);
        System.out.println("BEFORE CLICK automation");
        Utils.implicitlyWaitFiveSeconds();
        driver.findElement(automationXPath).click();
        System.out.println("AFTER click automation");
    }

    public void selectHome(){
        System.out.println("select HOME");

        Utils.waitForElementVisible(driver,loginInfoNameXPath,30);
        Utils.implicitlyWaitFiveSeconds();
        driver.findElement(homeXPath).click();
    }

    public void refreshApp(){
        driver.findElement(refreshXPath).click();
        Utils.implicitlyWaitFiveSeconds();
        System.out.println("refreshhhh");
    }

    public Color darkModeAppliedRGBA(){
        By backgroundColor = By.xpath("//body[contains(@class,'base-background ember-application')]");

        Color backgroundColour = Color.fromString(driver.findElement(backgroundColor).getCssValue("background-color"));
        System.out.println("color = " + backgroundColour);
        assert backgroundColour.asRgba().equals("rgba(5, 5, 5, 1)"); //dark
        //assert backgroundColour.asRgba().equals("rgba(240, 240, 240, 1)"); //light

        System.out.println("ok background");
        return backgroundColour;

    }

    public Color highContrastAppliedRGBA(){

      //  By contrastXPath = By.xpath("//div[@class='md view-container surface ember-view']");
          By contrastXPath = By.xpath("//div[@id='app-page']");

        Color contrastColor = Color.fromString(driver.findElement(contrastXPath).getCssValue("color"));
        System.out.println("color contrast = " + contrastColor);
//        assert contrastColor.asRgba().equals("rgba(221, 221, 222, 1)"); //off
//        System.out.println("contrast off");

        assert contrastColor.asRgba().equals("rgba(255, 255, 255, 1)"); //on
        System.out.println("contrast ON");
        return contrastColor;
    }





}
