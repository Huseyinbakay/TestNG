package techproed.tests.day_21_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.Driver;

public class C03_PageKullanım {

    @Test
    public void test01() {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");




        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim login olalım

        OpenSourcePage openSourcePage=new OpenSourcePage();

        openSourcePage.username.sendKeys("Admin");
        openSourcePage.password.sendKeys("admin123");
        openSourcePage.loginButton.click();


        //kullanici=Admin
        //kullaniciSifre=admin123
        //Login Testinin basarili oldugunu test edelim



        Assert.assertTrue(openSourcePage.dashboard.isDisplayed());


        Driver.closeDriver();
        //sayfayı kapatalim








    }
}
