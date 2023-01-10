package App_Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChromeBrowser_Page extends PageBase{
    public ChromeBrowser_Page(AndroidDriver driver){
        super(driver);
    }
    private By enterNameField= By.xpath("//android.widget.EditText[@text='Enter your name here!']");
    private By selectCar=By.xpath("//android.view.View");
    private By selectionItems=By.xpath("//android.widget.CheckedTextView");
    private By sendName_btn=By.xpath("//android.widget.Button[@text='Send me your name!']");
    public void setEnterName(String text){
       setText(enterNameField,text);
    }
    public void select_preferCar(int index){
        click(selectCar);
        List<AndroidElement> items=driver.findElements(selectionItems);
        items.get(index).click();
    }
    public SayingHello_page click_Send_btn(){
        click(sendName_btn);
        return new SayingHello_page(driver);
    }

}
