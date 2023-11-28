package techproed.tests.day_22_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class C01_PropertiesTest {

    @Test
    public void test01() throws FileNotFoundException {
       String amazonUrl= ConfigReader.getProperty("amazonUrl");

        System.out.println("amazonUrl = " + amazonUrl);

        Driver.getDriver().get(amazonUrl);


    }

    @Test
    public void test02() throws FileNotFoundException {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim

        //String openUrl=;

        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));

        OpenSourcePage openSourcePage=new OpenSourcePage();

        openSourcePage.username.sendKeys(ConfigReader.getProperty("openSourceUserName"), Keys.TAB);
        //kullanici=Admin
        openSourcePage.password.sendKeys(ConfigReader.getProperty("openSourcePassword"));
        //kullaniciSifre=admin123

        openSourcePage.loginButton.click();

        SoftAssert softAssert=new SoftAssert();



        //Login Testinin basarili oldugunu test edelim
        softAssert.assertTrue( openSourcePage.dashboard.isDisplayed());

        //sayfayı kapatalim

        Driver.closeDriver();

       softAssert.assertAll();



    }


    @Test
    public void testReusable() throws FileNotFoundException {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim



        Driver.getDriver().get(ConfigReader.getProperty("openSourceUrl"));

        OpenSourcePage openSourcePage=new OpenSourcePage();

        openSourcePage.username.sendKeys(ConfigReader.getProperty("openSourceUserName"), Keys.TAB);
        //kullanici=Admin
        openSourcePage.password.sendKeys(ConfigReader.getProperty("openSourcePassword"));
        //kullaniciSifre=admin123

        openSourcePage.loginButton.click();

        SoftAssert softAssert=new SoftAssert();

        ReusableMethods.visibleWait(openSourcePage.dashboard,15);

        //Login Testinin basarili oldugunu test edelim
        softAssert.assertTrue( openSourcePage.dashboard.isDisplayed());

        ReusableMethods.screenShot("openSource");

        ReusableMethods.screenShotOfWebElement(openSourcePage.dashboard);
        //sayfayı kapatalim
        softAssert.assertAll();
        Driver.closeDriver();






    }
}
