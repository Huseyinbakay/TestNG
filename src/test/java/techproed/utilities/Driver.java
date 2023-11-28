package techproed.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Driver {



      /*
        POM DE Driver classindaki getDriver methodunun object olusturularak ta erisimini kısıtlamak icin SINGLETON PATTERN
        kullanimi benimsenmistir
         SINGLETON PATTERN ==> tekil kullanim, bir classin baska classlardan objcect olusturularak kullanimini engellemek icin kullanilir
         Default constructor i private yaparak bunu saglariz
         */

     /*
        Driveri her cagirdigimizda yeni bir pencere acmamasi icin, dolapyisiyla test scriptlerimizi yazarken
        hata almamamk icin if block u ile ayarlama yaptik*/


    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }




    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;
        }

    }






}




