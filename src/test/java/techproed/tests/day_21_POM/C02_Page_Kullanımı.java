package techproed.tests.day_21_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.utilities.Driver;

public class C02_Page_Kullanımı {


    @Test
    public void test01() {

        ///amazona git

        Driver.getDriver().get("https://amazon.com");


        //iphone arattır

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.searcbox.sendKeys("iphone", Keys.ENTER);


    }
}
