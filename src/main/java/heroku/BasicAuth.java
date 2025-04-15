package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        System.out.println("Basic Auth page opened");

        // You can now interact with the page post-authentication if needed
        String bodyText = driver.findElement(By.tagName("p")).getText();
        System.out.println("Body text: " + bodyText);

//        driver.quit();
    }
}
