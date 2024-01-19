package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {
    public static WebDriver driver;
    public static void init_Driver(){
        //Objects will check any instance or the browser is created
        if(Objects.isNull(driver)){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
    }

    public static void quit_Driver(){
        if (Objects.nonNull(driver)) {
            driver.quit();
            driver=null;
        }
    }
}
