@ekrangoruntusu
Feature:  sceenshots

  @tumekrangoruntusu
  Scenario: tum ekran goruntusuG
    Given kullanici "https://google.com" adresine gider
    And tum ekran goruntusunu alir

    @googleimage
    Scenario: belirli elemanin ekran goruntusu
      Given kullanici "https://google.com" adresine gider
      And google image goruntusunu alir

