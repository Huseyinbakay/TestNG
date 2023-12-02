package techproed.tests.day_24_DataProvider_xlmFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.AmazonPage;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_DataProvider {




        @DataProvider
        public static Object[][] isimler() {
            return new Object[][]{


                    {"Ali Can"},{"Hasan Can"},{"Yusuf Can"},{"Kerim Can"}


            };
        }



    @DataProvider(name = "googleUrunler")
    public static Object[][] search() {
        return new Object[][]{


                {"laptop"},{"xiomi"},{"iphone"},{"mustang"},{"tiesto"}


        };
    }

    @DataProvider
    public static Object[][] amazonsearch() {
        return new Object[][]{



                {"laptop"},{"xiomi"},{"iphone"},{"mustang"},{"tiesto"}


        };
    }

    @Test(dataProvider = "isimler")
    public void test01(String data) {

        System.out.println("data = " + data);


    }



    @DataProvider
    public static Object[][] isimvesoyisimler() {
        return new Object[][]{


                {"ali","can"},
                {"veli","can"},
                {"hasan","can"}






        };
    }





    @Test(dataProvider = "isimvesoyisimler")
    public void test02(String isim,String soyisim) {

        System.out.println(isim+"="+soyisim);

    }







    @Test(dataProvider = "googleUrunler")
    public void test03(String data) {

        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
         new GooglePage().searchBox.sendKeys(data, Keys.ENTER);

    }


    @Test(dataProvider = "amazonsearch")
    public void test04(String data) {


        //amazon sayfasına gidelim,

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();

        ReusableMethods.bekle(2);


        new AmazonPage().searcbox.sendKeys(data,Keys.ENTER);
        //aramakutusunda dataprovider'dan gelen verileri aratalım
        //sayfayı kapatınız



      // Driver.getDriver().close();
    }




}
