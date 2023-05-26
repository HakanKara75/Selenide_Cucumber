
  Feature: explicit wait
@explicitwait
  Scenario: explicit wait
    Given kullanici "https://the-internet.herokuapp.com/dynamic_loading/1" adresine gider
    And start butonuna tikla
    Then kullanici "Hello World!" metnini dogrular