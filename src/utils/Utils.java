package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static base.BasePageDriver.driver;

public class Utils {
    //in utils, we can use wait for elements to be visible , rather than  implicit wait with seconds
// take screenshots

    public static void implicitlyWaitFiveSeconds(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    // wait until the element became visible
    public static void waitForElementVisible(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
