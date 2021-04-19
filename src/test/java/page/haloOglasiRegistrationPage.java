package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiRegistrationPage extends baseTestHaloOglasi {
    public haloOglasiRegistrationPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "UserName")
    WebElement korisnickoImeField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement lozinkaField;

    @FindBy(id = "ConfirmPassword")
    WebElement ponoviLozinkuField;

    @FindBy(xpath = "(//button[contains(text(), \"Registruj me\")])[1]")
    WebElement registrujMeButton;

    public void inputKorisnickoIme(String ime){
        wdwait.until(ExpectedConditions.visibilityOf(korisnickoImeField));
        korisnickoImeField.clear();
        korisnickoImeField.sendKeys(ime);
    }
    public void inputEmail(String email){
        wdwait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void inputLozinka(String lozinka){
        wdwait.until(ExpectedConditions.visibilityOf(lozinkaField));
        lozinkaField.clear();
        lozinkaField.sendKeys(lozinka);
    }
    public void inputPonoviLozinku(String ponoviLozinku){
        wdwait.until(ExpectedConditions.visibilityOf(ponoviLozinkuField));
        ponoviLozinkuField.clear();
        ponoviLozinkuField.sendKeys(ponoviLozinku);
    }
    public void clickRegistrujmeButton(){
        wdwait.until(ExpectedConditions.visibilityOf(registrujMeButton));
        registrujMeButton.click();
    }
}
