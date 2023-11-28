package techproed.tests.day_22_POM;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.pages.TestCenterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.FileNotFoundException;

public class C02_ClassWork {

    @Test
    public void testTech() throws FileNotFoundException {


//https://testcenter.techproeducation.com/index.php?page=form-authentication

       Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));



        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterPage testCenterPage=new TestCenterPage();

        testCenterPage.userName.sendKeys(ConfigReader.getProperty("testUserName"), Keys.TAB);

      String password=  ConfigReader.getProperty("testPassword");

      testCenterPage.password.sendKeys(password);

      testCenterPage.summitButton.click();


        //Sayfadan cikis yap ve cikis yapildigini test et

        SoftAssert softAssert=new SoftAssert();

        ReusableMethods.visibleWait(testCenterPage.logOut,15);

        softAssert.assertTrue(testCenterPage.logOut.isDisplayed());

        testCenterPage.logOut.click();
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Login");

        softAssert.assertAll();
        //sayfayı kapatınız

      Driver.closeDriver();

    }
}
