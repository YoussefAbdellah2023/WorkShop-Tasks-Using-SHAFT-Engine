package Pages;

public class PageTask1 extends BasePage{

//    Open Google Chrome
//    Navigate to [https://duckduckgo.com/]
//    Assert that the page title is [Google]
//    Close Google Chrome

    public PageTask1 navigateToDuckDuckGo() {
        driverEngine().browser().navigateToURL("https://duckduckgo.com/");
        return this;
    }

    public PageTask1 assertTheTitle() {
         driverEngine().assertThat().browser().title().isEqualTo("DuckDuckGo — Privacy, simplified.");
         return this;
    }
}
