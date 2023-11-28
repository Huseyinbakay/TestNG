package techproed.tests.day_22_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.FileNotFoundException;

public class C03_PositiveLoginTest {

    @Test
    public void test01() throws FileNotFoundException, InterruptedException {

        //Name: US100201_Admin_Login
        //Description:
        //Admin bilgileriyle giriş
        //Acceptance Criteria:

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        BlueRentalPage blueRentalPage=new BlueRentalPage();

        blueRentalPage.login.click();

        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalemail"));
        Thread.sleep(2000);
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPwd"), Keys.ENTER);


        //Admin olarak, uygulamaya giriş yapabilmeliyim
        //email : ada@ada.com
        //password: 12345
        //https://www.bluerentalcars.com/





    }
}
