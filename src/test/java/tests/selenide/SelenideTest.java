package tests.selenide;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest extends TestBase {

    private final static String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "melnikaliaksandr/qa-guru-hometask-5";

    @Test
    @DisplayName("Selenide test")
    public void testIssueSearch() {
        open(BASE_URL);
        $(".header-search-input").sendKeys(REPOSITORY);
        $(".header-search-input").pressEnter();
        $(byLinkText(REPOSITORY)).click();
        $$(".UnderlineNav-body li").shouldHave(itemWithText("Issues"));
    }

}