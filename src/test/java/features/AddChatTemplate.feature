Feature: Create New Chat Template

  Scenario: User success create new chat template
    Given User can login using valid credentials
    And User can access Chat Template page
    When User click button Create New Template
    And input template name
    And User input text of bubble chat 1
    And User click button Add Bubble Chat
    And User click icon attachment
    And User input text of bubble chat 2
    And User replace the default template hotkey
    And User click button Create Template
    Then The new template success added

#  Scenario Outline: User click button Create New Template
#    Given User can login
#    * User can access Chat Template page
#    * There are no chat templates added yet
#    When User click button Create New Template
#    Then Appears pop-up Create New Chat Template
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
#    Scenario: User input template name
#      Given The form template name has been clicked
#      When User input 'Promo Produk'
#      Then Form template name displayed 'Promo Produk'
#
#      Scenario Outline: Add new text of bubble chat
#        Given The form bubble chat <Box> has been clicked
#        When User input <Text>
#        Then Box bubble chat <Box> displayed <Text>
#        And Part of Preview Template displayed bubble chat <Text>
#
#        Examples:
#          | Box | Text |
#          | 1 | Promo produk terbaru tahun ini |
#          | 2 | Produk 1, potongan harga 20ribu |
#
#        Scenario: Add new box bubble chat
#          Given Appears pop-up Create New Chat Template
#          When User click button Add Bubble Chat
#          Then Appears new box bubble chat in the part of Editorial Template
#
#          Scenario: Add attachment of bubble chat 2
#            Given Button Add Bubble Chat has been clicked
#            When User click icon attachment
#            * click image option
#            * choose an image
#            Then Choosen image was displayed in box bubble chat 2
#            And Preview part appears the choosen image
#
#            Scenario: Replace the Template Hokey
#              Given The default content was generated by system
#              And There is information that Hotkeys Available in green colour mode
#              When User replace the default content with 'Promo2024'
#              Then The form was displayed 'Promo2024'
#
#              Scenario: User save the new chat template
#                Given All of the content was added
#                And The button Create Template was enable in purple colour mode
#                When User click button Create Template
#                Then The pop-up was closed
#                And The new template success added
#                And Appears the table of Chat Template which consist the column of Name, Created Time, Hotkey, Guidebook, icon edit, icon delete