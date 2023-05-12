package UT.Test;

import UT.Pages.LoginPage;
import UT.Pages.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends TestInit {
    @Test
    public void testInvalidLogin() {
        String invalidLogin = "test@utr.ua12!";

            openUrl("http://order3-dev.utr.ua:5455/");
            LoginPage lp = new LoginPage(driver);
            lp.inputLogin(invalidLogin)
                    .inputPassword(invalidLogin)
                    .clickButton();
            Assert.assertTrue(lp.errorMessage().isDisplayed());


        }
}
