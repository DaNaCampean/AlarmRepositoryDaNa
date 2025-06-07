package pages.CustomerSite;

import base.BasePageDriver;
import utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePageDriver {

    Actions actions = new Actions(driver);
    //Locators section

    By signInButtonXPath = By.xpath("//a[.//span[normalize-space(text())='LOGIN']]");
// need an xpath more ok, ca asta are x results



//public void open() {
//    driver.get("https://international.alarm.com/adc/");
//}
    public void clickSignIn(){

        WebElement singInButton = driver.findElement(signInButtonXPath);
        actions.click(singInButton).perform();

    }
    public String pageHeaderName(By elementXPath){
        Utils.waitForElementVisible(driver,elementXPath,30);
        return driver.findElement(elementXPath).getText();

    }



}


