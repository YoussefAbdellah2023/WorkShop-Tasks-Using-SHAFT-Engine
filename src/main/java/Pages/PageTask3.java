package Pages;
import com.shaft.gui.internal.locator.Locator;
import com.shaft.gui.internal.locator.Role;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PageTask3 extends BasePage{

//    Open Google Chrome
//    Navigate to [https://duckduckgo.com/]
//    Search for [Selenium WebDriver]
//    Assert that the link of the first result is [https://www.selenium.dev/documentation/webdriver/]
//    Close Google Chrome


    By searchBox = By.name("q");
  By firstResultLink = By.xpath("//article[@id='r1-0']//h2/a");

    // TODO:: Finding Element Using SHAFT Locator Builder
//    By firstResultLink = Locator.hasTagName("article")
//            .hasAttribute("id","r1-0")
//            .byRole(Role.HEADING).and()
//            .byAxis().followingSibling("a").build();

    public PageTask3 navigateToDuckDuckGo() {
        driverEngine().browser().navigateToURL("https://duckduckgo.com/");
        return this;
    }

    public PageTask3 searchForQuery() {
//        driverEngine().element().type(searchBox,"Selenium WebDriver" + Keys.ENTER);
        driverEngine().element().type(searchBox, testData.getTestData("searchQuery")+Keys.ENTER);
        return this;
    }

    public PageTask3 assertFirstResultLink() {
         driverEngine().assertThat().element(firstResultLink).domAttribute("href")
                .isEqualTo("https://www.selenium.dev/documentation/webdriver/");
         return this;
    }


}
