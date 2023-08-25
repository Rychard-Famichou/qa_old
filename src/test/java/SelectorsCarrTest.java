import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectorsCarrTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro-1578153671498.web.app/registration?url=%2Fsearch");
        driver.manage().window().maximize();
    }
    @Test
    public void searchStrategyTest(){
        // find by id
        WebElement name = driver.findElement(By.id("name"));
        System.out.println(name);
        // find by css selector -> id
        WebElement nameCssSel = driver.findElement(By.cssSelector("#name"));
        System.out.println(nameCssSel);
        // find by xpath -> id
        WebElement nameXpath = driver.findElement(By.xpath("//input[@id='name']"));
        System.out.println(nameXpath);
        // find be className
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        System.out.println(loginBtn);
        // find by css selector -> class name
        WebElement loginBtnCssSel = driver.findElement(By.cssSelector(".login-btn"));
        System.out.println(loginBtnCssSel);
        // find by name
        driver.findElement(By.cssSelector("input[formcontrolname='firstName']"));

    }
    @Test
    public void computerDatabaseTableTest(){
        driver.get("https://computer-database.gatling.io/computers"); // better to move to other class!!!!!
        WebElement sq7IntoXpath = driver.findElement(By.xpath("//tbody/tr[3]/td[2]"));
        WebElement sq7IntoCssSel = driver.findElement(By.cssSelector("tr:nth-of-type(3) > td:nth-of-type(2)"));
        Assert.assertEquals(sq7IntoXpath.getText(), sq7IntoCssSel.getText());
    }
    @Test
    public void w3schoolsTest(){
        driver.get("https://www.w3schools.com/html/html_tables.asp"); // better to move to other class!!!!!
        driver.findElement(By.id("accept-choices")).click();
        driver.findElement(By.xpath("//th[normalize-space()='Country']"));
    }
    @Test
    public void w3schoolsHMTest(){
        driver.get("https://www.w3schools.com/html/html_tables.asp"); // better to move to other class!!!!!
        WebElement searchCountry = driver.findElement(By.xpath("//td[normalize-space()='Island Trading']/.."));
        System.out.println(searchCountry.getText());
    }
    @Test
    public void assertionIntro(){
        // xpath child
        WebElement thirdNavLink = driver.findElement(By.xpath("(//a[@class='navigation-link'])[3]"));
        String termOfUse = thirdNavLink.getText();
        String expectedTermOfUseText = "Terms of use";
        System.out.println(termOfUse);
        Assert.assertEquals(termOfUse,expectedTermOfUseText);
//        Assert.assertTrue(termOfUse);

        // check locator by contains text and check that it contain
        String partOfTerms = "Terms";
        WebElement containTextXpath = driver.findElement(By.xpath("//a[contains(@text, " + partOfTerms + ")]"));
        System.out.println(partOfTerms.contains(containTextXpath.getText()));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
