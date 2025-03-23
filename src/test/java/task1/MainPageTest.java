package task1;

import org.junit.Test;
import pages.MainPage;

public class MainPageTest extends BrowserSettings {
    @Test
    public void testOpenTheNexignNordSection() {
        new MainPage(driver)
                .openSite()
                .clickProductsAndSolutionsButton()
                .clickToolsForITTeamsButton()
                .clickNexignNordButton();
    }
}
