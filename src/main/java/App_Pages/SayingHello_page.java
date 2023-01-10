package App_Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class SayingHello_page extends PageBase{
    public SayingHello_page(AndroidDriver driver){
        super(driver);
    }
    private By name= By.xpath("//android.widget.TextView[@text='Your name is:']/following-sibling::android.widget.TextView[1]\t\n");
    public String verifyName(){
        AndroidElement actualElemnt=driver.findElement(name);
        String actualName=actualElemnt.getText();
        return actualName;
    }
}
