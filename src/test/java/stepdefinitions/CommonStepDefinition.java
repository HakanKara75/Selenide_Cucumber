package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CommonStepDefinition {
    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
              open(string); //Driver class islevi gorur
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int int1) {
        //selenide default 4 saniye bekler. bundan fazlasi icin asagidaki metot kullanilir
        sleep(int1*1000);
    }

    @Then("onceki sayfaya gider")
    public void oncekiSayfayaGider() {
        back();
    }

    @Then("sonraki sayfaya gider")
    public void sonrakiSayfayaGider() {
        forward();
    }

    @Then("sayfayi yeniler")
    public void sayfayiYeniler() {
        refresh();
    }

    @Then("sayfayi acik tutar")
    public void sayfayiAcikTutar() {
        //varsayilan selenide ayarinda browser otomatik kapanir

        Configuration.holdBrowserOpen=true;
    }

}
