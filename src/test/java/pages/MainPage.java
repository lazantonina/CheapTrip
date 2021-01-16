package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends PageBase {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".hide-xs.md.title-default.hydrated")
    WebElement slogan;
    @FindBy(css = "ion-buttons.select.buttons-last-slot.sc-ion-buttons-md-h.sc-ion-buttons-md-s.md.hydrated")
    WebElement selectLan;
    @FindBy(css = "#ion-rb-0-lbl")
    WebElement englishLan;
    @FindBy(css = "ion-item.select-interface-option")
    List<WebElement> langList;
    @FindBy(tagName = "ion-card-title")
    WebElement title;


    public boolean isSloganContainsText(String text) {
        return slogan.getText().contains(text);
    }

    public void selectEnglishLanguage() {
        selectLan.click();
        waitUntilElementVisible(englishLan, 30);
        langList.get(0).click();

    }

    public boolean isLanguageOnPageEnglish() {
        return title.getText().contains("Discover the cheapest way to get anywhere combining plane, train, bus and rideshare");
    }


}
