package techproed.tests.day_23_ExelTest;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExelRider;

public class C03_BlueRentaCar {


    @Test
    public void test01() {


        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage=new BlueRentalPage();
        ExelRider exelRider=new ExelRider("src\\test\\java\\techproed\\pages\\resources\\mysmoketestdata (1).xlsx","customer_info");
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(exelRider.getCellData(1,0));
        blueRentalPage.password.sendKeys(exelRider.getCellData(1,1), Keys.ENTER);





    }

    @Test
    public void test02() {

    ExelRider exelRider=new ExelRider("src\\test\\java\\techproed\\pages\\resources\\mysmoketestdata (1).xlsx","customer_info");
    BlueRentalPage blueRentalPage=new BlueRentalPage();

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


        for (int i = 1; i <7 ; i++) {
            blueRentalPage.login.click();
            blueRentalPage.email.sendKeys( exelRider.getCellData(i,0));
            blueRentalPage.password.sendKeys(exelRider.getCellData(i,1),Keys.ENTER);
            blueRentalPage.verifiyLogin.click();
            blueRentalPage.logOut.click();
            blueRentalPage.OK.click();



        }



    }
}
