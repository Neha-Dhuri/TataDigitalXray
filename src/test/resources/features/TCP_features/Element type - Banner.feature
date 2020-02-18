#TCPAP-6
#Author: Neha Dhuri
@0.1

Feature: Functionality of Banner Elements of Homepage

Scenario outline 1: Verify that user can see all the banners when he redirects to Homepage
Given I sign-in to the TCP on Mobile/Website
When I navigate to Homepage
Then I should see <Banner>

Examples:
|Banner    |
|Loyalty   |
|Offers    |
|My profile|


Scenario outline 2: Verify that user should able to redirect to respective feature landing page on clicking the banner
Given I sign-in to the TCP on Mobile/Website
And I navigate to Homepage
When I click on <banner>
Then I should redirect to respective feature landing page

Examples:
|Banner    |
|Loyalty   |
|Offers    |
|My profile|


Scenario outline 3: Verify that user can see respective alternate text of banner if banner image is not loaded due internet issues
Given I sign-in to the TCP on Mobile/Website
And network issues occur
When I navigate to Homepage
Then I should see respective alternate text of <Banner> instead of image

Examples:
|Banner    |
|Loyalty   |
|Offers    |
|My profile|

