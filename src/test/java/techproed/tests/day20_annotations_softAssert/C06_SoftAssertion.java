package techproed.tests.day20_annotations_softAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C06_SoftAssertion {


WebDriver driver;


    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }


    @Test
    public void test01() {

//SoftAssertion için önce obje olustur

        SoftAssert softAssert=new SoftAssert();



// 1- amazon anasayfaya gidin
        driver.get("https://amazon.com");

        // 2- title'in  Amazon icerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));;


        // 3- Arama kutusunun erisilebilir oldugunu test edin

        WebElement webElement=driver.findElement(By.id("twotabsearchtextbox"));

        softAssert.assertTrue(webElement.isEnabled(),"Arama kutusuna erişim yok");

        // 4- arama kutusuna selenium yazip aratin

        webElement.sendKeys("Selenium", Keys.ENTER);

        // 5- arama yapildigini test edin
        WebElement sonuc=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        softAssert.assertTrue(sonuc.isDisplayed(),"Arama yapılamadı");


        // 6- arama sonucunun selenium icerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Selenium"),"Aramada selenium yok");

        softAssert.assertAll();

        driver.quit();






    }
}
