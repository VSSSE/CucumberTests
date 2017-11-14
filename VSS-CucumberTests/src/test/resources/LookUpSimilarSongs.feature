Feature: Look up similar songs
	As a user
	I want to get a list of similar songs to a given soundtrack
	
	Scenario: Similar songs found
	Given Soundtrack was found in the database
	When User presses the show similar songs button
	Then User gets a list of similar songs
	
	

	Scenario: No similar songs found
	Given Soundtrack was not found in the database
	When  User presses the show similar songs button
	Then User gets the message
	
	
	