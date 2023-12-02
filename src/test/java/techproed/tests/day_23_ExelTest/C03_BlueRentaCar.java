package techproed.tests.day_23_ExelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExelRider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C03_BlueRentaCar {


    @Test
    public void test01() {


        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

        BlueRentalPage blueRentalPage=new BlueRentalPage();
        ExelRider exelRider=new ExelRider("src\\test\\java\\techproed\\pages\\resources\\mysmoketestdata (1).xlsx","customer_info");
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(exelRider.getCellData(1,0));
        blueRentalPage.password.sendKeys(exelRider.getCellData(1,1), Keys.ENTER);



    }

    @Test
    public void test02() {

    ExelRider exelRider=new ExelRider("src\\test\\java\\techproed\\pages\\resources\\mysmoketestdata (1).xlsx","customer_info");
    BlueRentalPage blueRentalPage=new BlueRentalPage();

        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        String date= DateTimeFormatter.ofPattern("ddMMMMyyyy_HHmmss").format(LocalDateTime.now());
        String path="C:\\Users\\asus\\IdeaProjects\\Batch189TestNGNT\\src\\test\\java\\techproed\\testOutputs\\ekranGoruntusu\\"+date+"userler.png";


        for (int i = 1; i <6 ; i++) {
            blueRentalPage.login.click();
            blueRentalPage.email.sendKeys( exelRider.getCellData(i,0));
            blueRentalPage.password.sendKeys(exelRider.getCellData(i,1),Keys.ENTER);
            WebElement webElement=Driver.getDriver().findElement(By.id("dropdown-basic-button"));

            try {
                Files.write(Paths.get(path),webElement.getScreenshotAs(OutputType.BYTES));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            blueRentalPage.verifiyLogin.click();
            blueRentalPage.logOut.click();
            blueRentalPage.OK.click();



        }



    }
}
