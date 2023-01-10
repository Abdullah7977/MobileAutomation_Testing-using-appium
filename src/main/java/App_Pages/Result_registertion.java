package App_Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class Result_registertion extends PageBase {

    public Result_registertion(AndroidDriver<AndroidElement> driver){
        super(driver);
    }
   private By verifyUserName= By.id("io.selendroid.testapp:id/label_username_data");
    private By confirm_Regiter_btn=By.xpath("//android.widget.Button[@text='Register User']");
    public String verify_register(){
        AndroidElement text=driver.findElement(verifyUserName);
       String actual_userName=text.getText();
       return actual_userName;
    }
    public void confirmRegister(){
       click(confirm_Regiter_btn);

    }
}
