// thread safety mechanisms to run the parallel test
//    get the driver
//    set the driver
//    remove the driver

package Base;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> webDriverThreadLocal=new ThreadLocal<>();
    public static WebDriver getDriver(){return webDriverThreadLocal.get();}
    public static void setDriver(WebDriver driver){webDriverThreadLocal.set(driver);}
    public static void removeDriver(){webDriverThreadLocal.remove();}
}
