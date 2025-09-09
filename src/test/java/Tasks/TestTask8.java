package Tasks;

import Pages.PageTask8;
import org.testng.annotations.Test;

public class TestTask8 extends BotTestCases{

    @Test
    public void navigateToInternetHerokuAppAndVerifyFileUploadedSuccessfully(){
       new PageTask8().navigateToInternetHerokuApp()
                .uploadSmallImageFile()
                .clickOnTheUploadButton()
                .assertThatTheFileWasUploadedSuccessfully();
    }
}
