package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengingDom {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//a[text()='Challenging DOM']")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());

        driver.close();
        driver.quit();
    }
}
