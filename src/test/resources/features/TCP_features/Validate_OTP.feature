#TCPAP-4
#Author: Neha Dhuri
@0.1

Feature: To check validate OTP functionality

Scenario 1: Verify that otp is started to validate when user enters last digit of OTP
Given TCP app is launched on web/Mobile
And user has selected country code
And user has entered mobile number 
And user has clicked on 'Get OTP' button
When user enters last digit of OTP in OTP field
Then otp should start to validate


Scenario 2: Verify that when user enters valid OTP then he should redirect to respective page
Given TCP app is launched on web/Mobile
And user has selected country code
And user has entered mobile number 
And user has clicked on 'Get OTP' button
When user enters last digit of OTP in OTP field
Then respective page should be displayed


Scenario 3: Verify respective error message should be displayed if user enters invalid/incorrect OTP
Given TCP app is launched on web/Mobile
And user has selected country code
And user has entered mobile number 
And user has clicked on 'Get OTP' button
When user enters invalid OTP in OTP field
Then respective error message should be displayed

#Specific to android
Scenario 4: Verify that OTP is entered automatically when it is received via SMS
Given TCP app is launched on web/Mobile
And user has selected country code
And user has entered mobile number 
And user has clicked on 'Get OTP' button
When user received OTP on mobile via SMS
Then OTP should be entered automatically in OTP field
And otp should start to validate