package Pages;

import com.shaft.gui.internal.locator.Locator;
import com.shaft.gui.internal.locator.LocatorBuilder;
import com.shaft.gui.internal.locator.Role;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PageTask4 extends BasePage{


//    Open Mozilla Firefox
//    Navigate to [https://duckduckgo.com/]
//    Search for [TestNG]
//    Assert that the text of the fourth result is [TestNG Tutorial]
//    Close Mozilla Firefox

    By searchBox = By.id("searchbox_input");
  By fourthResultText = By.xpath("//article[@id='r1-0']//h2/a");

    // TODO:: FindElement Using SHAFT Locator Builder

    // TODO:: First Way
//    By fourthResultText = LocatorBuilder
//            .byRole(Role.HEADING)
//            .byAxis().followingSibling("a").build();

    // TODO:: Second Way
//    By fourthResultText;
//    {
//        Locator.hasTagName("article")
//                .hasAttribute("id", "r1-0");
//        fourthResultText = LocatorBuilder
//                .byRole(Role.HEADING).and()
//                .byAxis().followingSibling("a").build();
//    }

    public PageTask4 navigateToDuckDuckGo() {
        driverEngine().browser().navigateToURL("https://duckduckgo.com/");
        return this;
    }

    public PageTask4 searchForQuery() {
        driverEngine().element().type(searchBox, testData.getTestData("searchQuery2")+ Keys.ENTER);
        return this;
    }

    public PageTask4 assertFourthResultText() {
        driverEngine().element().assertThat(fourthResultText).text().isEqualTo(testData.getTestData("expectedFourthResultText"));
        return this;
    }


}
