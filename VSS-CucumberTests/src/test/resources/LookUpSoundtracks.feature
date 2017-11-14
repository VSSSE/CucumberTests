Feature: Look up soundtracks 
	As a user
  I want to enter a movie title 
  So that I can get the list of soundtracks 
  

Scenario: Soundtracks were found in the database 
	Given User is on the start page 
	When User enters a movie title 
	And User presses the search button 
	Then User gets the list of songs
	
	
	Scenario: Soundtracks not found 
	Given    User is on the start page 
	When     User enters a movie title 
	And    User presses the search button 
	And    Soundtracks were not found in the database 
	Then    User gets the message
	
	
