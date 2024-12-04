Feature: LogIn

  Background: Test Log In

  Scenario Outline: User can login correctly
    Given andres open my store site
    When andres go to my account section
    Then user wait for login form to be loaded


    When user logs in with user "<username>" and password "<password>"
    Then user should see log in status correctly

    Examples:
      | username                | password            |
      | af.castillo@globant.com | AaronCastillo2024** |
