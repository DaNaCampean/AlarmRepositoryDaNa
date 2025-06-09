package pages.CustomerSite;

import base.BasePage;
import org.openqa.selenium.By;

public class LogInPage extends BasePage {

    //Locators section
    By userNameXPath = By.xpath("//input[@aria-label='Username']"); // locator for Username text field
    By passwordXPath = By.xpath("//input[@aria-label='Password']"); // locator for password text field
    By logInButtonXPath = By.xpath("//div[@class='divBtnLogin']/input[@type='submit']"); //locator for login button

    //Methods section
    public void signInWithCredentials(){
        fillFields("PM360R_243D17", userNameXPath);
        fillFields("Test@123456", passwordXPath);
        clickWait(logInButtonXPath);
    }
}
