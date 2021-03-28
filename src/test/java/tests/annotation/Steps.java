package tests.annotation;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class Steps {

    @Step("Open url {url}")
    public void openUrl(String url) {
        open(url);
    }

    @Step("Search repository {repository}")
    public void searchRepository(String repository) {
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").pressEnter();
    }

    @Step("Open repository {repository}")
    public void openRepository(String repository) {
        $(byLinkText(repository)).click();
    }

    @Step("Check tab {tab}")
    public void checkTab(String tab) {
        $$(".UnderlineNav-body li").shouldHave(itemWithText(tab));
    }

}
