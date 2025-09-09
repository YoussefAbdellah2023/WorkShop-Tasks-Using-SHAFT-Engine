package Tasks;

import org.testng.annotations.Test;

public class TestTask5 extends BotTestCases{

//    Open Google Chrome
//    Navigate to [https://duckduckgo.com/]
//    Search for [Cucumber IO]
//    Assert that the link of the second result contains [https://www.linkedin.com]
//    Close Google Chrome


    @Test
    public void navigateToDuckDuckGoAndCheckSecondResultLink() {
        new Pages.PageTask5()
                .navigateToDuckDuckGo()
                .searchForQuery()
                .assertSecondResultLink();
    }
}
