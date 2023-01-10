package App_Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    protected static AndroidDriver<AndroidElement> driver;
    protected static WebDriverWait wait;

    public PageBase(AndroidDriver<AndroidElement> driver) {

        this.driver=driver;
        wait=new WebDriverWait(driver,30);

    }

    public static void setText(By element, String text) {

        WebElement wl =wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
        wl.clear();
        wl.sendKeys(text);
    }

    public static void click(By element) {

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element))).click();

    }
    public static void selectFromDropDownByIndex(By element,int index) {

        new Select(wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)))).selectByIndex(index);


    }

}
