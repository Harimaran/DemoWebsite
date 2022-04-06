package utils;

import driverFactory.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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

}
