package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class successfulHaloOglasiRegistrationPage extends baseTestHaloOglasi {
    public successfulHaloOglasiRegistrationPage(){

        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".regsitration-success")
    WebElement successfulRegistrationMessage;

    public boolean successfulRegistrationMessageDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.isDisplayed();
    }
    public String successfulRegistrationMessageText(){
        wdwait.until(ExpectedConditions.visibilityOf(successfulRegistrationMessage));
        return successfulRegistrationMessage.getText();
    }

    public void moveToNewTab(){
        wdwait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
