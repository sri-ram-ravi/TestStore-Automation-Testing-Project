package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {
    public static void init_Driver(){
        //Objects will check any instance or the browser is created
        if(Objects.isNull(DriverManager.getDriver())){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            DriverManager.setDriver(driver);
        }
    }
    public static void quit_Driver(){
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.removeDriver();
        }
    }
}
