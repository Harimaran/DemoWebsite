package testScripts.supportTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BasicUtils;

public class AssertionUtils {

    @Test
    @Parameters("title")
    public void checkPageTitle(String expTitle){
        String actTitle = BasicUtils.getTitle();
        Assert.assertEquals(actTitle,expTitle);
    }

    @Parameters("alertMsg")
    @Test
    public void checkAlertMsg(String expMsg) throws InterruptedException {
        if(ExpectedConditions.alertIsPresent() != null){
            String actMsg = BasicUtils.getAlertMsgAndAccept();
            System.out.println("Error Message : "+actMsg);
            Assert.assertEquals(actMsg,expMsg);
        }
        else {
            Assert.assertTrue(false,"Alert message doesn't appears");
        }
    }

    @Test
    public void compareValue(WebElement element, String expected){
        String actual = BasicUtils.getValueInElement(element);
        Assert.assertEquals(actual,expected);
    }

}
