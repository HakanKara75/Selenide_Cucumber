package stepdefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Techpro_TestCenter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.url;

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

 @And("kullanici yil olarak {int} ay olarak {string} gun olarak {int} secer")
 public void kullaniciYilOlarakAyOlarakGunOlarakSecer(int yil, String ay, int gun) {
  sleep(3);
techproTestCenter.year.selectOptionByValue(String.valueOf(yil));
sleep(3);
techproTestCenter.month.selectOption(ay);
  sleep(3);
  techproTestCenter.day.selectOption(gun-1);
  sleep(3);

 }

    @And("kullanici prompt butonuna tiklar")
    public void kullaniciPromptButonunaTiklar() {
        techproTestCenter.prompt.click();
    }

    @And("kullanici alerte {string} metnini yazar ve OK e tiklar")
    public void kullaniciAlerteMetniniYazarVeOKETiklar(String arg0) {
        switchTo().alert().sendKeys(arg0);
        switchTo().alert().accept();
    }

    @Then("kullanici sonucun {string} icerdiğini dogrular")
    public void kullaniciSonucunIcerdiginiDogrular(String arg0) {
        techproTestCenter.result.shouldHave(text(arg0));
    }

    @And("switch to frame {int}")
    public void switchToFrame(int frame) {
        switchTo().frame(frame-1);

    }

    @And("kullanici bank to techproeducation.com linkine tiklar")
    public void kullaniciBankToTechproeducationComLinkineTiklar() {
        techproTestCenter.button.click();
    }

    @And("kullanici acilan sayfaya gecer")
    public void kullaniciAcilanSayfayaGecer() {
        switchTo().window(1);
    }

    @And("reklami kapat")
    public void reklamiKapat() {
        techproTestCenter.reklam.click();
    }

    @And("sayfanin url sini al")
    public void sayfaninUrlSiniAl() {
        System.out.println("Yeni sayfa url si: "+ url());
    }
}
