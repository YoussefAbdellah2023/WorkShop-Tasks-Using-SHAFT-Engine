package Tasks;

import Pages.PageTask2;
import org.testng.annotations.Test;

public class TestTask2 extends BotTestCases {


    @Test
    public void navigateToDuckDuckGoAndCheckLogo() {
        new PageTask2().navigateToDuckDuckGo().LogoIsDisplayed();
    }

}
