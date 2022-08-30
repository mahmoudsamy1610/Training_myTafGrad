
Feature: UserRegistration
I want to check that the user can register in our e-commerce website


Scenario Outline: User needs to Register

Given the user should be in the home page
When he clicks on register link
When he enters user data "<FN>"  "<LN>"  "<Email>"  "<pass>"
Then the registeratoin page displayed successfully  


Examples:
|    FN       |LN        |Email            |pass         |
|mahmou12122d   |sa12223my   |s123222amy@gmail.com |1231234324   |
|mahmou122223d2 |sam12232y2  |samy2122232@gmail.com|12312234324  |
|mahmo123222ud3 |sam22132y3  |sam1223222y3@gmail.com|123134234324 |