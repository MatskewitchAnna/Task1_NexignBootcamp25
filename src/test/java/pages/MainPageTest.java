package pages;

import org.junit.Test;

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
