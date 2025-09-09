package Pages;

import com.shaft.driver.SHAFT;
import com.shaft.gui.internal.locator.Locator;
import org.openqa.selenium.By;

public class PageTask8 extends BasePage{

//    Open Google Chrome
//    Navigate to [http://the-internet.herokuapp.com/upload]
//    Upload a small image file
//    Assert that the file was uploaded successfully
//    Close Google Chrome


    By chooseFileButton = By.id("file-upload");
    By uploadButton = By.id("file-submit");
//  By successMessage = By.xpath("div[@class='example']/h3");


    // TODO:: FindElement Using SHAFT Locator Builder
    By successMessage = Locator.hasTagName("div")
            .hasAttribute("class","example")
            .byAxis().followingSibling("h3").build();

    public PageTask8 navigateToInternetHerokuApp(){
        driverEngine().browser().navigateToURL("http://the-internet.herokuapp.com/upload");
        return this;
    }

    public PageTask8 uploadSmallImageFile(){
        driverEngine().element().typeFileLocationForUpload(chooseFileButton, SHAFT.Properties.paths.testData() + "download.jpg");
        return this;
    }

    public PageTask8 clickOnTheUploadButton(){
        driverEngine().element().click(uploadButton);
        return this;
    }

    public PageTask8 assertThatTheFileWasUploadedSuccessfully(){
        driverEngine().element().assertThat(successMessage).text().isEqualTo("File Uploaded!");
        return this;
    }





}
