Feature: Edit template name and hotkey

  Scenario: User update name and hotkey
    Given User can login using valid credentials
    * User has created chat template
    When User click button New Template
    * User click button Load Existing
    * User click existing template option
    * User edit the form of template name
    * User edit the form of hotkey
    * User click button Create Template
    Then The pop-up was closed

#  Scenario: User update Template Name and Hotkey
#    Given Appears the pop-up Create New Chat Template
#    * The Load Existing button has clicked
#    * Choose the template of 'Promo produk'
#    * The pop-up of Create New Chat was filled according to the 'Promo produk' template
#    When User edit 'Promo baru 2024' in the form of template name
#    And User edit 'Promobaru2024' in the form of template hotkey
#    Then Form template name was updated as 'Promo baru 2024'
#    And Form template hotkey was updated as 'Promobaru2024'
#
#    Scenario: User save the updated template name and hotkey
#      Given The content of template name and hotkey was updated
#      When User click button Create Template
#      Then The pop-up was closed
#      * The new template success added based on updated template name and hotkey
#      * The template of 'Promo produk' still exist on the table of list template
#      * The updated template was added on the table which consist of template name, created time, hotkey, guidebook, action edit and delete