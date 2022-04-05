package testScripts.supportTest;

import driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BasicUtils;

public class AssertionUtils {

    @Test
    @Parameters("title")
    public void checkPageTitle(String expTitle){
        String actTitle = BasicUtils.getTitle();
        Assert.assertEquals(actTitle,expTitle);
        Reporter.log("Fail");
    }

    @Parameters("alertMsg")
    @Test
    public void checkAlertMsg(String expMsg) {
        if(ExpectedConditions.alertIsPresent() != null){
            String actMsg = BasicUtils.getAlertMsg();
            Assert.assertEquals(actMsg,expMsg);
        }
        else {
            Assert.assertTrue(false,"Alert message doesn't appears");
        }
    }
}
