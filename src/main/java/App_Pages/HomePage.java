package App_Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends PageBase {

   private By startRegister=By.id("io.selendroid.testapp:id/startUserRegistration");
   private By chrome_btn=By.id("io.selendroid.testapp:id/buttonStartWebview");
    public HomePage(AndroidDriver<AndroidElement> driver){
        super(driver);
    }
    AndroidElement startRegistertion;
    public Registetion_Page startRegister(){

        click(startRegister);
       return new Registetion_Page(driver);
    }
    public ChromeBrowser_Page click_chrome_btn(){
        click(chrome_btn);
        return new ChromeBrowser_Page(driver);
    }
}
