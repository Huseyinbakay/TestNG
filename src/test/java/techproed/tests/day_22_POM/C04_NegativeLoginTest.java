package techproed.tests.day_22_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C04_NegativeLoginTest {

    @Test
    public void test01() throws FileNotFoundException {
        //Name:
        //US100208_Negative_Login
        //Description:
        //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        //Acceptance Criteria
        //Customer email: fake@bluerentalcars.com
        //Customer password: fakepass
        //Error:
        //User with email fake@bluerentalcars.com not found


        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage=new BlueRentalPage();

        blueRentalPage.login.click();

        blueRentalPage.email.sendKeys(ConfigReader.getProperty("fakeEmail"));


        blueRentalPage.password.sendKeys(ConfigReader.getProperty("fakePwd"), Keys.ENTER);

        Assert.assertTrue(blueRentalPage.alertNegative.isDisplayed());


    }







}
