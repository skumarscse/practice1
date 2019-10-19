Feature: Home page features 

Scenario: Verify tabs in homepage
	Given Launch application 
	When Women dresses tshirts tabs are displayed 
	Then Validate tabs are present 
	
Scenario: Verify tabs in homepage  
	When Navigate women dresses and tshirts tabs 
	Then Validate tabs are navigated 
	
Scenario: Email subscription in homepage  
	When Enter email and click submit 
	Then Display subscription message
	
Scenario: Verify sizes displayed in dress page
	When Click on dress tab
	Then Validate S M L are visible
	
Scenario: Verify twitter and short description
	When twitter is displayed
	Then short description displayed
	
Scenario: Add first product and verify its added to cart
	When first product is added
	Then verify first product is added to cart