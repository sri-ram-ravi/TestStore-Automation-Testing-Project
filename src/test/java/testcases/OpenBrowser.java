package testcases;

import Base.BaseTest;
import Base.DriverManager;
import org.testng.annotations.*;

public class OpenBrowser extends BaseTest {
    @Test
    public void teststore_Automation_Testing(){DriverManager.getDriver().get("http://teststore.automationtesting.co.uk/");}
    @Test
    public void get_Automation_Testing_Website(){DriverManager.getDriver().get("https://www.automationtesting.co.uk/");}
}