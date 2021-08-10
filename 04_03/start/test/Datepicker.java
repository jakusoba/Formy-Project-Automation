import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i32261\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("12/10/2021");
        
        //This closes the datepicker. 
        dateField.sendKeys(Keys.RETURN);

        driver.quit();
    }
}