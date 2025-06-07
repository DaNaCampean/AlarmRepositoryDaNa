package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePageDriver {

    public static WebDriver driver; // driver declaration

    public BasePageDriver() {  // constructor

        if (driver == null) { // this condition is added because the browser will be opened for every page. In this way, only one browser will be used

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

        }
    }

    public static void driverSetUpMac(){
        System.out.println("Using MacBook Air");
        System.setProperty("webdriver.chrome.driver", "/Users/dana/IdeaProjects/AutomationFiles/chromedriver-mac-arm64/chromedriver");

    }

    public static void driverSetUpWindows(){
        //System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Using Windows Dell");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dcampean\\Desktop\\java-automation\\chromedriver-win64\\chromedriver.exe");

    }

    //Methods section
    public String getUrl(){
        return driver.getCurrentUrl();

    }

    public static void browserQuit(){
        if (driver!=null){
            driver.quit();
        }
    }

}



