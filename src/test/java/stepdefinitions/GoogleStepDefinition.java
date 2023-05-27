package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HerokuappPage;

import static com.codeborne.selenide.Selenide.*;

public class GoogleStepDefinition {
    HerokuappPage herokuapp=new HerokuappPage();

    @Given("google image goruntusunu alir")
    public void google_image_goruntusunu_alir() {
        herokuapp.image.screenshot();
    }


    @And("footer elementi gorunur sekilde goster")
    public void footerElementiGorunurSekildeGoster() {

        executeJavaScript("arguments[0].scrollIntoView(true);",herokuapp.amazonFooter);

    }
}
