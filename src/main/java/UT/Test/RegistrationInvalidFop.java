package UT.Test;

import UT.Pages.LoginPage;
import UT.Pages.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationInvalidFop extends TestInit {

    String invalidSurname="Koval!2";
    String invalidfirstName="_Mykola_";
    String invalidmiddleName="Petrov1ch";
    String invalidAddress="st.Nauki2";
    String invalidContactPerson="Mykola@_";
    String address = "city Kiev";
    String phoneNumber="380671890126";
    String ipn= "0974124876";
    @Test
    public void testInvalidFop(){


    openUrl("http://order3-dev.utr.ua:5455");
        LoginPage lp= new LoginPage(driver);
        lp.clickRegistration()
                .chooseRegistration()
                .Fop()
                .surName(invalidSurname);
        Assert.assertTrue(lp.errorSurname().isDisplayed());
        lp.firstName(invalidfirstName)
                .middleName(invalidmiddleName)
                .chooseRegion()
                .clickRegion()
                .addressRegistration(invalidAddress)
                .contantPerson(invalidContactPerson)
                .addressDelivery(address)
                .phoneNumber(phoneNumber);
        String email = generateUniqueEmail("olexander.martynyuk@gmail.com");
        lp.emailAddress(email)
        .individualTaxNumber(ipn)
        .agreeTerms()
        .clickReg();
        Assert.assertTrue(lp.errorSurname().isDisplayed());
        Assert.assertTrue(lp.errorFistName().isDisplayed());
        Assert.assertTrue(lp.errorMiddleName().isDisplayed());
        Assert.assertTrue(lp.errorPhoneNumber().isDisplayed());










    }
}
