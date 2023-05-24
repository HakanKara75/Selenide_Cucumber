package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Techpro_TestCenter {

public SelenideElement kullaniciAdi= $(By.id("exampleInputEmail1"));
public SelenideElement kullaniciSifresi= $("#exampleInputPassword1");
public SelenideElement submitButonu= $(By.xpath("//button[@type='submit']"));

public SelenideElement girisMesaji = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

public SelenideElement checkBox1 = $(By.id("box1"));
public SelenideElement checkBox2 = $(By.id("box2"));
public SelenideElement red = $(By.id("red"));
public SelenideElement football = $(By.id("football"));
    public SelenideElement year = $(By.id("year"));
    public SelenideElement month = $(By.id("month"));
    public SelenideElement day = $(By.id("day"));
    public SelenideElement prompt = $(By.xpath("//button[@onclick='jsPrompt()']"));
    public SelenideElement result = $("#result");
    public SelenideElement button = $(By.xpath("//a[@type='button']"));
    public SelenideElement reklam = $(By.xpath("(//a[@role='button'])[2]"));

}
