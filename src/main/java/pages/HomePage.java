package pages;

import driverFactory.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePageObjects;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;

public class HomePage extends HomePageObjects {
    WebDriver driver = null;

    public void enterText() throws AWTException, IOException {
        driver = Driver.initializeChrome();
        WebElement SearchBox = driver.findElement(HomePageObjects.searchBox);


        By signIn = By.xpath("//a[contains(@href,'https://accounts.google.com')]");
        WebElement SignIn = driver.findElement(signIn);
        String color = SignIn.getCssValue("border");
        System.out.println(color);



        Actions actions = new Actions(driver);
        actions
//                moveToElement(SearchBox)
//                .contextClick().perform();
                .keyDown(Keys.SHIFT)
                .sendKeys("ISRO-Chairman")
                .keyUp(Keys.SHIFT)
                .sendKeys(""+Keys.ENTER).build().perform();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,100)");
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement html = driver.findElement(By.xpath("//body"));


        js.executeScript("window.open()", "https://www.facebook.com" );

        actions.moveToElement(html)
                .keyDown(Keys.CONTROL)
                .sendKeys("T")
                .keyUp(Keys.CONTROL)
                .build().perform();


//        SearchBox.sendKeys("ISRO-Sivan");
//        SearchBox.sendKeys(""+ Keys.ENTER);
        String url = driver.getCurrentUrl();
        System.out.print("URL : "+url);

        System.out.println("Window Handle"+driver.getWindowHandle());
        System.out.println("Window Handles"+driver.getWindowHandles());
        
        Set<String> lis = driver.getWindowHandles();

        TakesScreenshot shot = ((TakesScreenshot) driver);
        File file  = shot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./newpic2.jpeg"));

//        FluentWait wait = new FluentWait();
//        wait.withTimeout(10)
//                .pollingEvery(1,TimeUnit.SECONDS);

//        driver.navigate().refresh();
//        driver.quit();

    }


}
