package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HerokuappPage {

    public SelenideElement start= $(By.xpath("//div[@id='start']//button"));
    public SelenideElement hello= $(By.xpath("//div[@id='finish']"));
    public SelenideElement image= $(".lnXdpd");


}
