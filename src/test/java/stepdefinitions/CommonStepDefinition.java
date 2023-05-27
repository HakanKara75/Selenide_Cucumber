package stepdefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.xml.crypto.Data;

import java.util.Date;

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
        sleep(int1 * 1000);
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

        Configuration.holdBrowserOpen = true;
    }



    @Given("kullanici browser tipini {string} olarak secer")
    public void kullaniciBrowserTipiniOlarakSecer(String arg0) {

        switch (arg0) {
            case "headless":
                Configuration.headless = true;
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
            case "safari":
                Configuration.browser = "safari";
                break;
            case "opera":
                Configuration.browser = "opera";
                break;
            case "edge":
                Configuration.browser = "edge";
                break;
            default:
                Configuration.browser = "chrome";
                break;
        }
    }

    @And("tum ekran goruntusunu alir")
    public void tumEkranGoruntusunuAlir() {

        Selenide.screenshot(new Date().toString());
    }
}
