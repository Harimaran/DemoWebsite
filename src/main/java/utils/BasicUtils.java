package utils;

import driverFactory.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class BasicUtils {

    static WebDriver driver = Driver.getDriver();

    public static String getAlertMsgAndAccept() throws InterruptedException {
//        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
        String actMsg = null;
        if (ExpectedConditions.alertIsPresent() != null) {
            Alert alert = driver.switchTo().alert();
            actMsg = driver.switchTo().alert().getText();
            alert.accept();
        }
        return actMsg;
    }

    public static String getTitle(){
        return driver.getTitle();
    }

    public static String getValueInElement(WebElement element){
        return element.getText();

    }

    public static void takeScreenshot() throws IOException {
        TakesScreenshot shot = ((TakesScreenshot) driver);
        File src = shot.getScreenshotAs(OutputType.FILE);
        File dst = new File("./test-output/screenshots/tc.png");
        FileUtils.copyFile(src,dst);
    }

}
