package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HerokuappPage;

public class GoogleStepDefinition {
    HerokuappPage herokuapp=new HerokuappPage();

    @Given("google image goruntusunu alir")
    public void google_image_goruntusunu_alir() {
        herokuapp.image.screenshot();
    }


}
