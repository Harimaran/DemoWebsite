package testScripts;

import driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LogInPage;

public class LogInScenarios {

    LogInPage logInPage;

    @Parameters({"url","user","pass"})
    @Test(priority = 0)
    public void enterCredentials(String url, String user, String pass){
        Driver.launchUrl(url);
        logInPage = new LogInPage();
        logInPage.enterUserId(user);
        logInPage.enterPass(pass);
    }

    @Test(priority = 1)
    public void clickLogIn(){
        logInPage.clickLogInBtn();
    }

    @Test(priority = 2)
    public void clickResetBtn(){
        logInPage.clickResetBtn();
    }

}
