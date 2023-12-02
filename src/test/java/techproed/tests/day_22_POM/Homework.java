package techproed.tests.day_22_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Homework {

    BlueRentalPage blueRentalPage=new BlueRentalPage();


    Actions actions;
    @Test
    public void negativeLoginTest() {
/*
        Name:
        US100402_Negative_Login
        Description:
        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
        Acceptance Criteria:
        Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
        Hata Mesaji:
        Bad credentials
        Test Data:
        Customeremail= jack@gmail.com
        Customerpassword= fakepass
        */

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("Customeremail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("Customerpassword"), Keys.ENTER);

       Assert.assertTrue(blueRentalPage.inValidLogin.isDisplayed());


    }


    @Test(dependsOnMethods ="negativeLoginTest" )
    public void negativeReservationtest() {


        actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.UP).perform();
        blueRentalPage.home.click();

        Select select =new Select(blueRentalPage.selectCar);

        select.selectByIndex(5);

        blueRentalPage.dropOf.sendKeys("asdfghj");
        blueRentalPage.pickUp.sendKeys("dfghj");
        blueRentalPage.pickUpDate.sendKeys(DateTimeFormatter.ofPattern("ddMMyyyy").format(LocalDate.now().minusDays(3)));
        blueRentalPage.pickUpTime.sendKeys(DateTimeFormatter.ofPattern("HHmmss").format(LocalDateTime.now().minusHours(2)));
        blueRentalPage.dropOffDate.sendKeys(DateTimeFormatter.ofPattern("ddMMyyyy").format(LocalDate.now().minusDays(10)));
        blueRentalPage.dropOffTime.sendKeys(DateTimeFormatter.ofPattern("HHmmss").format(LocalDateTime.now().minusHours(2)));
        blueRentalPage.reservation.click();

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(blueRentalPage.pleaseLoginAlert));
        Assert.assertTrue(blueRentalPage.pleaseLoginAlert.isDisplayed());

       /*
        Name:

        US101201_Negative_Login
        Description:
        Geçerli giriş yapmadan rezervasyon yapamamalı
        Acceptance Criteria:
        Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
        Ve giris yapilmadiginda
        Hata mesaji almali : Please first login
        Giris yapildiginda hata mesaji alınmamalı


*/

    }
}
