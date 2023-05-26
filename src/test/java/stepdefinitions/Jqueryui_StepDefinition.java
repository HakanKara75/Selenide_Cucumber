package stepdefinitions;


import io.cucumber.java.en.*;
import pages.JqueryuiPage;

import static com.codeborne.selenide.Selenide.actions;
import static org.junit.Assert.assertTrue;

public class Jqueryui_StepDefinition {

    JqueryuiPage jqueryuiPage=new JqueryuiPage();
    @Given("kullanici source elementini target elementine surukler")
    public void kullanici_source_elementini_target_elementine_surukler() {
        actions().dragAndDrop(jqueryuiPage.kaynak, jqueryuiPage.hedef).build().perform();


    }


    @And("kullanici source elementini {int} by {int} koordinatlarina surukler")
    public void kullaniciSourceElementiniByKoordinatlarinaSurukler(int arg0, int arg1) {

        actions().dragAndDropBy(jqueryuiPage.kaynak,  arg0, arg1)
                .build().perform();

    }

    @And("kullanici source elementini {int} by {int} koordinatlarina suruklendigini dogrular")
    public void kullaniciSourceElementiniByKoordinatlarinaSuruklendiginiDogrular(int arg0, int arg1) {


        String styleValue= jqueryuiPage.kaynak.getAttribute("style");
        System.out.println(styleValue);
        assertTrue(styleValue.contains(String.valueOf(arg0)) && styleValue.contains(String.valueOf(arg1) ));

    }
}
