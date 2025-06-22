package tests.heroCard;

import base.BaseURLs;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DropDownContainsThreeOptionsTest extends BaseTest {
    /*

CX-T1271	Weekly Build Smoketest - Hero Card - Drop down contains only 3 options - WEB - All Environments
	Goal:Verify that the drop down only includes, edit, video clips and
activity graph when the account has highlights

Precondition 1:Account has access to highlights
Precondition 2:Account has activity for highlights

Accounts:
PROD: IQ4EU_sv37522 / Test@123@123456
Steps:
1. Login to an account that meets pre conditions
=> verify highlights is gif appears in video clips slugs
2. select the cog to display the drop down
=> verify only 3 options: video, activity and edit
     */

    @Test
    public void dropDownSettings(){

        BaseURLs.goToCustomerSiteURL();

        //login and check the name of the customer
        login.signInWithCredentials("IQ4EU_sv37522", "Test@123456");
        Assert.assertEquals(hero.getCustomerName(),"IQ4EU_sv37522", "Verified that the login worked, and the Customer Name is correct");
        System.out.println("PASSED - The login worked;Customer Name is correct: " + hero.getCustomerName());

        // verify highlights is gif appears in video clips slugs
        Assert.assertTrue(hero.isHighlightsGif(), "Verified that the Highlights is a gif");
        System.out.println("PASSED - Highlights is a gif");


        // 2. select the cog to display the drop down

        hero.cogClick();
        //=> verify only 3 options: video, activity and edit

        ArrayList<String> items = hero.heroCardSettingsItems();
        Assert.assertEquals(items.toArray().length, 3, "Verified that hero card settings popup contains 3 items");
        System.out.println("PASSED - There are three items: " + hero.heroCardSettingsItems());

        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList("Video Clips", "Activity History", "Edit Dashboard"));
        Assert.assertEquals(hero.heroCardSettingsItems(), expectedList, "Verified that hero card settings popup options are correct: Video Clips, Activity History, Edit Dashboard");
        System.out.println("PASSED - The hero card settings popup options are correct: " + hero.heroCardSettingsItems());
    }
}
