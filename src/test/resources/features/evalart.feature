Feature: have a test

  @testEvalart
  Scenario: i need to resolve an evalart test
    Given i enter to evalart test
    When resolve the automation
    Then i get the hash code

  @testEvalart1
  Scenario: i need to resolve an evalart test1
    Given i enter to evalart test
    When resolve the automationuno
    Then i get the hash code



  @testEvalart2 @testEvalart1
  Scenario: i need to resolve an evalart test2
    Given i enter to evalart test
    When resolve the automationdos
    Then i get the hash code

  @testEvalart4
  Scenario: i need to resolve an evalart test4
    Given i enter to evalart test
    When resolve the automationcuatro
    Then i get the hash code

