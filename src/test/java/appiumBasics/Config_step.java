package appiumBasics;

import App_Pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Config_step {
    DesiredCapabilities caps;
    AndroidDriver<AndroidElement> driver;
    HomePage homePage;
    @BeforeClass
    public void config() throws MalformedURLException, InterruptedException {
        //basic data

        caps=new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion","6.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"LHTDU17920001765");

        //install and open new app with apk

         File app=new File("Apps/testapp.apk");
         caps.setCapability("app",app.getAbsolutePath());

        // open existing app

       // cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.whatsapp.HomeActivity");
        //cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.whatsapp");

        //open browser in mobile

         //cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        // WebDriverManager.chromedriver().setup();
        // cap.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getBinaryPath());
        // driver.get("https://www.google.com.eg/webhp?tab=rw1");

        //execute

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        homePage=new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       // driver.findElement(By.xpath("(//android.view.ViewGroup)[3]")).click();
        // Thread.sleep(3000);
       //driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).sendKeys("abdo");
    }
    @AfterMethod
    public void takePhoto() throws IOException {
        File snapShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(snapShot,new File("images/testcase.png"));
    }
    @AfterClass
    public void tearDown(){
          driver.quit();
        //driver.lockDevice();
       // driver.unlockDevice();
    }
}
