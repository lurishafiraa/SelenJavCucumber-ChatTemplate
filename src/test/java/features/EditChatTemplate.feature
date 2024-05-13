Feature: Edit Chat Template

  Scenario: User edit existing template
    Given User can login using valid credentials
    * User has created chat template
    When User click icon edit
    * User edit the form of template name
    * User edit the form of bubble chat 1
    * User edit the form of hotkey
    * User click button Save Template
    Then The pop-up was closed

#  Scenario Outline: User edit the existing chat template
#    Given User can access the page of Chat Template
#    * There are lists of existing template on the table
#    * There are action column that consists of icon edit and delete
#    When User click icon edit in the row of 'Promo produk'
#    Then Appears the pop-up of Edit Template
#    * The pop-up was filled according to the 'Promo produk' template
#    * Bubble chat <Box> was filled <Message>
#    * The form of hotkey was filled 'Promo2024'
#    * There is button Save Template
#
#    Examples:
#      | Box | Message                                   |
#      | 1   | Promo produk terbaru tahun ini            |
#      | 2   | [image] + Produk 1, potongan harga 20ribu |
#
#    Scenario: User update and save the existing chat template
#      Given The pop-up was filled according to the 'Promo produk' template
#      When User edit 'Promo produk baru spencers' in the template name
#      * User edit 'Promo produk spencers tahun ini' in the form of bubble chat 1
#      * User edit 'PromoSpencers2024' in the form of hotkey
#      * User click button Save Template
#      Then The pop-up was closed
#      And The template of Promo Produk was updated as 'Promo produk baru spencers'
#      And Appears the updated template on the table that consists of template name, created time, hotkey, guidebook, action column


