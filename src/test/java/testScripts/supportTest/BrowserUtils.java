package testScripts.supportTest;

import driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.BasicUtils;

import java.io.IOException;
import java.time.Duration;

public class BrowserUtils {

    WebDriver driver = Driver.getDriver();

    @Parameters("url")
    @BeforeSuite
    public void launchBrowser(){
        Driver.getDriver();
    }

    @AfterSuite
    public void closeBrowser(){
        Driver.closeBrowser();
    }

    @AfterTest
    public void takeShot() throws IOException {
        BasicUtils.takeScreenshot();
    }
}
