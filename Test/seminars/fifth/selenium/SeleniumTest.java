package seminars.fifth.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    /***
     * Напишите автоматизированный тест, который выполнит следующие шаги:
     * 1. Открывает главную страницу Google.
     * 2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
     * 3. В результатах поиска ищет ссылку на официальный сайт Selenium
     * (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
     * результатов поиска
     */

    @Test
    void checkBrowserTest () throws InterruptedException {
        boolean isContains = false;
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        List<WebElement> seleniumLink = driver.findElements(By.cssSelector("div"));
        for (WebElement webElement : seleniumLink) {
            if (webElement.getText().contains("https://www.selenium.dev")) {
                isContains = true;
                break;
            }
        }

        assertTrue(isContains);
        Thread.sleep(1000);
        driver.quit();
    }

    /***
     *Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на
     * сайте https://www.saucedemo.com/.
     * Данные для входа - логин: "standard_user", пароль: "secret_sauce".
     * Проверить, что авторизация прошла успешно и отображаются товары.
     * Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода
     * данных в поля формы, и submit() для отправки формы. После этого, проверьте, что на странице
     * отображаются продукты (productsLabel.getText() = "Products")
     */

    @Test
    void checkLoginTest () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement loginBox = driver.findElement(By.name("user-name"));
        loginBox.sendKeys("standard_user");
        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("secret_sauce");
        passwordBox.submit();

        WebElement getTitle = driver.findElement(By.className("title"));
        assertEquals(getTitle.getText(), "Products");

        Thread.sleep(1000);
        driver.quit();
    }
}
