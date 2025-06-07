package pages.CustomerSite;

import base.BasePageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePageDriver {

    //Locators section

    By userNameXPath = By.xpath("//input[@aria-label='Username']");
    By passwordXPath = By.xpath("//input[@aria-label='Password']");
    By logInButtonXPath = By.xpath("//div[@class='divBtnLogin']/input[@type='submit']");


    //Methods section
    public void username(){
        WebElement usernameTextField = driver.findElement(userNameXPath);
        usernameTextField.sendKeys("PM360R_243D17");

    }

    public void password(){
        WebElement passwordTextField = driver.findElement(passwordXPath);
        passwordTextField.sendKeys("Test@123456");

    }

    public void signInWithCredentials(){
        driver.findElement(userNameXPath).sendKeys("PM360R_243D17");
        driver.findElement(passwordXPath).sendKeys("Test@123456");
        driver.findElement(logInButtonXPath).click();
    }


}
