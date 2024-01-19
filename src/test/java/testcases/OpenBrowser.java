package testcases;

import driver.Driver;
import org.testng.annotations.*;


public class OpenBrowser extends BaseTest {
    @Test
    public void teststore_Automation_Testing(){
        Driver.driver.get("http://teststore.automationtesting.co.uk/");
    }

    @Test
    public void get_Automation_Testing_Website(){Driver.driver.get("https://www.automationtesting.co.uk/");}
}