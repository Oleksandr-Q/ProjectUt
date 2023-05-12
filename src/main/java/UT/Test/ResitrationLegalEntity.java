package UT.Test;

import UT.Pages.LoginPage;
import UT.Pages.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResitrationLegalEntity extends TestInit {
    String invalidNameCompany="Fiz!Biz11";
    String invalidlastNameAccountHolder="Velichenk0";
    String invalidnameAccountHolder="Vlad1slav";
    String invalidmiddleNameAccountHolder="Petrov1c4";
    String invalidAdress="st.Nauki2";
    String invalidcontantPersonLe="Vladis1av";
    String address = "city Kiev";
    String number = "0671890126";
    String edrpoy = "9213451240";
    @Test
    public void registrationTest(){



        openUrl("http://order3-dev.utr.ua:5455");
        LoginPage le=new LoginPage(driver);
        le.clickRegistrationL()
                .chooseRegistrationL()
                .clickLegalEnity();
        le.nameCompany(invalidNameCompany);
        le.lasyNameAccountHolder(invalidnameAccountHolder);
        le.nameAccountHolder(invalidlastNameAccountHolder);
        le.middleNameAccountHolder(invalidmiddleNameAccountHolder)
                .chooseRegionLe()
                .clickRegionLe();
        le.addressRegistrationLe(invalidAdress);
        le.contantPersonLe(invalidcontantPersonLe);
        le.addressDeliveryLe(address);
        le.phoneNumberLe(number);
        String email = generateUniqueEmail("olexander.martynyuk@gmail.com");
                le.emailAddressLe(email)
                        .chooseEdrpoy(edrpoy)
                        .agreeTermsLe()
                        .clickRegLe();
        Assert.assertTrue(le.errorMessageEdrpou().isDisplayed());
    }
}
