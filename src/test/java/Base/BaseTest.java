package Base;

import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {
    @BeforeMethod
    public void setUpBeforeClass() throws IOException {Driver.init_Driver();}
    @AfterMethod
    public void tearDownAfterClass(){Driver.quit_Driver();}
}
