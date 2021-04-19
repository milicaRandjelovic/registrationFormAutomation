package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiRegistrationSuccessPage extends baseTestHaloOglasi {
    public haloOglasiRegistrationSuccessPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".regsitration-success")
    WebElement registrationSuccessMessage;

    public boolean registrationSuccessMessageDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationSuccessMessage));
        return registrationSuccessMessage.isDisplayed();
    }

    public String registrationSuccessMessageText(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationSuccessMessage));
        return registrationSuccessMessage.getText();
    }
}
