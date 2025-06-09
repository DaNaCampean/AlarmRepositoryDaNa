package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

import static utils.DriverUtils.driver;

public class BasePage {

    //Methods section

    public void selectItem(By element) {
        isVisible(element);
        clickWait(element);
    }

    public String getURL() {
        String getURL = "";
        try {
            getURL = driver.getCurrentUrl();
        } catch (Exception e) {
            System.out.println("Cannot \"getURL\"");
        }
        return getURL;
    }

    public static void clickWait(By element) {
        try {
            WaitUtils.waitForElementToBeClickable(driver, element, 30).click();
        } catch (Exception e) {
            System.out.println("The element is not found or not clickable = " + element);
        }
    }

    public static void fillFields(String text, By element) {
        try {
            WebElement userNameTextField =isVisible(element);
            clickWait(element);
            userNameTextField.sendKeys(text);

        } catch (Exception e) {
            System.out.println("The element is not visible = " + element);
        }
    }

    public static WebElement isVisible(By byElement) {
        WebElement element=null;
        try {
           element  = WaitUtils.waitForElementToBeVisible(driver, byElement, 30);
        } catch (Exception e) {
            System.out.println("The element is not visible = " + byElement);
        }
       return element;
    }

    public String getText(By element) {
        return isVisible(element).getText();
    }

    public String getAttributeString(By element, String attribute) {
        return isVisible(element).getDomAttribute(attribute);
    }
}



