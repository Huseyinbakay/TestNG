package techproed.tests.day_24_DataProvider_xlmFiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_DataProvider {
    @DataProvider
    public static Object[][] blueRent() {
        return new Object[][]{


                {"ayhancan@bluerentalcars.com", "ayhan"},
                {"beyhancan@bluerentalcars.com", "beyhan"},
                {"seyhan@bluerentalcars.com", "seyhan"},
                {"johnson@bluerentalcars.com", "johnson"}







        };
    }


    /*
       BlueRentalCar Sayfasına Gidelim
       Login butonuna tıklayalım
       Dataprovider Kullanarak verilen email ve password bilgileri ile login olalım
       Sayfayı kapatalım

           {"ayhancan@bluerentalcars.com", "ayhan"},
          {"beyhancan@bluerentalcars.com", "beyhan"},
          {"seyhan@bluerentalcars.com", "seyhan"},
          {"johnson@bluerentalcars.com", "johnson"}
*/



    @Test(dataProvider = "blueRent")
    public void test01(String email,String password) {

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage=new BlueRentalPage();

        blueRentalPage.login.click();

        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password);

      Driver.closeDriver();


    }
}
