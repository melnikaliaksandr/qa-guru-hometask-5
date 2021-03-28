package tests.lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class LambdaTest extends TestBase {

    private final static String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "melnikaliaksandr/qa-guru-hometask-5";

    @Test
    @DisplayName("Lambda test")
    public void testIssueSearch() {
        step("Open github", () -> {
            open(BASE_URL);
        });
        step("Search repository", () -> {
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").pressEnter();
        });
        step("Open repository", () -> {
            $(byLinkText(REPOSITORY)).click();
        });
        step("Check 'Issues' tab", () -> {
            $$(".UnderlineNav-body li").shouldHave(itemWithText("Issues"));
        });
    }

}
