package heroku.ContextMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContextMenuActionClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//li[text()='Context Menu']")).click();

        System.out.println(driver.findElement(By.id("content")).getText());
    }
}
