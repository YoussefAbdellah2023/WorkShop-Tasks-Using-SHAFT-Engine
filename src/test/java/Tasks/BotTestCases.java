package Tasks;

import com.shaft.driver.SHAFT;
import engine.DriverEngine;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class BotTestCases {


    @BeforeMethod
    public void setup(){
       DriverEngine.set();
    }

    @AfterMethod
    public void tearDown(){
      DriverEngine.quit();
    }
}
