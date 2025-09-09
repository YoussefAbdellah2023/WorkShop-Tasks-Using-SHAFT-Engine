package Tasks;
import Pages.PageTask1;
import org.testng.annotations.Test;

public class TestTask1 extends BotTestCases{

    @Test
    public void navigateToDuckDuckGoAndCheckTitle() {
        new PageTask1().navigateToDuckDuckGo()
                .assertTheTitle();
    }
}
