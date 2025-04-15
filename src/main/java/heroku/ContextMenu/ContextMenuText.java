package heroku.ContextMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContextMenuText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id='content']/ul/li[7]/a")).click();
//        System.out.println(driver.findElement(By.tagName("div")).getText());
        System.out.println(driver.findElement(By.id("content")).getText());

        driver.quit();
    }
}
