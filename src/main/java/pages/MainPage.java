package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    public MainPage(WebDriver driver) {
        MainPage.driver = driver;
    }

    public static WebDriver driver;

    /**
     * Локаторы элементов главной страницы Nexign
     */

    //Кнопка "Продукты и решения" в шапке
    private final By productsAndSolutionsButton = By.xpath(".//*[@class='menu-item menu-item--expanded']/span[text()='Продукты и решения']");

    // Кнопка "Инструменты для ИТ-команд" внутри шапки
    private final By toolsForITTeamsButton = By.xpath(".//*[@class='menu-item menu-item--expanded menu-double-column']/span[text()='Инструменты для ИТ-команд']");

    // Кнопка "Nexign Nord"
    private final By nexignNordButton = By.xpath(".//*[@class='menu-item']/*[text()='Nexign Nord']");



    /**Методы для взаимодействия с элементами страницы*/
    //Открыть сайт
    public final MainPage openSite() {
        driver.get("https://nexign.com/ru");
        return this;
    }

    // Нажать на кнопку "Продукты и решения" в шапке
    public MainPage clickProductsAndSolutionsButton() {
        driver.findElement(productsAndSolutionsButton).click();
        return this;
    }

    // Нажать на кнопку "Инструменты для ИТ-команд"
    public MainPage clickToolsForITTeamsButton() {
        driver.findElement(toolsForITTeamsButton).click();
        return this;
    }

    // Нажать на кнопку  "Nexign Nord"
    public MainPage clickNexignNordButton() {
        driver.findElement(nexignNordButton).click();
        return this;
    }
}
