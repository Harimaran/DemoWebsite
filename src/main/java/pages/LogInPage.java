package pages;

import driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.LogInObject;

public class LogInPage extends LogInObject{

    WebDriver driver = Driver.getDriver();

    public void enterUserId(String user){
        WebElement UserId = driver.findElement(LogInObject.userId);
        UserId.sendKeys(user);
    }

    public void enterPass(String pass){
        WebElement Pass = driver.findElement(LogInObject.pass);
        Pass.sendKeys(pass);
    }


    public void clickLogInBtn(){
        WebElement LogInBtn = driver.findElement(LogInObject.logInBtn);
        LogInBtn.click();
    }

    public void clickResetBtn(){
        WebElement ResetBtn = driver.findElement(LogInObject.resetBtn);
        ResetBtn.click();
    }
}
