package test;

import base.baseTestHaloOglasi;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import page.*;

import java.util.Random;

public class haloOglasiRegistrationTests extends baseTestHaloOglasi {
haloOglasiHomePage HaloOglasiHomePage;
haloOglasiRegistrationPage HaloOglasiRegistrationPage;
haloOglasiRegistrationSuccessPage HaloOglasiRegistrationSuccessPage;
mailinatorHomePage MailinatorHomePage;
mailinatorInboxPage MailinatorInboxPage;
mailinatorHaloOglasiEmail MailinatorHaloOglasiEmail;
successfulHaloOglasiRegistrationPage SuccessfulHaloOglasiRegistrationPage;

Random random = new Random();
int x = random.nextInt(999999);
String username = "gagagaga" + x;
String email =  "gagagaga" + x + "@mailinator.com";

@Before
    public void setUpTest(){
    HaloOglasiHomePage = new haloOglasiHomePage();
    HaloOglasiRegistrationPage = new haloOglasiRegistrationPage();
    HaloOglasiRegistrationSuccessPage = new haloOglasiRegistrationSuccessPage();
    MailinatorHomePage = new mailinatorHomePage();
    MailinatorInboxPage = new mailinatorInboxPage();
    MailinatorHaloOglasiEmail = new mailinatorHaloOglasiEmail();
    SuccessfulHaloOglasiRegistrationPage = new successfulHaloOglasiRegistrationPage();
}
@Test
    public void haloOglasiSuccessfulRegistrationTest(){
    HaloOglasiHomePage.clickOnUReduCookie();
    HaloOglasiHomePage.clickOnRegistrationLink();
    HaloOglasiRegistrationPage.inputKorisnickoIme(username);
    HaloOglasiRegistrationPage.inputEmail(email);
    HaloOglasiRegistrationPage.inputLozinka("111111");
    HaloOglasiRegistrationPage.inputPonoviLozinku("111111");
    HaloOglasiRegistrationPage.clickRegistrujmeButton();

    assertTrue(HaloOglasiRegistrationSuccessPage.registrationSuccessMessageDisplayed());
    assertEquals("Registracija je uspela!\n" +
            "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : " + email + " !",
            HaloOglasiRegistrationSuccessPage.registrationSuccessMessageText());

    driver.get("https://www.mailinator.com/");
    MailinatorHomePage.inputMailinatorEmail(email);
    MailinatorHomePage.inputEnterMailinatorEmail();
    MailinatorInboxPage.clickHaLoOglasiEmail();
    MailinatorHaloOglasiEmail.switchToIFrameAndClickOnTheAktivirajNalogLink();

    SuccessfulHaloOglasiRegistrationPage.moveToNewTab();
    assertTrue(SuccessfulHaloOglasiRegistrationPage.successfulRegistrationMessageDisplayed());
    assertEquals("Vaš nalog je uspešno aktiviran!\n" +
            "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava", SuccessfulHaloOglasiRegistrationPage.successfulRegistrationMessageText());
}
}
