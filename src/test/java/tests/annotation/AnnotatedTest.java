package tests.annotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;

public class AnnotatedTest extends TestBase {

    private final static String BASE_URL = "https://github.com";
    private final static String REPOSITORY = "melnikaliaksandr/qa-guru-hometask-5";
    private final static String TAB = "Issues";

    private Steps step = new Steps();

    @Test
    @DisplayName("Annotated test")
    public void testIssueSearch() {
        step.openUrl(BASE_URL);
        step.searchRepository(REPOSITORY);
        step.openRepository(REPOSITORY);
        step.checkTab(TAB);
    }

}
