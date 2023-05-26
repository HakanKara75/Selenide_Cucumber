package stepdefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Herokuapp {

    HerokuappPage herokuappPage=new HerokuappPage();

    @Given("start butonuna tikla")
    public void start_butonuna_tikla() {
        herokuappPage.start.click();
    }
    @Then("kullanici {string} metnini dogrular")
    public void kullanici_metnini_dogrular(String string) {

        //1. webdriver wait
//        WebDriverWait wait= new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.visibilityOf(herokuappPage.hello));
//        assertEquals(string, herokuappPage.hello.getText());

        //2.selenide wait
//        herokuappPage.hello.should(Condition.visible, Duration.ofSeconds(10));
//        assertEquals(string, herokuappPage.hello.getText());

        //3. Selenide wait
        herokuappPage.hello.shouldHave(Condition.text("Hello World!"),Duration.ofSeconds(10));
    }



}
