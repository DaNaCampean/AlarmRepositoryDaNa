package tests.heroCard;

import base.BaseURLs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayAndPauseHighlightsTest extends BaseTest {
    /*

CX-T1265	Weekly Build Smoke test - Hero Card - Verify ability to play and pause highlights - WEB - All Environments
Goal: Verify ability to play and pause highlights

Preconditions: Linked preconditions
    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions are needed.

Login to an account that meets criteria- > the hero card should display highlights button in first slug of video reel
select highlights
play highlights ->	verify they play
pause highlights ->	verify they pause

     *///p[text()='Highlights'].click

    @Test

    public  void login(){
        BaseURLs.goToCustomerSiteURL();

        login.signInWithCredentials("IQ4EU_sv37522", "Test@123456");
        Assert.assertEquals(hero.getText(), "Highlights", "Verified that the Highlights text is available");
        System.out.println("STEP 1 - Passed - Highlights exists: " + hero.getText() );

        hero.highlightsClick();

        //hero.pauseClick();
        boolean check = hero.isPlaying();
        Assert.assertFalse(check, "Verified that the Video is playing");
        System.out.println("STEP 2 - Passed - Video is playing");

        hero.pauseClick();
        check = hero.isPlaying();
        Assert.assertTrue(check, "Verified that the Video is paused");
        System.out.println("STEP 3 - Passed - Video is paused");

        hero.playClick();
        check = hero.isPlaying();
        Assert.assertFalse(check, "Verified that the Video is playing");
        System.out.println("STEP 3 - Passed - Video is playing");


    }
}
