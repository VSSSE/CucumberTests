@run
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
      | 22 Jump Street |
      | Jurassic Park  |


  Scenario Outline: No soundtracks were found
    Given    I'm at the start page
    When    I enter a movie title "<title>"
    And    I press the search soundtracks button
    Then    I see the message "<message>"

    Examples:
      | title                   | message                                   |
      |                         | No title entered                          |
      | #+ThisMovie do notExist | No soundtracks where found for this movie |
		
		
