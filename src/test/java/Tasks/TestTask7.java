package Tasks;

import Pages.PageTask7;
import org.testng.annotations.Test;

public class TestTask7 extends BotTestCases{

    @Test
    public void navigateToW3schoolsAndAssertThatTheCountryForTheCompanyErnstHandelIsAustria(){
        new PageTask7().navigateToW3schools()
                .AssertThatTheCountryForTheCompanyErnstHandelIsAustria();
    }
}
