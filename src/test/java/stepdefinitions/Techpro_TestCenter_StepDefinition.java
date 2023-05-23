package stepdefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Techpro_TestCenter;

import static com.codeborne.selenide.Condition.*;

public class Techpro_TestCenter_StepDefinition {

   Techpro_TestCenter techproTestCenter= new Techpro_TestCenter();
    @And("kullanici adini gir")
    public void kullaniciAdiniGir() {
    techproTestCenter.kullaniciAdi.setValue("techproed");

    }

    @And("kullanici sifresini gir")
    public void kullaniciSifresiniGir() {
    techproTestCenter.kullaniciSifresi.setValue("SuperSecretPassword");
    }

    @When("submit butonuna tikla")
    public void submitButonunaTikla() {
    techproTestCenter.submitButonu.click();
    }

    @Then("giris yapildigini test et")
    public void girisYapildiginiTestEt() {
     techproTestCenter.girisMesaji.shouldBe(visible);
    }


 @And("{string} secili degilse sec")
 public void seciliDegilseSec(String text) {
     if(text.equals("Checkbox 1") && !techproTestCenter.checkBox1.isSelected()) {
      techproTestCenter.checkBox1.click();
      techproTestCenter.checkBox1.shouldBe(checked);
     } if (text.equals("Checkbox 2") && !techproTestCenter.checkBox2.isSelected()) {
      techproTestCenter.checkBox2.shouldNotBe(checked); //secili olmadigini test et
      techproTestCenter.checkBox2.click();
      techproTestCenter.checkBox2.shouldBe(checked);
     }
     if(text.equals("Red") && !techproTestCenter.red.isSelected()) {
      techproTestCenter.red.shouldNotBe(checked); //secili olmadigini test et
      techproTestCenter.red.click();
      techproTestCenter.red.shouldBe(checked);
     }
  if(text.equals("Football") && !techproTestCenter.football.isSelected()) {
   techproTestCenter.football.click();
   techproTestCenter.football.shouldBe(checked);
  }
 }
}
