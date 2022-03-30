package testScripts;

import driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.awt.*;
import java.io.IOException;

public class GooglePage {
    String url = "https://www.google.com";

    @BeforeClass
    public void beforeClass(){
        Driver.initializeChrome();
        Driver.launchBrowserToUrl(url);
    }

    @Test
    public void gotoGoogle() throws IOException, AWTException {
        HomePage pg = new HomePage();
        pg.enterText();
    }

    @AfterClass
    public void tearDown(){
//        Driver.closeBrowser();
    }
}
