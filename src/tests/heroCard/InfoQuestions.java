package tests.heroCard;

public class InfoQuestions {
    /*

IQ4EU_sv37522
Test@123456


    CX-T1265	Weekly Build Smoketest - Hero Card - Verify ability to play and pause highlights - WEB - All Environments
Goal: Verify ability to play and pause highlights

Preconditions: Linked preconditions
    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions are needed.
Accounts:
TEST: svauto_Saawsauce3/QEsaaw12
PROD: saawsauceprod1/QEsaaw123!
Login to an account that meets criteria- > the hero card should display highlights button in first slug of video reel
select highlights
play highlights ->	verify they play
pause highlights ->	verify they pause


CX-T1269	Weekly Build Smoketest - Hero Card - edit dashboard acts as a radio button - WEB - All Environments
Goal: verify edit dashboard options act as a radio button

Preconditions: Linked preconditions

    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions
      are needed.

Accounts:

TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
Login to an account that meets preconditions	the hero card should have a cog
Select the cog	observe the drop down: Video, Activity and edit hero card
select edit dashboard	observe that the dashboard can be rearranged
choose an option, hide, video, and activity	verify only one option can be saved (Behaves as a radio button)

CX-T1270	Weekly Build Smoketest - Hero Card - load past highlights - WEB - All Environments
	Goal: loading previous highlights

Description:  This test case will confirm the ability to go forward and
backwards within the highlights player. 

Preconditions: Linked preconditions

    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions
      are needed.

Login Page URL: 

Test:  <https://alarm.test-us.adcinternal.com/>

Prod: <https://alarm.com/>

Account:

TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
Login to an account that meets pre conditions	verify video clips with highlights gif in first video clip is there
			select highlights gif
			play highlights	verify highlights play
			select the back arrow	verify past highlights load and play
			select the back arrow	verify past highlights load and play
			select the forward arrow	verify the more recent highlights play.

CX-T1271	Weekly Build Smoketest - Hero Card - Drop down contains only 3 options - WEB - All Environments
	Goal:  Verify that the drop down only includes, edit, video clips and
activity graph when the account has highlights

Precondition 1:  Account has access to highlights
Precondition 2:  Account has activity for highlights

Accounts:

TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
	Login to an account that meets pre conditions	verify highlights is gif appears in video clips slugs
			select the cog to display the drop down	verify only 3 options: video, activity and edit

CX-T1276	Weekly Build Smoketest - Hero Card - Highlights fast forward button - WEB - All Environments
	Goal: Verify the fast forward options changes speed

Description:  changing the speed at which the highlights reel is played
at. 

Preconditions: Linked preconditions

    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions
      are needed.

Login Page URL: 

Test:  <https://alarm.test-us.adcinternal.com/>

Prod: <https://alarm.com/>

Account:

TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
	Login to an account that meets pre conditions
			click the highlights in the bottom left	Verify highlights play
			select 2.0 speed	verify and record time of reel.
			select 1.5 speed	verify and record time of reel is less then 2.0
			select 1.0 speed	verify and record time is less then 1.5.
CX-T1339	Weekly Build Smoketest - Hero Card - Cog drop down to hide hero card - WEB - All Environments
	Goal: Cog menu options with a SS account with video analytics camera
installed. Hide the hero card

Preconditions: Linked preconditions

    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions
      are needed

Accounts:

TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
Login to an account that meets pre conditions	the hero card should have a cog
			select the cog	observe the drop down: Highlights, Video, Activity and edit hero card
			select edit dashboard
			choose to hide the hero card and save	the hero card should be hidden from the home page and the cog should now
appear next to the home menu item

CX-T1340	Weekly Build Smoketest - Hero Card - Select Cog drop down and edit dashboard to change default - WEB - All Environments
	Goal: Cog menu options with a SS account with video analytics camera
installed. Change the default options.

Preconditions: Linked preconditions

    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions
      are needed.

Login Page URL: 

Test:  <https://alarm.test-us.adcinternal.com/>

Prod: <https://alarm.com/>

Account:

TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
Login to an account that meets preconditions	the hero card should have a cog
			select the cog	observe the drop down: Video, Activity and edit hero card
			select edit dashboard	observe that the dashboard can be rearranged
			Choose activity graph or video as default	observe that the default option is what is saved.
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

CX-T1345	Weekly Build Smoketest - Hero Card - Minimizing and Expanding the Hero Card - WEB - All Environments
	Goal: Expanding and minimizing the hero card

Description:  This test case will confirm the ability to minimize and
expand the hero card.  This is done through the top corner of the hero card
where a "-" and a "+" will appear based on the current state of the card. 
The + will be used to expand the card and the - will be used to minimize
the card.

Preconditions: Linked preconditions

    * Precondition 1: Account has access to highlights
    * Precondition 2: Account has activity for highlights
    * Note that there should be a clear demarcation when no preconditions
      are needed.

Login Page URL: 

Test:  <https://alarm.test-us.adcinternal.com/>

Prod:<https://alarm.com/>

Accounts:
TEST: svauto_Saawsauce3/QEsaaw12

PROD: saawsauceprod1/QEsaaw123!
Login to an account with a hero card	The home page should fully load with no issues.
			In the top of the hero card select the “-” symbol	this should minimize the hero card
			in the top of the hero card the “+” should now appear	this should expand the hero card to full size



























     */
}
