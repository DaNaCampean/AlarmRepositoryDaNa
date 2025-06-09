public class Questions {
/*
1. cu CTRL + click merg la metoda respectiva. Cum pot veni inapoi?
2. alarm.com direct nu am reuseit sa fac frumos cu login.... ma duce la international...
Am folosit asta, dar nu e ok ca avem mai multe rezultate:
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

3. Wait for element to be clickable nu merge pe toggles de dark/ contrast- da fail
    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

4. same for is visible for toggles
 */
}
