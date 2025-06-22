package tests.heroCard;

import base.BaseURLs;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HideHeroCardTest extends BaseTest{
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
        hero.preconditions();// hero card is visible

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


        // select edit dashboard


        // choose to hide the hero card and save => the hero card should be hidden from the home page and the cog should now appear next to the home menu item


    }
}
