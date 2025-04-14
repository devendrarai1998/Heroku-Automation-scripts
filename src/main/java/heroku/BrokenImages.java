package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //Mazimize current window
        driver.manage().window().maximize();
        System.out.println("Windows maximized");

        //Delay execution for 5 seconds to view the maximize operation
        Thread.sleep(5000);
        System.out.println("Delay of 5 seconds after opening");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[4]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[2]")).click();

        driver.quit();
        System.out.println("Windows was closed after completing the operation");
    }

}
