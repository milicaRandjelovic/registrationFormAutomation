package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorHaloOglasiEmail extends baseTestHaloOglasi {
    public mailinatorHaloOglasiEmail(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "html_msg_body")
    WebElement iFrameBody;

//    @FindBy(css = "[align=\"center\"] > a")
//    WebElement aktivirajNalogLink;
    @FindBy(xpath = "//strong[contains(text(), \"Aktiviraj nalog\")]")
    WebElement aktivirajNalogLink;

    public void switchToIFrameAndClickOnTheAktivirajNalogLink(){
        driver.switchTo().frame(iFrameBody);
        wdwait.until(ExpectedConditions.visibilityOf(aktivirajNalogLink));
        aktivirajNalogLink.click();
        driver.switchTo().defaultContent();
    }
//    kad necu da ode u novi tab nego da otvori link u istom tabu
//    public void switchToIFrameGetLink(){
//        driver.switchTo().frame(iFrameBody);
//        wdwait.until(ExpectedConditions.visibilityOf(aktivirajNalogLink));
//        driver.get(aktivirajNalogLink.getAttribute("href"));
//        driver.switchTo().defaultContent();
//    }
}
