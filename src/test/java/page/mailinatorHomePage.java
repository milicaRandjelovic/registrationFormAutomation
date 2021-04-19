package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorHomePage extends baseTestHaloOglasi {
    public mailinatorHomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "addOverlay")
    WebElement mailinatorEmailField;

    public void inputMailinatorEmail(String email){
        wdwait.until(ExpectedConditions.visibilityOf(mailinatorEmailField));
        mailinatorEmailField.clear();
        mailinatorEmailField.sendKeys(email);
    }
    public void inputEnterMailinatorEmail(){
        wdwait.until(ExpectedConditions.visibilityOf(mailinatorEmailField));
        mailinatorEmailField.sendKeys(Keys.ENTER);
    }

}
