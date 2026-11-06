import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Bus_Search {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.shohoz.com/mhome");

        System.out.println(driver.getTitle());

        driver.findElements(By.cssSelector("input[placeholder='Enter City']"))
              .get(0).sendKeys("Dhaka");

        driver.findElement(By.xpath("//*[normalize-space()='Dhaka']")).click();

        driver.findElements(By.cssSelector("input[placeholder='Enter City']"))
              .get(1).sendKeys("Chittagong");

        driver.findElement(By.xpath("//*[normalize-space()='Chittagong']")).click();

        driver.findElement(By.cssSelector("input[placeholder='Pick a date']")).click();

        driver.quit();
    }
}