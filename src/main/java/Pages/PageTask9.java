package Pages;

import com.google.api.Page;
import org.openqa.selenium.By;

public class PageTask9 extends BasePage{


//    Open Google Chrome
//    Navigate to [https://jqueryui.com/resources/demos/droppable/default.html]
//    Drag [Drag me to my target] and drop it on [Drop here]
//    Assert that the text has been changed to [Dropped!]
//    Close Google Chrome

    By dragMe = By.xpath("//*[@id=\"draggable\"]");
    By dropIt = By.xpath("//*[@id=\"droppable\"]");


    public PageTask9 navigateToDroppablePage(){
        driverEngine().browser().navigateToURL("https://jqueryui.com/resources/demos/droppable/default.html");
        return this;
    }

    public PageTask9 dragAndDropItem(){
        driverEngine().element().dragAndDrop(dragMe,dropIt);
        return this;
    }

    public PageTask9 assertTextChangedAfterDropped(){
        driverEngine().element().assertThat(dropIt).text().isEqualTo("Dropped!");
        return this;
    }





}
