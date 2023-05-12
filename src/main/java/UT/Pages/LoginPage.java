package UT;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage inputLogin(String login) {
        findElementByXpath("//input[@formcontrolname='username']").sendKeys(login);
        return this;
    }

    public LoginPage inputPassword(String password) {
        findElementByXpath("//input[@formcontrolname='password']").sendKeys(password);
        return this;

    }

    public LoginPage clickButton() {
        findElementByXpath("//span[@class='mat-button-wrapper']").click();
        return this;
    }

public LoginPage forgotPassword(){
        findElementByXpath("")

    }

}

