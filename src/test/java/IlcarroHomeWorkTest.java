import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IlcarroHomeWorkTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro-1578153671498.web.app/login?url=%2Fsearch");
        driver.manage().window().maximize();
    }
    @Test
    public void checkButtonClickHere(){
        String btnOrigin = "Click here";
        WebElement btnByCssSel = driver.findElement(By.cssSelector(".navigator"));
        Assert.assertEquals(btnOrigin, btnByCssSel.getText());
    }
    @Test
    public void checkPersonName(){
        String personNameOrigin = "Barbara Dror";
        WebElement personNameByXpath = driver.findElement(By.xpath("//span[normalize-space()='Barbara Dror']"));
        Assert.assertEquals(personNameOrigin, personNameByXpath.getText());
    }
    @Test
    public void checkTelephone(){
        String telephoneOrigin = "866-720-5721";
        WebElement telephoneByCssSel = driver.findElement(By.cssSelector(".telephone"));
        Assert.assertEquals(telephoneOrigin, telephoneByCssSel.getText());
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
