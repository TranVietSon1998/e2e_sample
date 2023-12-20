Feature:  The first test case
@Test
  Scenario: The first test case
#Step 1: Login and get orders from dispatch
    When User navigate to setting page
    And User change language to "English"
    And User input  test user with "U903634"
    And User navigate back to landing page
#    And User swipe down to get the list of orders

#  #Step 2: Go to detail orders --> fullfill --> verify data
#    When User go to detail of "Standard Expertise" order
#    Then User verify list of menu
#    | Claim & Insurance |
#    | Vehicle data      |
#    | Costs             |
#    | Deductions        |
#    | Claim photos      |
#    | Additional report |
#  When User navigate to Vehcile data tab
#  When At Vehicle owner section, user enter all information and save data to test context
#    | Fist name | Last name | Street and house number | Zip code | Place  | Country | e-Mail           | Mobile     | Phone      |
#    | Tran Viet | Son       | 730 le duc tho          | 012      | Go Vap | CH      | son.tran@mobi.ch | 0932191045 | 0898752198 |
#Then User verify data of Vehicle owner section
#  | Fist name | Last name | Street and house number | Zip code | Place  | Country | e-Mail           | Mobile     | Phone      |
#  | Tran Viet | Son       | 730 le duc tho          | 012      | Go Vap | CH      | son.tran@mobi.ch | 0932191045 | 0898752198 |





