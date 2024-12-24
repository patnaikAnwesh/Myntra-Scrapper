

Feature: Myntra T-shirt Scraper
  As a user
  I want to scrape Van Heusen T-shirts from Myntra
  So that I can find the best discounts

  Scenario: Scrape discounted Van Heusen T-shirts
    Given I am on the Myntra homepage
    When I hover over the Men category
    And I click on T-shirts section
    And I filter for Van Heusen brand
    Then I should see a list of discounted Van Heusen T-shirts
    And the T-shirts should be sorted by discount percentage
