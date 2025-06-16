package tests.heroCard;

public class CXT1341 {
    /*

CX-T1341	Weekly Build Smoketest - Hero Card - Select Cog drop down - WEB - All Environments
Goal: The Cog Drop down should display the correct options.

Description:  The cog item in the top of the hero card should have 3
options.  1)  Video Clips 2) Activity 3) Edit Dashboard.  Clicking the
video clips option will change the hero card to have the video clips card
with an option to select highlights in the bottom left. Clicking activity
will change the hero card to have the activity graph displayed. Clicking
the edit dashboard link will navigate to the edit dashboard screen. 

Preconditions: Linked preconditions

    * Precondition 1: Account does not has access to highlights
    * Precondition 2: Account has activity
    * Note that there should be a clear demarcation when no preconditions
      are needed.

Login Page URL: 

Test:  <https://alarm.test-us.adcinternal.com/>

Prod: <https://alarm.com/>

Accounts:

TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
	Login	Verify the home page loads
			select the cog in the top right corner of the hero card	Verify the 3 drop down options:1) Video Clips2) Activity3) Edit Dashboard
			select the video clips option	verify the hero card changes to the video clips and the highlights icon
appears in the bottom left
			select the cog	Verify the 3 drop down options:1) Video Clips2) Activity3) Edit Dashboard
			select activity	verify the activity hero card is now displayed
			select the cog	Verify the 3 drop down options:1) Video Clips2) Activity3) Edit Dashboard
			select edit dashboard	Verify the edit dashboard page has been loaded
			select cancel	Verify the user is on the home page with the activity graph

     */
}
