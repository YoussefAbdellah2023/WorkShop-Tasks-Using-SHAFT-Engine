package Pages;

import com.shaft.gui.internal.locator.Locator;
import com.shaft.validation.internal.ValidationsExecutor;
import org.openqa.selenium.By;

public class PageTask2 extends BasePage{


//    Open Google Chrome
//    Navigate to [https://duckduckgo.com/]
//    Assert that the DuckDuckGo logo is displayed
//    Close Google Chrome



//    By logo = By.xpath("//div[contains(@class,'container_fullWidth__1H_L8')]//img");

    // TODO:: Finding Element Using SHAFT Locator Builder
    By logo = Locator.hasTagName("div").and()
            .containsAttribute("class","container_fullWidth__1H_L8").and()
            .byAxis().following("img").build();

    public PageTask2 navigateToDuckDuckGo() {
        driverEngine().browser().navigateToURL("https://duckduckgo.com/");
        return this;
    }
    public ValidationsExecutor LogoIsDisplayed() {
        return driverEngine().element().assertThat(logo).matchesReferenceImage();
    }
}
