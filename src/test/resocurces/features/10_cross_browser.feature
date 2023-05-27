@crossbrowser
  Feature: cross browser
    @headless
    Scenario: TC01 headless
      Given kullanici browser tipini "headless" olarak secer
      Given kullanici "https://www.amazon.com" adresine gider
      And tum ekran goruntusunu alir

    @firefox
    Scenario: TC01 firefox
      Given kullanici browser tipini "firefox" olarak secer
      Given kullanici "https://www.amazon.com" adresine gider
      And tum ekran goruntusunu alir

    @safari
    Scenario: TC01 safari
      Given kullanici browser tipini "edge" olarak secer
      Given kullanici "https://www.amazon.com" adresine gider
      And tum ekran goruntusunu alir

    @sdhshgsdf
    Scenario: TC01 sdhshgsdf
      Given kullanici browser tipini "sdhshgsdf" olarak secer
      Given kullanici "https://www.amazon.com" adresine gider
      And tum ekran goruntusunu alir