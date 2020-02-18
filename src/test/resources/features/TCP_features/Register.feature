Feature: To verify registration functionality

Scenario: Verify that validation message is displayed when minimum 2 characters are not entered in first name/last name field
Given new user sign-in to TCP mobile app/website
When I entered one character in First_name and Last_name
Then enter Email_id
Then enter date_of_birth
And I clicked on save button