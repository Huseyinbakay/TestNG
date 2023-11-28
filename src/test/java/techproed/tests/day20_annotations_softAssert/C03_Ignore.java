package techproed.tests.day20_annotations_softAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_Ignore {



    WebDriver driver;
    @BeforeMethod()
    public void setUp() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }


    //Priority ile test çalışma sırasını belirleyebilirsin.Eğer yazmassan priority defult olarak 0 dır.


    @Test(enabled =true)//Enabled false o methodu devre dısı bırakmak gibidir.
    public void youtubeTest() {

        driver.get("https://youtube.com");

    }

    @Ignore
    @Test(priority = 2)
    public void amazonTest() {

        driver.get("https://amazon.com");

    }




    //prioritysi en kücük olan test methodu bu oldugu icin en önce bu calisti
    @Test(priority = -1)
    public void facebookTest() {

        driver.get("https://facebook.com");

      throw  new SkipException("Exel dosya bağlantısında veri bulunamadı");

      /*
      Bu testte skip exeption var.Runtime de atlama yapılıyor.Test raporlarında test atlandı olarak işaretlenir.
      Testi atlamak istiyorsan bunu kullanabilirsin
       Bu testte SkipException kullanarak testin calistirilmasini run time da dynamic olarak durdurabiliriz
        SkipException firlatildiginda test "Skipped" olarak isaretlenir
        dolayisiyla bu yöntem testin belirli kosullar altinda atlanmasi gerektiginde kullanilabilir
         */


    }





    @AfterMethod
    public void tearDown() {

     driver.quit();

    }
}
