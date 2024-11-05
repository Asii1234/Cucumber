@login1
Feature: To Validate the Login Functionaly of Facebook Application
Background:
Given  User Have to Open The FaceBook Application Through ChromeBrowser

@smoke
Scenario: To Validate The Logic Functionality of valid userName and InValid Passsword
When  User Have to pass the Valid UserName and InValid password
 |smartskillstechnologies@gmail.com |sstech@123 |capgemeini@gmail.com|cap@123|
And  User Have To Click the Login button

@sanity
Scenario: To Validate The Logic Functionality of Invalid userName and InValid Passsword
When  User Have to pass the InValid UserName and InValid password
  |samrtskillestechnologies@gmail.com|sstech@123|
  |capgemeini@gmail.com|cap@123|
  |infosys123@gmail.com|info@123|
  
And  User Have To Click the Login button

@resgression
Scenario: To Validate The Logic Functionality of Invalid userName and Valid Passsword
When  User Have to pass the InValid UserName and Valid password
 |username|smartskillstechnologies123@gmail.com|
 |password|sstech@123|

And  User Have To Click the Login button


@sanity
Scenario: To Validate The Logic Functionality of valid userName and Valid Passsword
When  User Have to pass the Valid UserName and Valid password
 |username|password|
 |smartskills@gmail.com|smart@123|
 |Hcl123@gmail.com|hcl@123|
 |capgemini123@gmail.com|cap@123|

And  User Have To Click the Login button
























