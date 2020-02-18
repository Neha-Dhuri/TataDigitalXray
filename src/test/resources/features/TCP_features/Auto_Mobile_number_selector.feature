#TCPAP-9
#Author: Neha Dhuri
@0.1
#Specific to Aandroid

Feature: To check functionality of auto mobile selector on android

Scenario 1: Verify that list of user's existing numbers linked to googgle and 'None of the Above' option should be displayed when user opens the TCP app on android
Given app should be installed on Android
When app is launched 
Then login page should be displayed
And list of user's existing numbers linked to googgle and 'None of the Above' option should be displayed


Scenario 2: Verify that selected number is entered in mobile number field when user clicks on any number from the list of existing numbers linked to google
Given App is launched
And list of user's existing numbers linked to googgle and 'None of the Above' option is displayed
When user selects any number
Then selected number should be entered in mobile number field


Scenario 3:Verify that number field should be blank when 'none of the above' option is selected
Given App is launched
And list of user's existing numbers linked to googgle and 'None of the Above' option is displayed
When user selects the option 'None of the above'
Then list should be closed 
And mobile number field should be blank


Scenario 4: Verify that mobile number can be edited in mobile number field if number is selected from auto populated list
Given App is launched
And list of user's existing numbers linked to googgle and 'None of the Above' option is displayed
When user selects any number
Then selected number should be entered in mobile number field
And user is able to edit the mobile number

