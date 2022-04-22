@Step2
Feature: To validate the create your account functionality gmail application

Scenario Outline: To validate the create your account functionality of gmail step2 application
Given The user should be in create your account page
When The user has to fill valid "<firstname>" "<lastname>" and "<username>"
And The user has to fill valid "<password>" and "<confirmpassword>"
And The user has to click show password
Then The user has to click next step

Examples:
| firstname | lastname | username | password | confirmpassword |
|aravinthan | arumachalam | aravind25th | Aravinth789654 | Aravinth789654 |