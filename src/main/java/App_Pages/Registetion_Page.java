package App_Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Registetion_Page extends PageBase{

   public Registetion_Page(AndroidDriver<AndroidElement> driver){
       super(driver);
   }
    private By userName=By.id("io.selendroid.testapp:id/inputUsername");
    private By Email=By.id("io.selendroid.testapp:id/inputEmail");
    private By Password=By.id("io.selendroid.testapp:id/inputPassword");
    private By Name=By.id("io.selendroid.testapp:id/inputName");
    private By selection=By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
     List<AndroidElement> items;
     private By addAccept=By.id("io.selendroid.testapp:id/input_adds");
     private By reg_btn=By.id("io.selendroid.testapp:id/btnRegisterUser");

    public Result_registertion register(String username,String email,String password,String name,int item ){
       setText(userName,username);
       setText(Email,email);
       setText(Password,password);
       setText(Name,name);
       driver.hideKeyboard();
       //selection=driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Programming Languge\"))"));
        click(selection);
        items=driver.findElementsByClassName("android.widget.CheckedTextView");
        items.get(item).click();
        click(addAccept);
        click(reg_btn);
        return new Result_registertion(driver);
    }
}
