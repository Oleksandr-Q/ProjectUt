package UT.Test;

import UT.Pages.LoginPage;
import UT.Pages.TestInit;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPassword extends TestInit {
    String invalidPassword = "H2Xw%gPkeF!!@";
    String login = "test@utr.ua";
    @Test
    public void testInvalidPass(){
        openUrl("http://order3-dev.utr.ua:5455/");
        LoginPage lp = new LoginPage(driver);
        lp.inputLogin(login)
                .inputPassword(invalidPassword)
                .clickButton();
        Assert.assertTrue(lp.errorMessage().isDisplayed());






    }
}
