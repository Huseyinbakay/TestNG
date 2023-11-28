package techproed.tests.day20_annotations_softAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependOnMethods {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() {

      //  amazona git

        driver.get("https://amazon.com");
        driver.navigate().refresh();
        //aram kurusuna iphone yaz
        WebElement textbox=driver.findElement(By.id("twotabsearchtextbox"));
        textbox.sendKeys("iphone", Keys.ENTER);
        Assert.assertTrue(2==3);

        //sonuc yazısının iphone içerdiğini test et
    }





    //DependsOnMethods===>>>Bunu yaparak iki methodu birbirine bağlayabilirsin

    @Test(dependsOnMethods ="test01")
    public void test02() {

        //sonuc yazısının iphone içerdiğini test et

        WebElement sonuc=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));

        Assert.assertTrue(sonuc.getText().contains("iphone"));
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
