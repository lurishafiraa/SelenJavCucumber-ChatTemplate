Feature: Hotkey Validation

  Scenario: User replace the hotkey using the same hotkey as in the other template
    Given User can login using valid credentials
    * User has created chat template
    When User click icon edit
    * User edit the form of hotkey
    * User click button Save Template
    Then Failed to save the updated template


#  Scenario Outline: User edit the existing chat template
#    Given User can access the page of Chat Template
#    * There are lists of existing template on the table
#    * There are action column that consists of icon edit and delete
#    When User click icon edit in the row of 'Promo baru 2024'
#    Then Appears the pop-up of Edit Template
#    * The pop-up was filled according to the 'Promo baru 2024' template
#    * Bubble chat <Box> was filled <Message>
#    * The form of hotkey was filled 'Promobaru2024'
#    * There is button Save Template
#
#    Examples:
#      | Box | Message                                   |
#      | 1   | Promo produk terbaru tahun ini            |
#      | 2   | [image] + Produk 1, potongan harga 20ribu |
#
#  Scenario: User replace the hotkey using the same hotkey as in the other template
#    Given Appears the pop-up of Edit Template
#    And The pop-up was filled according to the 'Promo baru 2024' template
#    When User edit 'Promo Spencers 2024' in the form of hotkey
#    Then Appears the error validation with red highlight in the form of hotkey
#    And Appears the information 'Hotkey Already Exist'
#
#    Scenario: Save the error template hotkey
#      Given Update the existing template using the same hotkey as in the other template
#      And Appears the error validation with red highlight in the form of hotkey
#      When User click button Save Template
#      Then The button Save Template was disabled
#      And The pop up wasnt auto closed
#      And Failed to save the updated template



