package Pages;

import com.shaft.driver.SHAFT;
import com.shaft.gui.internal.locator.Locator;
import org.openqa.selenium.By;


public class PageTask6 extends BasePage{
//    Open Google Chrome
//    Navigate to [http://the-internet.herokuapp.com/checkboxes]
//    Check Checkbox 1
//    Assert that both Checkboxes are checked
//    Close Google Chrome

//    By checkBox1 = By.xpath("//input[1]");
//    By checkBox2 = By.xpath("//input[2]");


//     TODO:: FindElement By Using SHAFT Locator Builder
    By  checkBox1 = SHAFT.GUI.Locator.hasTagName("input").isFirst().build();
    By checkBox2 = Locator.hasTagName("input").isLast().build();


    public PageTask6 navigateToInternetHerokuApp(){
        driverEngine().browser().navigateToURL("http://the-internet.herokuapp.com/checkboxes");
        return this;
    }

    public PageTask6 checkCheckBox1(){
        driverEngine().element().click(checkBox1);
        return this;
    }

    public PageTask6 assertThatBothCheckboxesAreChecked(){
        driverEngine().element().assertThat(checkBox1).isChecked();
        driverEngine().element().assertThat(checkBox2).isChecked();
        return this;
    }

}
