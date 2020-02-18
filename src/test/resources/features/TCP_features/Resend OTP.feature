#TCPAP-5
#Author: Neha Dhuri
@0.1

Feature: To verify functionality of Resend OTP

Scenario 1: Verify that timer of 20 seconds starts when user clicks on Get OTP button
Given TCP app is launched on mobile/web
And Valid number is entered with respect to country code
When I clicked on 'Get OTP' button
Then OTP field should be displayed with timer of 20 seconds


Scenario 2: Verify Resend OTP button should be disabled till timer reaches to 00:00
Given TCP app is launched on mobile/web
And Valid number is entered with respect to country code
And I clicked on 'Get OTP' button
When I clicked on 'Get OTP' button
And OTP field is displayed with timer of 20 seconds
Then Resend OTP button should be disabeld till timer reaches to 00:00


Scenario 3: Verify Resend OTP button should be enabled after timer reaches to 00:00
Given TCP app is launched on mobile/web
And Valid number is entered with respect to country code
And I clicked on 'Get OTP' button
When I clicked on 'Get OTP' button
And OTP field is displayed with timer of 20 seconds
And timer of 20 seconds has expired
Then Resend OTP button should be enabled


Scenario 4: Verify that timer resets to 20 seconds and Resend OTP button becomes disabled when 'Resend OTP' button is clicked
Given TCP app is launched on mobile/web
And Valid number is entered with respect to country code
And I clicked on 'Get OTP' button
And I clicked on 'Get OTP' button
And OTP field is displayed with timer of 20 seconds
And timer of 20 seconds has expired
When 'Resend OTP' button is clicked 
Then timer should to reset to 20 seconds 
And Resend OTP button should be disabeld


Scenario 5: Verify that timer keeps runnning till user enters last digit of OTP
Given TCP app is launched on mobile/web
And valid number is entered with respect to country code
When I clicked on 'Get OTP' button
And OTP field is displayed with timer of 20 seconds
Then timmer should keep runnning till user enters last digit of OTP


Scenario 6: Verify that user can navigate back to enter mobile number page and can modify the number after clicking on resend OTP
Given TCP app is launched on mobile/web
And valid number is entered with respect to country code
And I clicked on 'Get OTP' button
And I clicked on 'Resend OTP' button
When I navigate back to enter mobile number page
And Mobile number is updated
Then mobile number should be updated


















