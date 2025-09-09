package Tasks;

import Pages.PageTask4;
import org.testng.annotations.Test;

public class TestTask4 extends BotTestCases{
//    Open Mozilla Firefox
//    Navigate to [https://duckduckgo.com/]
//    Search for [TestNG]
//    Assert that the text of the fourth result is [TestNG Tutorial]
//    Close Mozilla Firefox


    @Test
    public void navigateToDuckDuckGoAndCheckFourthResultText() {
        new PageTask4()
                .navigateToDuckDuckGo()
                .searchForQuery().
                assertFourthResultText();
    }
}
