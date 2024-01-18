package BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BasePage {
    protected WebDriver driver;

    @BeforeTest
    public void setUpBeforeClass(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @AfterTest
    public void tearDownAfterClass(){driver.quit();}
}
