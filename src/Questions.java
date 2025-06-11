public class Questions {
/*
1. cu CTRL + click merg la metoda respectiva. Cum pot veni inapoi?
2. POza cu history???
3. alarm.com direct nu am reuseit sa fac frumos cu login.... ma duce la international...
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

4. Wait for element to be clickable nu merge pe toggles de dark/ contrast- da fail
    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

5. same for is visible for toggles

de la alex/ alexandra:
//a/span/span[text()='LOGIN' and not(@hidden)] - afuiseaza doar ce "nu e hidden"
https://alarm.com/login.aspx - asta foloseste auto team
daca nu se pune www, te poate duce la international stuff

History poza... probabil undeva in cod este acel "campean" si daca dai click pe el, ar trebui sa dispara acel tab nou
GO BACK TASTE din metoda in maine class:    CTRL + ALT + SAGEATA STANGA

Faza cu wait for element to be clickable la toggle - a mai patit alexandra
se poate sa nu mearga ca e ceva animatie la buton.
incearca cu isVisible stuff, care veriifica ca e acolo...si e ok de foilosit click normal apoi.
sau alta varianta e de folosit atribute: gen la "style " tab, dai pe >> si apare proprieties. acolo sunt toate:
click, display: daca e false, e vizibil si se poate da click, daca e true...e grayed out.
deci poti compara daca e falxse, e ok de dat click, altfel nu

poti edita acolo pe xpath: dublu click, apoi adaugi tu ce vrei...gen:
asta e initial:  <input id="ember15" tabindex="0" data-checked="true" class="dark-mode" data-auto="dark-mode-toggle" type="checkbox">
editezi si iese: <input id="ember15" tabindex="0" data-checked="true" class="dark-mode" data-auto="dark-mode-toggle" type="checkbox" disabled="true">

 */
}
