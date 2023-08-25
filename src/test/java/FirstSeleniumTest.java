import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class FirstSeleniumTest {
    WebDriver driver;
    //before - setUp()
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
    }
    //test - test()
    @Test
    public void ebayOpenTest(){
        System.out.println("Test Pass");
    }
    //after - tearDown()
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
