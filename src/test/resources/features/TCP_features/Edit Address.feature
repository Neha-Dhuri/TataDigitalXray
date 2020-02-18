#TCPAP-25
#Author: Neha Dhuri
@0.2
Feature:  User redirects to the Edit Address page on clicking 'Edit Address' link

Scenario 1: Verify that user redirects to the Edit Address page on clicking 'Edit Address' link
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
When I click on "Edit Address" link
Then I should redirect to "Edit Address" page
And I should see prepopulated "Flat no" field
And I should see prepopulated "Address" field
And I should see prepopulated "Landmark" field
And I should see corresponding tag is pre-selected
And I should see "Save" button
And I should see "Cancel" button


Scenario 2: Verify that both Address name and mobile number fields are displayed with prepopulated data when custom tag is pre-selected on Edit Address page
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I added new address with custom tag
When I clicked on Edit button of custom address
Then I should redirect to "Edit Address" page
And I should see custom tag is pre-selected
And Address name and Mobile number field should be displayed
And Address name and Mobile number field should be prepopulated


Scenario Outline 3: Verify that user can modify all the fields of 'Edit Address' page
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Edit Address" link
When I click on <FieldName> field
Then I should be able to enter in <FieldName> field

Examples:
|Field Name|
|Flat No   |
|Address   |
|Landmark  |


Scenario Outline 4: Verify that Address is updated when user clicks on Save button
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Edit Address" link
When I enter <Flat No> in "Flat No" field
And I enter <Address> in "Address" field
And I enter <Landmark> in "Landmark" field
And I click on "Save" button
Then Address should be saved with the new details

Examples:
|FlatNo|Address  |Landmark  |
|101   |Address 1|Landmark 1|


Scenario Outline 5: Verify that Address is not updated when user clicks on Cancel button
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Edit Address" link
When I enter <Flat No> in "Flat No" field
And I enter <Address> in "Address" field
And I enter <Landmark> in "Landmark" field
And I select the another non-custom tag
And I click on "Cancel" button
Then Address should be not saved with the new details

Examples:
|FlatNo|Address  |Landmark  |
|101   |Address 1|Landmark 1|


Scenario 6: Verify that user is not allowed to save blank data
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Edit Address" link
When I cleared "Flat No" field
And I cleared "Address" field
And I cleared "Landmark" field
And I click on "Save" button
Then Address should not be saved
And I should see a error message


