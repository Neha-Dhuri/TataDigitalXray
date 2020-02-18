Feature: Test Set Registration

	
	@TEST_TADI-8 @TESTSET_TADI-7
	Scenario: To verify registration functionality
		Given I am a new user 
		And I signed-in to TCP mobile app/website
		When I successfully validated OTP
		Then I should redirect to registration page
		
	@TEST_TADI-9 @TESTSET_TADI-7
	Scenario: Verify that user redirects to homepage when he fills all mandatory fields and clicks on 'Save' button
		Given Registration page is displayed
		When all the mandatory fields are filled
		And Save button is clicked
		Then Homepage should be displayed
