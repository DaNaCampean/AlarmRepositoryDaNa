package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
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
           element  = WaitUtils.waitForElementToBeVisible(driver, byElement, 10);
        } catch (Exception e) {
            System.out.println("The element is not visible = " + byElement);
        }
       return element;
    }

    public String getText(By element) {
        return isVisible(element).getText();
    }

    public Color getCSSValueColor(By byElement){
        // NU MERGE ASA:
        // return Color.fromString(isVisible(highContrastToggleXPath).getCssValue("outline-color"));
        Color myColor=null;
        try {
            WebElement element =  driver.findElement(byElement);
            myColor =  Color.fromString(element.getCssValue("outline-color"));
        }catch (Exception e) {
            System.out.println("Cannot found or retrieve the value of the property");
        }

     return myColor;

    }

    public String getAttributeString(By byElement, String attribute) {

        WebElement element = driver.findElement(byElement);
        String propertyValue = checkProperty(element);
        String returnValue=null;

        try {
            if ("false".equals(propertyValue)){
                returnValue = element.getDomAttribute(attribute);
            }

        } catch (Exception e) {
            System.out.println("Cannot found or retrieve the value of the property");
        }
        return returnValue;
    }

    public String checkProperty(WebElement element){

        try {
            element.getDomProperty("disabled");
        } catch (Exception e) {
            System.out.println("Cannot found or retrieve the value of the property");

        }
        return element.getDomProperty("disabled");

    }

    public void toggleClick(By byElement){

        WebElement element =  driver.findElement(byElement);
        String propertyValue = checkProperty(element);

        try {
            if ("false".equals(propertyValue))
                element.click();

        } catch (Exception e) {
            System.out.println("The property is disabled=true, and cannot be clickable");

        }

    }


}



