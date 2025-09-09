package Tasks;

import Pages.PageTask3;
import org.testng.annotations.Test;

public class TestTask3 extends BotTestCases{


    @Test
    public void searchForQueryAndCheckFirstResult() {

        new PageTask3().navigateToDuckDuckGo().searchForQuery().assertFirstResultLink();
    }
}
