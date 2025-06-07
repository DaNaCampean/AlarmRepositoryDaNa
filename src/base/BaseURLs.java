package base;

import static base.BasePageDriver.driver;

public class BaseURLs {

    public static void goToCustomerSiteURL(){
        driver.get("https://international.alarm.com/adc/");
    }

    public static void goToDealerSiteURL(){
        driver.get("https://alarmadmin.alarm.com/");
    }


    }




