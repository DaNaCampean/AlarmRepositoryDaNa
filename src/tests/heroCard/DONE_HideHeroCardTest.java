package tests.heroCard;

import base.BaseURLs;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DONE_HideHeroCardTest extends BaseTest{
    /*
CX-T1339	Weekly Build Smoketest - Hero Card - Cog drop down to hide hero card - WEB - All Environments
	Goal: Cog menu options with a SS account with video analytics camera
installed. Hide the hero card

Preconditions:
    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
*/


    @BeforeMethod
    public void preconditions(){
        //preconditions:
//         * Precondition 1: Account has access to highlights
//         * Precondition 2: Account has activity for highlights

        BaseURLs.goToCustomerSiteURL(); // go to alarm.com sign in page
        login.signInWithCredentials("IQ4EU_sv37522", "Test@123456");
        hero.preconditions();// hero card is visible. if not, enabled it

    }
    @Test

    public void hideHeroCard(){

        //Login to an account that meets pre condition => the hero card should have a cog

        BaseURLs.goToCustomerSiteURL(); // go to alarm.com sign in page
        login.signInWithCredentials("IQ4EU_sv37522", "Test@123456");
        Assert.assertEquals(hero.getCustomerName(), "IQ4EU_sv37522", "Verified the customer Name is correct");
        System.out.println("PASSED - The login worked. Correct customer home page appears: " + hero.getCustomerName());

        Assert.assertTrue(hero.isCogVisible(), "Verified that the hero card has a cog");
        System.out.println("PASSED - The hero Card has a cog");


        // select the cog => observe the drop down: Highlights, Video, Activity and edit hero card

        hero.cogClick();
        ArrayList<String> expectedList = new ArrayList<>(Arrays.asList("Video Clips", "Activity History", "Edit Dashboard"));
        Assert.assertEquals(hero.heroCardSettingsItems(), expectedList, "Verified that hero card settings popup options are correct: Video Clips, Activity History, Edit Dashboard");
        System.out.println("PASSED - The hero card settings popup options are correct: " + hero.heroCardSettingsItems());

        // select edit dashboard

        ArrayList<String> actual =  hero.heroCardSettingsItems();
        System.out.println("lista = " + actual.getLast());
        hero.selectCogOptions(3);


        // choose to hide the hero card and save => the hero card should be hidden from the home page
        // and the cog should now appear next to the home menu item

        hero.hideHeroCard();
        Assert.assertFalse(hero.isHeroCardVisible(), "Verified that hero card is HIDDED");
        System.out.println("PASSED - The hero card IS hidden");

        //check cog exists next to the home menu item.
        Assert.assertTrue(hero.isCogVisibleLeftMenu(), "Verified that there is a cog next to the Home menu item");
        System.out.println("PASSED - there is a cog next to the Home menu item");

//        customer.selectSettings();
//        //check cog exists next to the home menu item.
//        Assert.assertFalse(hero.isCogVisibleLeftMenu(), "Verified that there is a cog next to the Home menu item");
//        System.out.println("PASSED - there is a cog next to the Home menu item");
//
//        customer.selectHome();
//        //check cog exists next to the home menu item.
//        Assert.assertTrue(hero.isCogVisibleLeftMenu(), "Verified that there is a cog next to the Home menu item");
//        System.out.println("PASSED - there is a cog next to the Home menu item");

    }
}
