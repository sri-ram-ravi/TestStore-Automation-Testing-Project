package Base;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeMethod
    public void setUpBeforeClass(){Driver.init_Driver();}
    @AfterMethod
    public void tearDownAfterClass(){Driver.quit_Driver();}
}
