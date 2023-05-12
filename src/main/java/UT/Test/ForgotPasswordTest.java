package UT.Test;

import UT.Pages.LoginPage;
import UT.Pages.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestInit {


    @Test
    public void testForgotPass(){
        openUrl("http://order3-dev.utr.ua:5455/ua/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickForgotPassword();
        String email = generateUniqueEmail("olexander.martynyuk@gmail.com");
        loginPage.writeEmail(email)
                .clickRestore();
        Assert.assertTrue(loginPage.passwordResetSuccessully().isDisplayed());


    }
}
