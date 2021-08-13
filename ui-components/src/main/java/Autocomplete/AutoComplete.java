package Autocomplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mohaseenbagwan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));

        autocomplete.sendKeys("12118 madison drive, atlanta, GA");
        Thread.sleep(1000);
        WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        autoCompleteResult.click();
        driver.quit();

    }
}
