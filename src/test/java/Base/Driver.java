package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class Driver {
    public static void init_Driver() throws IOException {
        //Objects will check any instance or the browser is created
        if(Objects.isNull(DriverManager.getDriver())){
            if(ReadProperties().getProperty("browser").equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                DriverManager.setDriver(driver);
            }
        }
    }
    public static void quit_Driver(){
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.removeDriver();
        }
    }

    public static Properties ReadProperties() throws IOException {
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("/home/sriram/Downloads/seleniumJava-20231219T123940Z-001/Live Project 1/TestStore-Automation-Testing-Project/src/test/resources/config.properties");
        properties.load(fileInputStream);
        return properties;
    }
}
