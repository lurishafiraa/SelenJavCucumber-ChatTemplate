Feature: Load and Edit Existing Template

  Scenario: Loaded existing template
    Given User can login using valid credentials
    * User has created chat template
    When User click button New Template
    * User click button Load Existing
    * User click existing template option
    * User edit the form bubble chat 1
    * User click button Edit Template
    Then The pop-up was closed

#  Scenario Outline: Loaded existing template
#    Given User has created chat template 'Promo produk'
#    And User can access chat template page
#    When User click button New Template
#    Then Appears pop up Create New Chat Template
#    And There are part <Editorial> Template and <Preview> Template
#
#    Examples:
#      | Editorial                  | Preview                        |
#      | input form Template Name   | blank box                      |
#      | button Load Existing       | blank box                      |
#      | bubble box chat 1          | blank box                      |
#      | button Add Bubble Chat     | blank box                      |
#      | button Wait For Second     | blank box                      |
#      | input form Template Hotkey | disable button Create Template |
#
#    Scenario: User access Load Existing feature
#      Given The chat template 'Promo produk' has created
#      When User click button Load Existing
#      Then Appears the option of list chat template that added
#
#      Scenario: User choose the chat template
#        Given The Load Existing button has clicked
#        And The option of list chat template was displayed
#        When User click 'Promo produk' option
#        Then The pop-up of Create New Chat was filled according to the 'Promo produk' template
#        And The Create Template button was replaced with Edit Template
#
#        Scenario: User edit existing template
#          Given The pop-up of Create New Chat was filled according to the 'Promo produk' template
#          When User edit 'Promo terbaru tahun 2024' in the form bubble chat 1
#          Then Box bubble 1 was displayed the message 'Promo terbaru tahun 2024'
#          And The Preview part appears bubble chat 1 with the message 'Promo terbaru tahun 2024'
#
#          Scenario: User save the updated template
#            Given The content of existing template was updated
#            When User click button Edit Template
#            Then The pop-up was closed
#            And The template 'Promo Produk' success update with the bubble chat 1 appears the message 'Promo terbaru tahun 2024'