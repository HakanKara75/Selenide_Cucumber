Feature: js executor
  @scrollwithjs
  Scenario: js executor
    Given kullanici "https://www.amazon.com" adresine gider
    And 3 saniye bekler
    And tum ekran goruntusunu alir
    And footer elementi gorunur sekilde goster
    And 3 saniye bekler
    And tum ekran goruntusunu alir
    Then sayfayi acik tutar