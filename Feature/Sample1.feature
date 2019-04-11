Feature: Application validation

	Scenario Outline: Login page validation
	Given user opens chrome browser and enters url
	When user enter "<user>" and "<password>"
	Then User click on login button
	Then User navigated in home page
	
	Examples:
	|user|password|
	|user1|pass5|
	|user2|pass6|