package pages.CustomerSite;

import base.BasePage;
import org.openqa.selenium.By;

public class LogInPage extends BasePage {

    //Locators section
    By userNameXPath = By.xpath("//input[@aria-label='Username']"); // locator for Username text field
    By passwordXPath = By.xpath("//input[@aria-label='Password']"); // locator for password text field
    By logInButtonXPath = By.xpath("//div[@class='divBtnLogin']/input[@type='submit']"); //locator for login button

    By selectSignIn = By.xpath("//ul[@id = 'menu-mainmenu']//span[contains(@class, 'menu-text') and contains(., 'LOGIN')]");

    //Methods section
    public void selectSignIn(){
        clickWait(logInButtonXPath);
    }

    public void signInWithCredentials(String username, String password){
        fillFields(username, userNameXPath);
        fillFields(password, passwordXPath);
        clickWait(logInButtonXPath);
    }
}
