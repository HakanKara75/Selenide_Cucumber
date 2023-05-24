@iframe
  Feature: iframe _ windows
    Scenario: TC01 iframe ve window
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=iframe" adresine gider
      And 3 saniye bekler
      And switch to frame 1
      And 3 saniye bekler
      And kullanici bank to techproeducation.com linkine tiklar
      And 3 saniye bekler
      And kullanici acilan sayfaya gecer
      And 3 saniye bekler
      And sayfanin url sini al
      And reklami kapat
      And 3 saniye bekler
