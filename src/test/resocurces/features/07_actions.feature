
  Feature: actions
    @draganddrop
    Scenario: TC01 drag and drop
      Given kullanici "https://jqueryui.com/droppable/" adresine gider
      And switch to frame 1
      And 3 saniye bekler
      And kullanici source elementini target elementine surukler
      And 3 saniye bekler
      And kullanici source elementini 258 by 208 koordinatlarina surukler
      And 3 saniye bekler
      And kullanici source elementini 258 by 208 koordinatlarina suruklendigini dogrular
      Then sayfayi acik tutar


