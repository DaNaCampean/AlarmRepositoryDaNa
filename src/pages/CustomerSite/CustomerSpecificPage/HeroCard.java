package pages.CustomerSite.CustomerSpecificPage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static utils.DriverUtils.driver;

public class HeroCard extends BasePage {

    By highlightsXPath = By.xpath("//p[text()='Highlights']");
    By playXPath = By.xpath("//div[@class='btn-play-highlights']");
    By video2 = By.xpath("//div[@class='lottie-player']");
    By video3 = By.xpath("//div[contains(@class, 'activity-highlights-clip-container')]//video");
    By video4 = By.cssSelector(".activity-highlights-clip-container video");
    By percentage = By.xpath("//div[@class='progress ']");

    By cogXPath = By.xpath("//div[@class='dropdown-actions']");
    By dropdown = By.xpath("//div[@class='content']");

    By customerName = By.xpath("//span[@class='login-name']");
    By highlightsGifXPath = By.xpath("//button[@class = 'highlights-button']//img[@alt='Highlights Button']");
    By heroCardXPath = By.xpath("//div[@class='hero-card ']");

    By settingsLeftMenuXPath = By.xpath("//button[@aria-label='Edit home page layout']");
    By showHeroXPath = By.xpath("//button[contains(@class, 'toggle-setting') and @aria-label='Show']");

    By saveButton = By.xpath("//button[contains(@class, 'simple-btn') and span[text()='Save']]");

    public void preconditions(){

        if (isVisible(heroCardXPath)!=null)
            System.out.println("HERO OK");
        else {
            System.out.println("hero nok");
            //da enable la hero card
            isVisible(settingsLeftMenuXPath);
            clickWait(settingsLeftMenuXPath);
            isVisible(showHeroXPath);
            clickWait(showHeroXPath);
            isVisible(saveButton);
            clickWait(saveButton);
            System.out.println("change hero" );

        }


    }
    public String getCustomerName(){
        isVisible(customerName);
        //return driver.findElement(customerName).getDomProperty("textContent");
        return driver.findElement(customerName).getText();

    }

    public boolean isCogVisible(){
        if (isVisible(cogXPath)!=null)
            return true;
        return false;
    }


    public boolean isHighlightsGif(){
        WebElement highGif = isVisible(highlightsGifXPath);
        String src = highGif.getDomAttribute("src");
        if (src.endsWith(".gif")){
            return true;
        }
        return false;
    }

    public void highlightsClick(){
        isVisible(highlightsXPath);
        clickWait(highlightsXPath);
    }

    public void cogClick() {
        isVisible(cogXPath);
        clickWait(cogXPath);
    }

    public ArrayList<String> heroCardSettingsItems() {
        isVisible(dropdown);
        WebElement optionsDropDown = driver.findElement(dropdown);

        List<WebElement> items = driver.findElements(By.xpath("//div[@class='content']//ul[@class='items-list']/li"));
        ArrayList<String> itemsListString = new ArrayList<>();
        for (WebElement item : items) {
            WebElement itemElement = item.findElement(By.xpath(".//span[@class='name fs-unmask']"));
            String itemName = itemElement.getText();

            itemsListString.add(itemName);
        }

        return itemsListString;
    }

    public String getText(){
       return  isVisible(highlightsXPath).getText();
    }

    public static String highlightSlideShowPercentage(String text){
        String percentage = null;
        int start = ("transform: translateX(").length();
        System.out.println("index of = " + start);
        int end = text.indexOf("%");
        System.out.println("end="+end);
        percentage = text.substring(start, end);
        System.out.println("calcule = " + percentage);
        return percentage;
    }
    public void playClick(){
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        isVisible(playXPath);
        clickWait(playXPath);

        String  procent = driver.findElement(percentage).getAttribute("style");
        System.out.println("ddd= " + procent);
        String p1 = highlightSlideShowPercentage(procent);
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        procent = driver.findElement(percentage).getAttribute("style");
        System.out.println("ddd222= " + procent);
        String p2 =highlightSlideShowPercentage(procent);

        if (p1.equals(p2))
            System.out.println("percentagesss=22222 " + p1 + "-" + p2+ " and video is PAUSED");
        else  System.out.println("percentagesss22222= " + p1 + "-" + p2+ " and video is PLAYing");
      }


public void pauseClick(){
    try {
        Thread.sleep(2_000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    isVisible(video2);
    clickWait(video2);
    // isVisible(playXPath);
    // now the video is paused.


//    WebElement element = driver.findElement(video4);
//    String getProp = checkPropertyHero(element,"paused");
//    System.out.println("prop = " + getProp);
//    clickWait(video2);
//    element = driver.findElement(video4);
//    getProp = checkPropertyHero(element,"paused");
//    System.out.println("prop = " + getProp);
    // bucata cu paused merge doar la video...la arm/disarm nu merge

    String  procent = driver.findElement(percentage).getAttribute("style");
 String p1 = highlightSlideShowPercentage(procent);
    try {
        Thread.sleep(1_000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    procent = driver.findElement(percentage).getAttribute("style");
    String p2 = highlightSlideShowPercentage(procent);

    if (p1.equals(p2))
        System.out.println("percentagesss= " + p1 + "-" + p2+ " and video is PAUSED");
    else  System.out.println("percentagesss= " + p1 + "-" + p2+ " and video is PLAYing");




}

public String calculatePercentage(){

    WebElement progressDiv = driver.findElement(By.xpath("//div[@class='progress ']"));

    // Get the 'style' attribute
    String styleAttr = progressDiv.getAttribute("style");
    System.out.println("style= " + styleAttr);
    // Extract the percentage using Java string methods
    String percentage = null;
    if (styleAttr != null && styleAttr.contains("translateX(")) {
        int start = styleAttr.indexOf("translateX(") + "translateX(".length();
        int end = styleAttr.indexOf("%", start);
        percentage = styleAttr.substring(start, end) + "%";

        System.out.println("test stringaaaa");
         percentage = null;
        styleAttr = "transform: translateX(0%);";

         start = ("transform: translateX(").length()-1;
        System.out.println("index of = " + start);
             end = styleAttr.indexOf("%", start);
        System.out.println("end="+end);
            percentage = styleAttr.substring(start, end);
            System.out.println("calcule = " + percentage);


    }

    // Print the result
    System.out.println("Extracted Percentage: " + percentage);
    return percentage;
}

    public boolean isPlaying(){

        WebElement element =  isVisible(playXPath);


        if (element != null) {
           return true;
        } else {
             return false;
        }
   }


}
