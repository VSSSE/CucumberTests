@soundtracks
Feature: Look up soundtracks
  As a user
  I want to enter a movie title
  So that I can get the list of soundtracks corresponding to the movie title


  Scenario Outline: Soundtracks were found
    Given    I'm at the start page
    When    I enter a movie title "<title>"
    And    I press the search soundtracks button
    Then    I get a list of soundtracks

    Examples:
      | title          |
      | Scott Pilgrim VS. the World |


  Scenario Outline: No soundtracks were found
    Given    I'm at the start page
    When    I enter a movie title "<title>"
    And    I press the search soundtracks button
    Then    I see the message "<message>"

    Examples:
      | title                   | message                                   |
      | A movie that does not exist | No soundtracks where found for this movie |
		
		
