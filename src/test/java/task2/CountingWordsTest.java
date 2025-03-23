package task2;

import org.junit.Test;
import org.openqa.selenium.By;
import pages.MainPage;
import task1.BrowserSettings;


public class CountingWordsTest extends BrowserSettings {
    @Test
    public void testCountingWords() {
        new MainPage(driver).openSite();

        // Получаем весь текст основного содержимого страницы
        String pageContent = driver.findElement(By.tagName("body")).getText();

        // Подсчитываем количество упоминаний слова "Nexign"
        String nexignWord = "Nexign";
        int count = countNexignWord(pageContent, nexignWord);

        // Выводим результат
        System.out.println("Количество упоминаний слова 'Nexign' на видимой пользователю части: " + count);
    }

    private int countNexignWord(String content, String searchTerm) {
        String contentLowerCase = content.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        String[] words = contentLowerCase.split("\\W+");

        int count = 0;
        for (String word : words) {
            if (word.equals(searchTermLowerCase)) {
                count++;
            }
        }
        return count;
    }
}
