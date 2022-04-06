package pageObjects;

import driverFactory.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LogInObject {

    WebDriver driver = Driver.getDriver();

    public static By userId = By.name("uid");
    public static By pass = By.name("password");
    public static By logInBtn = By.name("btnLogin");
    public static By resetBtn = By.name("btnReset");



}
