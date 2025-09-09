package Pages;

import com.shaft.gui.internal.locator.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PageTask5 extends BasePage{


//    Open Google Chrome
//    Navigate to [https://duckduckgo.com/]
//    Search for [Cucumber IO]
//    Assert that the link of the second result contains [https://www.linkedin.com]
//    Close Google Chrome


    By searchBox = By.id("searchbox_input");
//  By secondResultLink = By.xpath("//*[@id=\"r1-1\"]//div[3]//a");

    // TODO:: FindElement By Using SHAFT Locator Builder
    By secondResultLink = Locator.hasAnyTagName().hasAttribute("id","r1-1")
            .byAxis().descendant("h2")
            .byAxis().descendant("a").build();


    public PageTask5 navigateToDuckDuckGo() {
        driverEngine().browser().navigateToURL("https://duckduckgo.com/");
        return this;
    }

    public PageTask5 searchForQuery() {
        driverEngine().element().type(searchBox, testData.getTestData("searchQuery3") + Keys.ENTER);
        return this;
    }

    public PageTask5 assertSecondResultLink() {
      driverEngine().element().assertThat(secondResultLink).
                domAttribute("href").contains(testData.getTestData("expectedSecondResultLink"));
        return this;
    }
}