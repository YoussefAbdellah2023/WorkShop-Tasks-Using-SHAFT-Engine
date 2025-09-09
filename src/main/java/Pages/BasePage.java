package Pages;

import com.shaft.driver.SHAFT;
import engine.DriverEngine;

public abstract class BasePage {

    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("simpleJSON.json");


    protected SHAFT.GUI.WebDriver driverEngine() {
        return DriverEngine.get();
    }

}
