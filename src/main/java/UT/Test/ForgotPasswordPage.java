package UT.Test;

import UT.Pages.LoginPage;
import UT.Pages.TestInit;
import org.testng.annotations.Test;

public class ForgotPasswordPage extends TestInit {
    @Test
    public void test(){
        openUrl("http://order3-dev.utr.ua:5455/ua/password-recover");
        LoginPage lp=new LoginPage(driver);

    }

}
