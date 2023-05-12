package UT.Test;

import UT.Pages.LoginPage;
import UT.Pages.TestInit;
import org.junit.Test;
import org.testng.Assert;

public class SuccessfulLogin extends TestInit {
    @Test
    public void successfulLogin() {
        String login="test@utr.ua";
        String password="H2Xw%gPkeF";

      openUrl("http://order3-dev.utr.ua:5455/ua/login");
        LoginPage lp = new LoginPage(driver);
        lp.inputLogin(login);
        lp.inputPassword(password)
                .clickButton();
        Assert.assertTrue(lp.successfulLogin().isDisplayed());



    }
}
