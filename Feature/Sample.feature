Feature: Application validation

	Scenario Outline: Login page validation
	Given user opens chrome browser and enters url
	When user enters "<user>" and "<password>"
	Then User clicks on login button
	Then User lands in home page
	
	Examples:
	|user|password|
	|username1|password|
	|username2|password|
	
	