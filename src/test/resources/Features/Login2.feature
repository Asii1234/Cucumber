@login2
Feature: To Validate the Login Functionaly of Facebook Application
@smoke
Scenario Outline:
  User Have To Validate The FaceBook Application with Different Compination
Given  User Have to Open The FaceBook Application Through ChromeBrowser
 When User Have To Pass The "<username>" and "<password>"
 And  User Have Click The Login button 
 

 Examples:
   
   |username|password|
   |capgemini123@gmail.com|cap@123|
   |hexaware123@gmail.com|hexa@123|
   |Infosys123@gmail.com|info@123|
   |smartskills123@gmail.com|smart@123|
   
   