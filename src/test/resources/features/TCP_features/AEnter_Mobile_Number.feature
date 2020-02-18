Feature: To verify functionality of mobile number field on login page

Background:
Given TCP app is launched

Scenario: Verfiy that user is able to select country code from dropdown
When user clicks/taps on Country code field
And selcts the country code
Then selected country code should be displayed in Country code field

Scenario: Verify that Enter OTP field should be displayed when valid number is entered
When user enters valid number with respect to country code
And clicks on  Get OTP buttontwo
Then Enter Otp field should be displayed
When I entered one character in First_name and Last_name
Then enter Email_id
Then enter date_of_birth
And I clicked on save button

Scenario: Verify the collect Offer in Offers Page
Then I click on Offers button
Then I Click On Offline offer 
Then Click on Collect Offer
And Click on Stores NearBy

Scenario: Verify once user navigates to any particular transaction, he should be able to see perticular transaction history
Then landed to Loyalty Page

Scenario: should be able to see loylity redemption
Then I click on loylity redemption


