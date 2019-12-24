import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiLoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= new ChromeDriver();

    }
    @Test
    public void loginTest(){
         driver.get("https://www.wikipedia.org/");

         driver.findElement(By.id("js-link-box-en")).click();



    }
    @AfterMethod
    public void tearDown(){

    }

}
