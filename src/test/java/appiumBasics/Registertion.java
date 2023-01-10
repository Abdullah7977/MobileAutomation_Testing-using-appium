package appiumBasics;

import App_Pages.HomePage;
import com.github.javafaker.Faker;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Registertion extends Config_step {
    Faker fake=new Faker();
    String userName=fake.name().username();
    String name=fake.name().name();
    String email=fake.internet().emailAddress();
    String password=fake.internet().password();
    @Test
    public void register() throws MalformedURLException {
    var register_obj =homePage.startRegister();

    var result_register=register_obj.register(userName,email,password,name,4);
     String actualUserName=result_register.verify_register();
        Assert.assertEquals(actualUserName,userName);
        result_register.confirmRegister();
    }
}
