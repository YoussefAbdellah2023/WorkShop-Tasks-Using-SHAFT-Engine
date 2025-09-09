package Pages;

import com.shaft.gui.internal.locator.Locator;
import org.openqa.selenium.By;

public class PageTask7 extends BasePage{

//    Open Google Chrome
//    Navigate to [https://www.w3schools.com/html/html_tables.asp]
//    Assert that the Country for the Company [Ernst Handel] is [Austria]
//    Close Google Chrome

//    By nameCountry = By.xpath("(//td[text()='Ernst Handel']/following-sibling::td)[2]");

    // TODO:: FindElement Using SHAFT Locator Builder
    By nameCountry = Locator.hasTagName("td").and().containsText("Ernst Handel")
            .byAxis().followingSibling("td")
            .hasIndex(2).build();


    public PageTask7 navigateToW3schools(){
        driverEngine().browser().navigateToURL("https://www.w3schools.com/html/html_tables.asp");
        return this;
    }

    public PageTask7 AssertThatTheCountryForTheCompanyErnstHandelIsAustria(){
        driverEngine().element().assertThat(nameCountry).text().isEqualTo(testData.getTestData("expectedCompanyErnstHandel"));
        return this;
    }


}
