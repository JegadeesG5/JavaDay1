Feature: Verifying booking in Adactin Hotel

  Scenario Outline: Verifying hotel booking in Adactin Hotel
    Given User Should be a Adactin Homepage with help of browser
    And User should be a login the Adactin Hotel  "<userName>"  "<password>"
    Then User should be verifying the username "Hello Jegan123!"
    

    Examples: 
      | userName | password |
      | Jegan123 | ID6383   |
