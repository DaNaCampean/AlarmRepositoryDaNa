package base;

import static utils.DriverUtils.driver;

public class BaseURLs {

    public static void goToCustomerSiteURL(){
       // driver.get("https://international.alarm.com/adc/");
        driver.get("https://www.alarm.com/login.aspx");

    }

    public static void goToDealerSiteURL(){
        driver.get("https://alarmadmin.alarm.com/");
    }


    }




