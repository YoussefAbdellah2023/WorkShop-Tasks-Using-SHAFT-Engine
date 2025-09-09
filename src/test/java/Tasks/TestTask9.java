package Tasks;

import Pages.PageTask9;
import org.testng.annotations.Test;

public class TestTask9 extends BotTestCases{

    @Test
    public void navigateToDroppableAndAssertTheTextChangedAfterDragAndDrop(){

        new PageTask9().navigateToDroppablePage()
                .dragAndDropItem()
                .assertTextChangedAfterDropped();

    }
}
