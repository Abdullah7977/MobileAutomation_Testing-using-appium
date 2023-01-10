package appiumBasics;

import App_Pages.SayingHello_page;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChrome_btn extends Config_step{
    Faker faker=new Faker();
    @Test
    public void chrome_Test(){
        var chrome_obj =homePage.click_chrome_btn();
        String expectedResult=faker.name().name();
        chrome_obj.setEnterName(expectedResult);
        chrome_obj.select_preferCar(2);
        SayingHello_page verifyName =chrome_obj.click_Send_btn();
        String actualResult=verifyName.verifyName();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
