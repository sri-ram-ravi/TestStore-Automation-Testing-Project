package TestCases;

import BasePage.BasePage;
import org.testng.annotations.*;


public class OpenBrowser extends BasePage {
    @Test
    public void openBrowser(){
        driver.get("http://teststore.automationtesting.co.uk/");
    }
}
