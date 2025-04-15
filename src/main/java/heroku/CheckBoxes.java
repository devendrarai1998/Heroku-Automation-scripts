package heroku;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();

        //Getting the list of all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(int i=0; i<checkboxes.size(); i++){
            WebElement checkbox = checkboxes.get(i);
            boolean isSelected = checkbox.isSelected();

            if(isSelected){
                checkbox.click();
                System.out.println("Checkbox " + (i + 1) + " was checked. Now unchecked.");
            } else {
                checkbox.click();
                System.out.println("Checkbox " + (i + 1) + " was unchecked. Now checked.");
            }
        }

        driver.quit();
    }
}
