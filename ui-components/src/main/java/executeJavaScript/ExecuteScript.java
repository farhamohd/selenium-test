package executeJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mohaseenbagwan/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modalButton= driver.findElement(By.id("modal-button"));
        modalButton.click();
        WebElement closeButton= driver.findElement(By.id("close-button"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript(s: "arguments[0].click();", closeButton);
        //driver.quit();

    }
}
