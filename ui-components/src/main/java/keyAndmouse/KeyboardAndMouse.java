package keyAndmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mohaseenbagwan/Downloads/chromedriver");



        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();

        name.sendKeys("Farha Kachur");
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        driver.quit();
    }
}
