package testcases;

import driver.Driver;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeTest
    public void setUpBeforeClass(){Driver.init_Driver();}
    @AfterTest
    public void tearDownAfterClass(){Driver.quit_Driver();}
}
