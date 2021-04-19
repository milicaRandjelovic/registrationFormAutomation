package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiHomePage extends baseTestHaloOglasi {
    public haloOglasiHomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".cookie-policy-btn")
    WebElement uReduCookie;

    @FindBy(linkText = "Registracija")
    WebElement registrationLink;

    public void clickOnUReduCookie(){
        wdwait.until(ExpectedConditions.visibilityOf(uReduCookie));
        uReduCookie.click();
    }
    public void clickOnRegistrationLink(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationLink));
        registrationLink.click();
    }
}
