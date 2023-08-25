import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class IlcarroTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro-1578153671498.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test(){
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println("Tag h1: " + h1.getText());
        WebElement h2 = driver.findElement(By.tagName("h2"));
        System.out.println("Tag h2: " + h2.getText());
        WebElement div = driver.findElement(By.tagName("div"));
        System.out.println("Tag div: " + div.getText());
        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println("Tag a: " + a.getText());
        WebElement span = driver.findElement(By.tagName("span"));
        System.out.println("Tag span: " + span.getText());
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Tag label: " + label.getText());
        WebElement address = driver.findElement(By.tagName("address"));
        System.out.println("Tag address: " + address.getText());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}