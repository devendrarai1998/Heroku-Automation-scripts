package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("heroku Site is opening");

        //Gets the title of the site
        System.out.println(driver.getTitle());

        //takes you to basic auth input page
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("Sign in")).click();

        //Pop page will appear


    }
}
