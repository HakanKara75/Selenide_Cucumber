
  Feature: cross browser
    @headless
    Scenario: TC01 headless
      Given kullanici browser tipini "headless" olarak secer
      Given kullanici "https://www.amazon.com" adresine gider
      And tum ekran goruntusunu alir

    @headless2
    Scenario: TC01 firefox
      Given kullanici browser tipini "firefox" olarak secer
      Given kullanici "https://www.amazon.com" adresine gider
      And tum ekran goruntusunu alir

    @headless3
    Scenario: TC01 safari
      Given kullanici browser tipini "edge" olarak secer
      Given kullanici "https://www.amazon.com" adresine gider
      And tum ekran goruntusunu alir