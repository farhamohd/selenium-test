package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mohaseenbagwan/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDrownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDrownMenu.click();

        WebElement autoCompleteDropDownItem = driver.findElement(By.id("autocomplete"));
        autoCompleteDropDownItem.click();

        WebElement addressItem = driver.findElement(By.id("autocomplete"));
        autoCompleteDropDownItem.click();

        driver.quit();

    }
}
