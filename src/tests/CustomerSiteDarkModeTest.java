package tests;

import base.BaseURLs;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerSiteDarkModeTest extends BaseTest{

    @BeforeMethod

    public void preconditions(){
        // Test Suite preconditions for all tests: DarkMode Toggle and HighContrast Toggle  should be DISABLED/OFF

        System.out.println("\nPRECONDITIONS: Make sure DarkMode and High Contrast are OFF/ DISABLED");
        BaseURLs.goToCustomerSiteURL(); //open Customer Site
        login.signInWithCredentials(); // login with user and pass
        customer.selectSettings(); // Open Settings from left menu
        settings.selectLoginInfo(); // Open Login Information page
        loginInformation.selectSiteAppearance(); // Open Site Appearance page

        //DarkMode Toggle check and set
        String attribute = siteAppearance.returnAttributeDarkMode("data-checked"); //get Toggle attribute
        if (attribute.equals("true")){
            siteAppearance.darkModeClick(); // If the Toggle is ON, make it OFF
        }

        //High Contrast Toggle check and set
        attribute = siteAppearance.returnAttributeContrast("data-checked");
        if (attribute.equals("true")){
            siteAppearance.contrastClick();
        }
        siteAppearance.saveClick(); //save the changes
        System.out.println("Preconditions/ requirements: CHECKED\n");
    }


    @Test
    public void darkModeSiteAppearance() {

        System.out.println("TEST CASE 1: CX-T1557 - Dark Mode: Permission for customers associated with dealer 1/1115");

        BaseURLs.goToCustomerSiteURL();
        String myURL = customer.getURL();
        Assert.assertEquals(myURL, "https://www.alarm.com/login.aspx", "Verified that the correct LogIn page was shown, by URL");
        System.out.println("STEP 0 - Passed - correct URL(SIGN IN): " + myURL + " opens");

        //Step: Login to customer site
        //Expected Result: Verify logged into customer site
        login.signInWithCredentials();
        String customerSiteName = customer.customerName();
        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by customer name ");
        System.out.println("STEP 1 - Passed - correct Customer account LOGGED IN: " + customerSiteName + " opens");

        //Step: Navigate to Settings --> Login Information
        //Expected Result: Verify page loads

        customer.selectSettings();
        String headerName = settings.pageHeaderName();
       // String headerName = customer.pageHeaderName(headerNameBy);
        Assert.assertEquals(headerName, "Settings", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 2.1 - Passed - correct page: " + headerName + " opens");

        settings.selectLoginInfo();
        headerName = loginInformation.pageHeaderName();

        Assert.assertEquals(headerName, "Login Information", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 2.2 - Passed - correct page: " + headerName + " opens");

        //Step: Look at options under “Login Information”
        // Expected Result: Verify “Site Appearance” is listed as an option

        String optionsToFind = loginInformation.pageOptionsName();
              //  optionsText("siteAppearanceXPath");
        Assert.assertEquals(optionsToFind, "Site Appearance", "Verified that Site Appearance option is available ");
        System.out.println("STEP 3 - Passed - Correct option is available on the page: " + optionsToFind + "\n");
    }


    @Test
    public void darkModeToggle() {

        System.out.println("TEST CASE 2: CX-T1556 (1.0)Dark Mode: Toggling Dark Mode ON/OFF (Functional)");

        //STEP 1:  Login to customer site
        // Expected Result: Verify logged into customer site

        BaseURLs.goToCustomerSiteURL();
        login.signInWithCredentials();
        String customerSiteName = customer.customerName();
        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by customer name ");
        System.out.println("STEP 1 - Passed - correct Customer account LOGGED IN: " + customerSiteName + " opens");


        //STEP 2:  Click Settings in left nav menu
        //Expected Result: Verify Settings page loads

        customer.selectSettings();
        String headerName = settings.pageHeaderName();
        Assert.assertEquals(headerName, "Settings", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 2 - Passed - correct page: " + headerName + " opens");

        //STEP 3:  Click “Login Information” and then click “Site Appearance”
        //Expected Result: Verify Site Appearance page loads and displays 2 toggle buttons (one for dark mode and one for high contrast)

        settings.selectLoginInfo();
        loginInformation.selectSiteAppearance();
        headerName = siteAppearance.pageHeaderName();

        Assert.assertEquals(headerName, "Site Appearance", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 3.1 - Passed - correct page: " + headerName + " opens");

        // and displays 2 toggle buttons (one for dark mode and one for high contrast)
        String attribute = siteAppearance.returnAttributeDarkMode("type");
        Assert.assertEquals(attribute, "checkbox", "Verified that there is a Toggle button for Dark Mode, by getDomAttribute ");
        System.out.println("STEP 3.2 - Passed - there is a Toggle button for Dark Mode ");

        attribute = siteAppearance.returnAttributeContrast("type");
        Assert.assertEquals(attribute, "checkbox", "Verified that there is a Toggle button for High Contrast, by getDomAttribute ");
        System.out.println("STEP 3.3 - Passed - there is a Toggle button for High Contrast ");

        //STEP 4: Step Click toggle for Dark Mode to on/enabled
        //Expected Result: Verify toggle UI change (should turn blue)

        siteAppearance.darkModeClick();
        attribute = siteAppearance.returnAttributeDarkMode("data-checked");
        Assert.assertEquals(attribute, "true", "Verified that the Toggle button for dark Mode is ON/ENABLED, by getDomAttribute ");
        System.out.println("STEP 4 - Passed - The Toggle button for DARK MODE is ON/ENABLED");

        //STEP5:  Click toggle for Dark Mode to off/disabled
        //Expected Result: Verify toggle UI change (color should change to black)

        siteAppearance.darkModeClick();
        attribute = siteAppearance.returnAttributeDarkMode("data-checked");
        Assert.assertEquals(attribute, "false", "Verified that the Toggle button for dark Mode is OFF/DISABLED, by getDomAttribute ");
        System.out.println("STEP 5 - Passed - The Toggle button for DARK MODE is OFF/DISABLED");
    }
//
    @Test
    public void togglingDarkModeOnOffFunctional() {
        System.out.println("\n");
        System.out.println("TEST CASE 3: CX-T1556 (1.0)Dark Mode: Toggling Dark Mode ON/OFF (Functional)");

        //STEP 1:  Login to customer site
        // Expected Result: Verify logged into customer site

        BaseURLs.goToCustomerSiteURL();

        login.signInWithCredentials();
        String customerSiteName = (customer.customerName());
        Assert.assertEquals(customerSiteName, "PM360R_243D17", "Verified that the correct customer page opens, by customer name ");
        System.out.println("STEP 1 - Passed - correct Customer account LOGGED IN: " + customerSiteName + " opens");


       // STEP 2: Go to “Settings” and click “Login Information”
      //  Expected Result: Verify page loads

       // settings.selectSettings();
        customer.selectSettings(); //Open Settings page
        settings.selectLoginInfo(); //Open Login Information Page
        String headerName = loginInformation.pageHeaderName(); // get the name of the page

        Assert.assertEquals(headerName, "Login Information", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 2 - Passed - correct page: " + headerName + " opens");

//        STEP 3: Click “Site Appearance”
//        Expected Result: Verify page loads

        loginInformation.selectSiteAppearance();
        headerName = siteAppearance.pageHeaderName(); //get the name of the page
        Assert.assertEquals(headerName, "Site Appearance", "Verified that the correct  page opens, by page header ");
        System.out.println("STEP 3 - Passed - correct page: " + headerName + " opens");


//        STEP 4: Click Toggle for Dark mode to ON
//        Expected Result: Verify toggle UI change (should change to blue)
        siteAppearance.darkModeClick();
        String attribute = siteAppearance.returnAttributeDarkMode("data-checked");
        Assert.assertEquals(attribute, "true", "Verified that the Toggle button for dark Mode is ON/ENABLED, by getDomAttribute ");
        System.out.println("STEP 4 - Passed - The Toggle button for DARK MODE is ON/ENABLED");

        System.out.println("DON'T KNOW HOW TO SEE IF IT IS BLUE");




//        STEP 5: Click Save
//        Expected Result: Verify UI confirms setting has been saved

        siteAppearance.saveClick(); //press save button
        String notificationText = siteAppearance.returnNotificationSave();
        Assert.assertEquals(notificationText, "Your preferences have been updated.", "Verified that the DarkMode Toggle change is Saved. Verified the Notification text");
        System.out.println("STEP 5 - Passed - The notification for saving the DarkMode Toggle is correct: "+ notificationText );

//        STEP 6: Navigate back to home screen
//        Expected Result: Verify dark mode is applied

         customer.selectHome();
         String colorTheme = customer.colorScheme();
         Assert.assertEquals(colorTheme, "dark", "Verified that the DarkMode is applied, by checking color-scheme");
         System.out.println("STEP 6.1 - Passed - The dark Mode is applied ");

        Color colorcheck = customer.darkModeAppliedRGBA();
        assert colorcheck.asRgba().equals("rgba(5, 5, 5, 1)"); //dark //"Verified that the DarkMode is applied, by checking background-color using rgba function"
        System.out.println("STEP 6.2 - Passed - The dark Mode is applied, by checking background-color using rgba function ");


//        STEP 7: Refresh page
//        Expected Result: Verify dark mode is still applied

        customer.refreshApp();
        Assert.assertEquals(customer.colorScheme(), "dark", "Verified that the DarkMode is still applied after Refresh, by checking color-scheme");
        System.out.println("STEP 7.1 - Passed - The dark Mode is still applied after Refresh");

         colorcheck = customer.darkModeAppliedRGBA();
        assert colorcheck.asRgba().equals("rgba(5, 5, 5, 1)"); //dark //"Verified that the DarkMode is applied, by checking background-color using rgba function"
        System.out.println("STEP 7.2 - Passed - The dark Mode is applied, by checking background-color using rgba function ");



//        STEP 8: Repeat for Dark + High contrast mode
//        Expected Result: Verify dark + high contrast mode remains applied after saving and refreshing the page
        customer.selectSettings();
        settings.selectLoginInfo();
        loginInformation.selectSiteAppearance();

    //   STEP 8.1 Click Toggle for Dark Mode and High Contrast to ON

        // check the DarkMode is togGle ON

        attribute = siteAppearance.returnAttributeDarkMode("data-checked");
        if (attribute.equals("false"))
        {
            siteAppearance.darkModeClick();
        }
        else {
            Assert.assertEquals(attribute, "true", "Verified that the toggle button for dark Mode is ON/ENABLED, by getDomAttribute ");
            System.out.println("STEP 8.1.1 - Passed - The toggle button for DARK MODE is still ON/ENABLED");
            Color darkToggleColor = siteAppearance.darkModeToggleBlue(); // Verified that the DARK Mode toggle  is BLUE, by checking outline-color using rgba function
            assert darkToggleColor.asRgba().equals("rgba(45, 164, 240, 1)"); //on
            System.out.println("STEP - Passed - The dark toggle is BLUE, by checking outline-color css element using rgba function ");
        }

        // SET High contrast toggle ON
        siteAppearance.contrastClick();
        attribute = siteAppearance.returnAttributeContrast("data-checked");
        Assert.assertEquals(attribute, "true", "Verified that the toggle button forHigh Contrast is ON/ENABLED, by getDomAttribute ");
        System.out.println("STEP 8.1.2 - Passed - The toggle button for High Contrast is ON/ENABLED");
        Color contrastToggleColor = siteAppearance.contrastToggleBlue(); // Verified that the High Contrast is BLUE, by checking outline-color using rgba function
        assert contrastToggleColor.asRgba().equals("rgba(45, 164, 240, 1)"); //on
        System.out.println("STEP 8.1.3 - Passed - The High Contrast is BLUE, by checking outline-color css element using rgba function ");


//        STEP 8.2: Click Save
//        Expected Result: Verify UI confirms setting has been saved

        siteAppearance.saveClick(); //press save button
        notificationText = siteAppearance.returnNotificationSave();
        Assert.assertEquals(notificationText, "Your preferences have been updated.", "Verified that the DarkMode toggle change is Saved. Verified the Notification text");
        System.out.println("STEP 8.2 - Passed - The notification for saving the DarkMode and High Contrast toggles is correct: "+ notificationText );

//        STEP 8.3: Navigate back to home screen
//        Expected Result: Verify dark mode and High Contrast are applied

        customer.selectHome();
        colorTheme = customer.colorScheme();
        Assert.assertEquals(colorTheme, "dark", "Verified that the DarkMode is applied, by checking color-scheme");
        System.out.println("STEP 8.3.1 - Passed - The dark Mode is applied,  by checking color-scheme");

        colorcheck = customer.darkModeAppliedRGBA();
        assert colorcheck.asRgba().equals("rgba(5, 5, 5, 1)"); //dark //"Verified that the DarkMode is applied, by checking background-color using rgba function"
       // Assert.assertEquals(colorcheck, "rgba(5, 5, 5, 1)", "Verified that the DarkMode is applied, by checking background-color using rgba function");
        System.out.println("STEP 8.3.2 - Passed - The dark Mode is applied, by checking background-color using rgba function ");


        //check contrast
        colorcheck = customer.highContrastAppliedRGBA(); // Verified that the High Contrast is applied, by checking color on the container using rgba function
        assert colorcheck.asRgba().equals("rgba(255, 255, 255, 1)"); //on
        System.out.println("STEP 8.3.3 - Passed - The High Contrast is applied, by checking color css element using rgba function ");


//        STEP 8.4: Refresh page
//        Expected Result: Verify dark mode + high contrast are still applied

        customer.refreshApp();
        colorcheck = customer.darkModeAppliedRGBA();
        assert colorcheck.asRgba().equals("rgba(5, 5, 5, 1)"); //dark //"Verified that the DarkMode is applied, by checking background-color using rgba function"
        System.out.println("STEP 8.4.1 - Passed - The dark Mode is still applied after refresh, by checking background-color using rgba function ");

        colorcheck = customer.highContrastAppliedRGBA();
        assert colorcheck.asRgba().equals("rgba(255, 255, 255, 1)"); //on
        System.out.println("STEP 8.4.2 - Passed - The High Contrast is still applied after refresh, by checking color css element using rgba function ");

        customer.logOut();
    }
}


