@alert
  Feature: alert
    Scenario: TC01 alert
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=javascript-alerts" adresine gider
      And kullanici prompt butonuna tiklar
      And 3 saniye bekler
      And kullanici alerte "Hello" metnini yazar ve OK e tiklar
      And 3 saniye bekler
      Then kullanici sonucun "Hello" icerdiğini dogrular
      And 3 saniye bekler
