package Tasks;

import Pages.PageTask6;
import org.testng.annotations.Test;

public class TestTask6 extends BotTestCases{

    @Test
    public void navigateToInternetHerokuAppAndAssertTheCheckBoxesIsChecked(){

        new PageTask6().navigateToInternetHerokuApp()
                .checkCheckBox1()
                .assertThatBothCheckboxesAreChecked();
    }

}
