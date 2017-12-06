@run
Feature: Look up similar songs
  As a user
  I want to get a list of similar songs to a given soundtrack


  Scenario Outline: Similar songs found
    Given I see the soundtracks list for the movie "<title>"
    When I click on the first soundtrack
    Then I see a list of similar songs


    Examples:
      | title         |
      | Jurassic Park |


  Scenario Outline: No similar songs found
    Given    I see the soundtracks list for the movie "<title>"
    When    I click on the first soundtrack
    Then    I see the message "<message>"

    Examples:
      | title      | message                                   |
      | aTestMovie | No similar song found for this soundtrack |
	
	
	