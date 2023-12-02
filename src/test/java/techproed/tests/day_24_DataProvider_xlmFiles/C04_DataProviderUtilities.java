package techproed.tests.day_24_DataProvider_xlmFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.DataProviderPage;
import techproed.utilities.DataProviderUtilites;
import techproed.utilities.Driver;

public class C04_DataProviderUtilities {


    @Test(dataProvider = "positiveTestData",dataProviderClass = DataProviderUtilites.class)
    public void test01(int age) {


        //https://dataprovider.netlify.app/ adresine gidelim

        Driver.getDriver().get("https://dataprovider.netlify.app/");


        //BlackBoxTesting techniques ile otomasyon test yapalim

        DataProviderPage dataProviderPage=new DataProviderPage();


        dataProviderPage.ageSearchBox.sendKeys(age+"", Keys.TAB,Keys.ENTER);

       String verify= dataProviderPage.verifiyMessage.getText();
        Assert.assertTrue(dataProviderPage.verifiyMessage.isDisplayed());

    }


    @Test(dataProvider = "negativeTestData",dataProviderClass = DataProviderUtilites.class
    )
    public void test02(int age) {


        Driver.getDriver().get("https://dataprovider.netlify.app/");


        //BlackBoxTesting techniques ile otomasyon test yapalim

        DataProviderPage dataProviderPage=new DataProviderPage();


        dataProviderPage.ageSearchBox.sendKeys(age+"", Keys.TAB,Keys.ENTER);

        String verify= dataProviderPage.verifiyMessage.getText();
        Assert.assertTrue(dataProviderPage.verifiyMessage.isDisplayed());


    }
}


