package pages.CustomerSite.CustomerSpecificPage;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

import static utils.DriverUtils.driver;

public class HeroCard extends BasePage {

    By highlightsXPath = By.xpath("//p[text()='Highlights']");
    By playXPath = By.xpath("//div[@class='btn-play-highlights']");
    By video = By.xpath("//div[@class='activity-highlights-clip-container ']/video");

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
            Thread.sleep(30_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // isVisible(highlightsXPath);
        isVisible(playXPath);
        clickWait(playXPath);
        System.out.println("before video");
      //  isVisible(video).click();
        System.out.println("after video");
    }

    public void pauseClick(){
        try {
            Thread.sleep(30_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // isVisible(highlightsXPath);

        isVisible(video2);
        clickWait(video2);
        System.out.println("buton de play?");
        isVisible(playXPath);

    }
    public boolean isPlaying(){
       WebElement element =  driver.findElement(By.xpath("playXPath"));
       if (element!=null)
           return true;
       else return false;

    }


    // //div[@class='btn-play-highlights']


}
