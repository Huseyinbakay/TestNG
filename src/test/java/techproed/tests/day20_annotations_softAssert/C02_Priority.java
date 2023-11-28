package techproed.tests.day20_annotations_softAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Priority {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }


  //Priority ile test çalışma sırasını belirleyebilirsin.Eğer yazmassan priority defult olarak 0 dır.


    @Test(priority = 3)
    public void youtubeTest() {

        driver.get("https://youtube.com");

    }


    @Test(priority = 2)
    public void amazonTest() {

        driver.get("https://amazon.com");

    }


    //prioritysi en kücük olan test methodu bu oldugu icin en önce bu calisti
    @Test(priority = -1)
    public void facebookTest() {

        driver.get("https://facebook.com");


    }






}
