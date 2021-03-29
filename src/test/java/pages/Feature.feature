Feature: deneme feature

  @test1
  Scenario: deneme

    Given user on hamepage
    When  user search for "mac"
    Then  the products should be appear
