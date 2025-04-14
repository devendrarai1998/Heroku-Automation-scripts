package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddDeleteButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("heroku Site is opening");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();
//        driver.findElement(By.xpath("//*[@id='content']/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
        System.out.println("Added the Delete Button");
        driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
        System.out.println("Deleted the Delete Button");
        System.out.println("Button Functionality");
        driver.quit();
        System.out.println("Chrome closed after performing the task");
    }
}
