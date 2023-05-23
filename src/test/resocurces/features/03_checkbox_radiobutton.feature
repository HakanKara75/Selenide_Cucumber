Feature: checkbox ve radio button
  @checkbox
  Scenario: TC01 checkbox
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes" adresine gider
    And 3 saniye bekler
    And "Checkbox 1" secili degilse sec
    And 3 saniye bekler
    And "Checkbox 2" secili degilse sec
    And 3 saniye bekler
  @radio
  Scenario: TC01 radio
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
    And 3 saniye bekler
    And "Red" secili degilse sec
    And 3 saniye bekler
    And "Football" secili degilse sec
    And 3 saniye bekler