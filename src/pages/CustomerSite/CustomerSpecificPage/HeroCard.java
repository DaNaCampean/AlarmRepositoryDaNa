package pages.CustomerSite.CustomerSpecificPage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

import static utils.DriverUtils.driver;

public class HeroCard extends BasePage {

    By highlightsXPath = By.xpath("//p[text()='Highlights']");
    By playXPath = By.xpath("//div[@class='btn-play-highlights']");
    By video2 = By.xpath("//div[@class='lottie-player']");

    public void highlightsClick(){
        isVisible(highlightsXPath);
        clickWait(highlightsXPath);

    }

    public String getText(){

       return  isVisible(highlightsXPath).getText();
    }
    public void playClick(){
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        isVisible(playXPath);
        clickWait(playXPath);
      }

    public void pauseClick(){
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        isVisible(video2);
        clickWait(video2);
       // isVisible(playXPath);
        WebElement element =  isVisible(playXPath);
        String getProp = checkPropertyHero(element,"hidden");
        System.out.println("prop = " + getProp);

    }

    public boolean isPlaying(){

        WebElement element =  isVisible(playXPath);


        if (element != null) {
           return true;
        } else {
             return false;
        }
   }


    // //div[@class='btn-play-highlights']


}
