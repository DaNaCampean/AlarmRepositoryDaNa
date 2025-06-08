package base;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utils.WaitUtils;

import static utils.DriverUtils.driver;

public class BasePage {

    //Methods section

    public String getURL() {
        String getURL = "";
        try {
            getURL = driver.getCurrentUrl();
        } catch (Exception e) {
            System.out.println("Cannot \"getURL\"");
        }
        return getURL;
    }

    public void clickByActions(By element) {
        Actions actions = new Actions(driver); // Instantiate the Actions class needed for double click

        try {
            WaitUtils.waitForElementToBeClickable(driver, element, 15);
            actions.click(WaitUtils.waitForElementToBeClickable(driver, element, 15)).perform(); // Perform click
        } catch (Exception e) {
            System.out.println("The element is not found or Cannot double click on it - " + element);
        }
    }

    public static void clickWait(By element) {
        try {
            WaitUtils.waitForElementToBeClickable(driver, element, 15).click();
        } catch (Exception e) {
            System.out.println("The element is not found or not clickable = " + element);
        }
    }

    public String getText(By element) {
        String getTextFromElement = "";
        try {
            getTextFromElement = WaitUtils.waitForElementToBeVisible(driver, element, 15).getText();
        } catch (Exception e) {
            System.out.println("The element is not found. Cannot \"getText\" fot it - " + element);
        }
        return getTextFromElement;
    }

    public String getAttributeString(By element, String attribute) {
        String getAttributeFromElement = "";
        try {
            getAttributeFromElement = WaitUtils.waitForElementToBeVisible(driver, element, 15).getDomAttribute(attribute);
        } catch (Exception e) {
            System.out.println("The element is not found");
        }
        return getAttributeFromElement;
    }

}



