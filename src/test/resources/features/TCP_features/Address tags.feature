#TCPAP-26
#Author: Neha Dhuri
@0.2
Feature: Address tag functionality

Scenario Outline 1: Verify that Address tags are displayed on Add Address page
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
When I click on "Add New Address" button
Then I should redirect to "Address card" page
And I should see <TagName> address tag

Examples:
|TagName|
|Home   |
|Work   |
|Custom |


Scenario Outline 2: Verify that Address is tagged as Home/Work if new addres is saved with Home/Work tag
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
And I entered <FlatNo> in "Flat No" field
And I entered <Address> in "Address" field
And I entered <Landmark> in "Landmark" field
When I selected <TagName> in "Tag" field
And I clicked on "Save" button
Then user should be redirected to "Address card" page
And Addres should be saved with <TagName>

Examples:
|TagName|FlatNo|Address  |Landmark  |
|Home   |101   |Address 1|Landmark 1|
|Work   |201   |Address 2|Landmark 2|


Scenario 3: Verify that Additional fields are displayed if "Custom" tag is selected on Add address page
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
When I selected "Custom" tag
Then I should see "Address Name" field
And I should see "Mobile Number" field


Scenario 4: Verify that Additional fields are displayed if "Custom" tag is selected on Edit Address page
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Edit Address" button
When I selected "Custom" tag
Then I should see "Address Name" field
And I should see "Mobile Number" field


Scenario 5: Verify that address is displayed with respective address name if address is saved using 'Custom' tag
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
And I entered <FlatNo> in "Flat No" field
And I entered <Address> in "Address" field
And I entered <Landmark> in "Landmark" field
When I selected custom tag
And I entered Address name as "Fort House"
And I entered Mobile Number '9878457807'
And I clicked on "Save" button
Then user should be redirected to "Address card" page
And Address should be saved with address name as "Fort House"


Scenario Outline 6: Verify that address name should be updated as "Other" if new address is saved with same non-custom tag.
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
And I entered <FlatNo> in "Flat No" field
And I entered <Address> in "Address" field
And I entered <Landmark> in "Landmark" field
And I selected <TagName> in "Tag" field
And I clicked on "Save" button
And I click on "Add New Address" button
And I entered <NewFlatNo> in "Flat No" field
And I entered <NewAddress> in "Address" field
And I entered <NewLandmark> in "Landmark" field
And I selected <TagName> in "Tag" field
And I clicked on "Save" button
Then new address should be saved as <TagName>
And old address should be saved as "Others"

Examples:
|TagName|FlatNo|Address  |Landmark  |NewFlatNo|NewAddress   |NewLandmark   |
|Home   |101   |Address 1|Landmark 1|102      |New Address 1|New Landmark 1|
|Work   |201   |Address 2|Landmark 2|202      |New Address 2|New Landmark 2|


Scenario Outline 7: Verify that address name should be updated as "Other" if other existing address is updated with same non-custom tag.
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
And I entered <FlatNo> in "Flat No" field
And I entered <Address> in "Address" field
And I entered <Landmark> in "Landmark" field
And I selected <TagName> in "Tag" field
And I clicked on "Save" button
And I click on "Add New Address" button
And I entered <NewFlatNo> in "Flat No" field
And I entered <NewAddress> in "Address" field
And I entered <NewLandmark> in "Landmark" field
And I selected <OtherTagName> in "Tag" field
And I clicked on "Save" button
When I clicked on "Edit" button of Address having address name as <OtherTagName>
And I selected <TagName>
And I clicked on "Save" button
Then updated address should be saved as <TagName>
And old address should be saved as "Others"

Examples:
|TagName|FlatNo|Address  |Landmark  |NewFlatNo|NewAddress   |NewLandmark   |OtherTagName|
|Home   |101   |Address 1|Landmark 1|102      |New Address 1|New Landmark 1|Work        |
|Work   |201   |Address 2|Landmark 2|202      |New Address 2|New Landmark 2|Home        |


Scenario Outline 8: Verify that user can give duplicate address name using 'custom' tag while creating new address
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
And I entered <FlatNo> in "Flat No" field
And I entered <Address> in "Address" field
And I entered <Landmark> in "Landmark" field
And I selected "Custom" in "Tag" field
And I entered "<AddressName>" in "Address Name" field
And I clicked on "Save" button
And I click on "Add New Address" button
And I entered <NewFlatNo> in "Flat No" field
And I entered <NewAddress> in "Address" field
And I entered <NewLandmark> in "Landmark" field
And I selected "Custom" in "Tag" field
And I entered "<AddressName>" in "Address Name" field
And I clicked on "Save" button
Then new address should be saved as <AddressName>
And old address should be saved as "<AddressName>"

Examples:
|AddressName|FlatNo|Address  |Landmark  |NewFlatNo|NewAddress   |NewLandmark   |
|Fort House |101   |Address 1|Landmark 1|102      |New Address 1|New Landmark 1|


Scenario Outline 9: Verify that user can update the Tag Name on 'Edit Address' page
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
And I entered <FlatNo> in "Flat No" field
And I entered <Address> in "Address" field
And I entered <Landmark> in "Landmark" field
And I selected <TagName> in "Tag" field
And I clicked on "Save" button
And I clicked on "Edit" button of Address having address name as <TagName>
When I selected the "<NewTagName>"
And I modified "Flat No" field
And I modified "Landmark" field
And I modified "Address" field
And I clicked on "Save" button
Then address should be saved with new address name as <NewTagName>

Examples:
|TagName|FlatNo|Address  |Landmark  |NewTagName|
|Home   |101   |Address 1|Landmark 1|Work      |
|Work   |201   |Address 2|Landmark 2|Home      |


Scenario Outline 10:Verify that Home/Work address name is not modified when user saves another address with custom tag having address name as Home/Work
Given I sign-in to the TCP on Mobile/Website
And I navigate to "Address card" page
And I click on "Add New Address" button
And I entered <FlatNo> in "Flat No" field
And I entered <Address> in "Address" field
And I entered <Landmark> in "Landmark" field
And I selected <TagName> in "Tag" field
And I clicked on "Save" button
And I click on "Add New Address" button
And I entered <NewFlatNo> in "Flat No" field
And I entered <NewAddress> in "Address" field
And I entered <NewLandmark> in "Landmark" field
And I selected "Custom" in "Tag" field
And I entered "<TagName>" in "Address Name" field
And I clicked on "Save" button
Then new address should be saved as <TagName>
And old address should be saved as "<TagName>"

Examples:
|TagName|FlatNo|Address  |Landmark  |NewFlatNo|NewAddress   |NewLandmark   |
|Home   |101   |Address 1|Landmark 1|102      |New Address 1|New Landmark 1|
|Work   |201   |Address 2|Landmark 2|202      |New Address 2|New Landmark 2|




